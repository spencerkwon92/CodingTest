import java.util.*;

class Lesson42577 {
  public boolean solution(String[] phone_book) {
    Map<String, Integer> map = new HashMap<>();
    for(int i=0; i<phone_book.length; i++) {
      map.put(phone_book[i], i);
    }

    for (int i=0; i<phone_book.length; i++){
      String target = phone_book[i];
      for(int j=0; j<target.length(); j++){
        if(map.containsKey(target.substring(0, j))) return false;
      }
    }

    return true;
  }

  public static void main(String[] args) {
    Lesson42577 lesson = new Lesson42577();
    String[] ph= {"119", "97674223", "1195524421"};
    
    boolean result = lesson.solution(ph);
    System.out.println(result);

  }
}