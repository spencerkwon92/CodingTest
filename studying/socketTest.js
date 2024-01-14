const socketUrl = "wss://socketsbay.com/wss/v2/1/demo/";
let socket;
let lastPingTime;

function connect() {
  socket = new WebSocket(socketUrl);

  socket.onopen = function () {
    console.log("Socket connected");
    sendPing();
  };

  socket.onmessage = function (event) {
    const message = JSON.parse(event.data);
    if (message.op === "pong") {
      const pongTime = new Date(message.args[0]);
      const timeDiff = pongTime - lastPingTime;
      console.log(`Pong received, time difference: ${timeDiff} ms`);

      if (timeDiff > 5000) {
        console.log("Time difference exceeded 5 seconds, reconnecting...");
        socket.close();
        connect();
      } else {
        setTimeout(sendPing, 2000); // Wait for 2 seconds before sending next ping
      }
    }
  };

  socket.onerror = function (error) {
    console.log(`WebSocket Error: ${error}`);
  };

  socket.onclose = function () {
    console.log("Socket closed. Attempting to reconnect...");
    setTimeout(connect, 3000); // Attempt to reconnect after 3 seconds
  };
}

function sendPing() {
  lastPingTime = new Date();
  socket.send(JSON.stringify({ op: "ping", args: [lastPingTime.toJSON()] }));
}

connect();
