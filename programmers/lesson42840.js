//https://school.programmers.co.kr/learn/courses/30/lessons/42840?language=javascript

function solution(answers) {
  var answer = [];
  const first = [1, 2, 3, 4, 5];
  const second = [2, 1, 2, 3, 2, 4, 2, 5];
  const third = [3, 3, 1, 1, 2, 2, 4, 4, 5, 5];

  const scores = [0, 0, 0];

  answers.map((answer, i) => {
    if (answer === first[i % first.length]) score[0]++;
    if (answer === second[i % second.length]) score[1]++;
    if (answer === third[i % third.length]) score[2]++;
  });

  const max = Math.max(...scores);
  scores.map((score, i) => {
    if (score === max) answer.push(i + 1);
  });

  return answer;
}

const mock = [1, 2, 3, 4, 5];

const result = solution(mock);

console.log(result);
