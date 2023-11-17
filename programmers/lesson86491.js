//https://school.programmers.co.kr/learn/courses/30/lessons/86491

function solution(sizes) {
  var answer = 0;
  let maxW = 0;
  let maxH = 0;
  sizes.map((size) => {
    size.sort((a, b) => b - a);
    if (size[0] > maxW) maxW = size[0];
    if (size[1] > maxH) maxH = size[1];
  });
  answer = maxW * maxH;
  return answer;
}

const mockSize = [
  [14, 4],
  [19, 6],
  [6, 16],
  [18, 7],
  [7, 11],
];

const result = solution(mockSize);

console.log(result);
