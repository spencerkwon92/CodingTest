import java.util.*;

public class Lesson1845 {
    public int solution(int[] nums) {
      int answer = 0;
      int numToChoose = nums.length /2;
      Set<Integer> set = new HashSet<>();
      for (int ele:nums){
        set.add(ele);
      } // 해쉬셋은 중복을 허용하지 안음...그래서 모두 넣고 중복을 제거하면 고유한 숫자만 남음 
      int setSize = set.size();
      
      // if (setSize > numToChoose){
      //   answer = numToChoose;
      // }else {
      //   answer = setSize;
      // }

      setSize > numToChoose? answer = numToChoose : answer = setSize;

      return answer;
    }

    public static void main(String[] args) {
      Lesson1845 lesson = new Lesson1845();
      int[] numbers = {3,2,1,4,4,7,3,8};
      int result = lesson.solution(numbers);

      System.out.println(result);
    }
}