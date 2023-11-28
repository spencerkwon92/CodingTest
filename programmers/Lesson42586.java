import java.util.*;

class Lesson42586 {
  public ArrayList<Integer> solution(int[] progresses, int[] speeds) {
      ArrayList<Integer> answer = new ArrayList<>();
      int[] daysToComplete = new int[progresses.length];

      for (int i=0; i<daysToComplete.length; i++){
        int days = (100-progresses[i])/speeds[i];
        daysToComplete[i] = (100-progresses[i])%speeds[i] == 0 ? days : days+1;
      }
      int deploy = 0;
      int max = daysToComplete[0];

      for (int i=0; i<daysToComplete.length; i++){
        if (daysToComplete[i]>max){
          answer.add(deploy);
          deploy = 1;
          max = daysToComplete[i];
        }else{
          deploy++;
        }
      }
      answer.add(deploy);

      // for(int i=0; i<daysToComplete.length; i++){
      //   if(i==daysToComplete.length-1){
      //     deploy++;
      //     answer.add(deploy);
      //     deploy = 0;
      //   }else{
      //     if (daysToComplete[i]<daysToComplete[i+1]){
      //       deploy++;
      //       answer.add(deploy);
      //       deploy = 0;

      //     }else if(daysToComplete[i]>=daysToComplete[i+1]){
      //       deploy++;
      //     }
      //   }
      // }

      
      return answer;
  }

  public static void main(String[] args) {
    Lesson42586 lesson = new Lesson42586();
    int[] progresses = {93, 30, 55};
    int[] speeds = {1, 30, 5};
    
    ArrayList<Integer> result = lesson.solution(progresses, speeds);
    // int[] test = {};

    // System.out.println(test[0]);
    System.out.println(result);

  }
}
