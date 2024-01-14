import java.util.*;

class Lesson12909{
    boolean solution(String s) {
      boolean answer = true;
      // String[] arr = s.split("");
      Stack<Character> stc = new Stack<>();
      for(int i=0; i<s.length(); i++){
        if(s.charAt(i) == '('){
          stc.push('(');
        }else{
          if(stc.empty()) return false;
          stc.pop();
        }
      }




      // for(int i=0; i<arr.length; i++){
      //   String tar = arr[i];
      //   if(i==0&&tar.equals(")")){
      //     answer = false;
      //     break;
      //   }

      //   if(tar.equals("(")){
      //     stc.push(tar);
      //   }else{
      //     if(!stc.empty()){
      //       stc.pop();
      //     }
      //   }
      // }
      // for(String ele:arr){
      //   if(ele.equals("(")){
      //     stc.push(ele);
      //   }else{
      //     stc.pop();
      //     // if(!stc.empty()){
      //     //   stc.pop();
      //     // }
      //   }
        
      // }

      if(!stc.empty()) answer = false;

      return answer;
  }

  public static void main(String[] args) {
    Lesson12909 lesson12909 = new Lesson12909();
    String s = "(()(";
    boolean result = lesson12909.solution(s);
    System.out.println(result);
  }
}