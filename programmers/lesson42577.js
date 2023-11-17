// https://school.programmers.co.kr/learn/courses/30/lessons/42577
//다시 풀기...

//내가 짠 로직...그냥 무한 루프 돌리기->시간 초과...
function solution(phone_book) {
  var answer = true;
  phone_book.sort((a, b) => a.length - b.length);

  for (let i = 0; i < phone_book.length; i++) {
    for (let j = i + 1; j < phone_book.length; j++) {
      if (phone_book[j].indexOf(phone_book[i]) === 0) {
        answer = false;
        break;
      }
    }
  }

  return answer;
}

function solution2(phone_book) {
  phone_book.sort((a, b) => a.length - b.length);
  for (let i = 0; i < phone_book.length - 1; i++) {
    if (
      phone_book[i] === phone_book[i + 1].substring(0, phone_book[i].length)
    ) {
      return false;
    }
  }

  return true;
}

const mock = ["12", "123", "1235", "567", "88"];

const mock2 = ["123", "456", "789"];
const mock3 = ["119", "97674223", "5524421119"];

const result = solution(mock3);

console.log(result);
