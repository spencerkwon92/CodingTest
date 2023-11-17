//https://school.programmers.co.kr/learn/courses/30/lessons/42748?language=javascript

function solution(array, commands) {
  let answer = [];

  commands.map((command) => {
    const arraySlice = array
      .slice(command[0] - 1, command[1])
      .sort((a, b) => a - b);
    answer.push(arraySlice[command[2] - 1]);
  });

  return answer;
}

const result = solution(
  [1, 5, 2, 6, 3, 7, 4],
  [
    [2, 5, 3],
    [4, 4, 1],
    [1, 7, 3],
  ]
);

console.log(result);
