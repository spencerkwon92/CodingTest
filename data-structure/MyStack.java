import java.util.*;

class MyStack {
    int size;
    int top; // pointer...
    Object[] stack;

    public MyStack(int size){
        this.size=size;
        this.top = -1;
        this.stack = new Object[size];
    }

    public boolean isEmpty () {
        return top == -1;
    }

    public boolean isFull(){
        return top == stack.length - 1;
    }

    public void push(int data) {
        if(isFull()) throw new ArrayIndexOutOfBoundsException();

        stack[++top] = data;
    }

    public Object pop(){
        if(isEmpty()) throw new ArrayIndexOutOfBoundsException();
        Object data = stack[top];
        stack[top--] = null;
        return data;
    }

    public void printStack(){
        if(isEmpty()) throw new ArrayIndexOutOfBoundsException();
        
        System.out.println(Arrays.toString(stack));
    }

    
    public static void main (String[] args){
        MyStack stack = new MyStack(10);

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.printStack();
        System.out.println(stack.top);
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        stack.printStack();
        System.out.println(stack.top);


        System.out.println(stack.pop());
        stack.printStack();

    }
}