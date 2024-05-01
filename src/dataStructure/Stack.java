package dataStructure;

public class Stack {

    private static final int MAX = 2; //maximum capacity of stack
    int[] stack = new int[MAX];
    private int stackTop = -1;

    public int size(){
        return stackTop+1;
    }

    public boolean isEmpty(){
        return stackTop == -1;
    }

    public boolean push(int value){
        if (stackTop == MAX -1){
            System.out.println("Stack overflowed");
            return false;
        }else {
            stack[++stackTop] = value;
            return true;
        }
    }

    public int peek(int value){
        if (stackTop<0){
            System.out.println("Stack is empty");
        }else {
            return stack[value];
        }
        return -1;
    }

    public int pop(){
        return stack[stackTop--];
    }



}
