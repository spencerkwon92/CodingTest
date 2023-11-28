class MinHeap {
  constructor() {
    this.heap = [];
  }

  peek() {
    return this.heap[0];
  }

  showHeap() {
    return this.heap;
  }

  push(value) {
    this.heap.push(value);
    this.heap.sort((a, b) => a - b);
  }

  pop() {
    return this.heap.shift();
  }
}

const mixing = (arr) => {
  const newArr = arr.sort((a, b) => b - a);
  const mixValue = newArr.pop() + newArr.pop() * 2;
  newArr.push(mixValue);
  newArr.sort((a, b) => b - a);
  return newArr;
};

function solution(scoville, K) {
  var answer = 0;
  const minHeap = new MinHeap();

  scoville.forEach((value) => minHeap.push(value));

  while (minHeap.peek() < K) {
    const newValue = minHeap.pop() + minHeap.pop() * 2;
    minHeap.push(newValue);
    answer++;
  }

  return answer;
}

// console.log(mix([1, 2, 3, 9, 10, 12]));
console.log(solution([1, 2, 3, 9, 10, 12], 7));
//라이브러리가 있으면 쉽게 풀 수 있는 문제...
