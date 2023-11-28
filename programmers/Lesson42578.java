import java.util.*;

class Lesson42578 {

  public int solution(String[][] clothes) {
      int answer = 0;
      Map<String, Integer> map = new HashMap<>();

      for(String[] ele: clothes) {
        if (map.containsKey(ele[1])){
          map.put(ele[1], map.get(ele[1]) + 1);
        }else{
          map.put(ele[1],1);
        }
      }
      Set<String> keys = map.keySet();
      
      int trialNum = 1;
      for(String key: keys){
        trialNum *= (map.get(key)+1);
      }

      answer += (trialNum-1);

      return answer;
  }

  public static void main(String[] args) {
    Lesson42578 lesson = new Lesson42578();
    String[][] clothes = {{"yellow_hat", "headgear"}, {"blue_sunglasses", "eyewear"}, {"green_turban", "headgear"}};
    
    int result = lesson.solution(clothes);

    System.out.println(result);

  }
}