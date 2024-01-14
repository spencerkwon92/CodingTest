import Profile from "./components/Profile.js";

console.log("App is Starting!!");

class App {
  //State!!
  $target = null;
  data = [];
  constructor($target) {
    this.$target = $target;

    this.profile = new Profile({
      $target,
    });
  }

  setState() {
    console.log("this is setState!");
  }
}

export default App;
