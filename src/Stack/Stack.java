package Stack;

import java.util.Arrays;

public class Stack {

    private int[] arr;
    private int capcity;

    private int top;


    public Stack(int size){
        arr = new int[size];
        capcity =size;
        top=-1;
    }

    public void push(int data){
        if(isFull()){
            System.out.println("Stack is full");
        }else{
            arr[++top] = data;
        }
    }

    public int pop(){
        if(isEmpty()){
            System.out.println("Stack is Empty");
        }
            return arr[top--];
    }

    private boolean isFull() {
        return top==capcity-1;
    }
    private boolean isEmpty() {
            return top==-1;
    }
    public void printstack(){
        Arrays.stream(arr).forEach(System.out::println);
    }

    public static void main(String[] args) {
        Stack st = new Stack(5);
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        st.printstack();

        System.out.println(st.pop());
        st.printstack();

    }


}
