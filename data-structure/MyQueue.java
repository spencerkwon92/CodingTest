import java.util.*;

public class MyQueue {

  LinkedList<Object> queue;

  MyQueue(){
    this.queue = new LinkedList<>();
  }

  public boolean isEmpty(){
    return queue.isEmpty();
  }

  public void push(Object data){
    queue.addLast(data);
  }
  
  public Object pull(){
    Object value = queue.get(0);
    queue.remove(0);
    return(value);
  }

  public void printQueue(){
     for (Object ele : queue) {
        System.out.print(ele+",");
      }
  }
 
  public static void main(String[] args){
    MyQueue que = new MyQueue();

    que.push(10);
    que.push(30);
    que.push(100);
    
    System.out.println(que.pull());
    System.out.println(que.pull());
    que.push(30);


    que.printQueue();

  }

}
