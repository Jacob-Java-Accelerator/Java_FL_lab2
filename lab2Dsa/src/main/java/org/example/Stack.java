package org.example;

public class Stack {

    private int[] items;
    private int count=0;

    public Stack(int size){
        if(size<=0){
            throw new IllegalArgumentException("size should not be less than or equal to zero");
        }
        items= new int[size];
    }

    public void push(int item){
        if(count==items.length){
            int[] newItems= new int[count * 2];
            for(int i=0; i<count; i++){
                newItems[i]=items[i];
            }
            items=newItems;
        }
        items[count]=item;
        count++;
    }

    public int pop(){
        if(count==0){
            throw new IllegalStateException("Stack is empty");
        }
       count--;
        return items[count];
    }

    public void add(){
        if(count<2){
            throw new IllegalStateException("Not enough elements to perform subtraction");
        }
        int a=pop();
        int b= pop();
        push(a+b);
    }



    public void subtract() {
        if (count < 2) {
            throw new IllegalStateException("Not enough elements to perform subtraction");
        }
        int b = pop();
        int a = pop();
        push(a - b);
    }

    public void multiply() {
        if (count < 2) {
            throw new IllegalStateException("Not enough elements to perform multiplication");
        }
        int b = pop();
        int a = pop();
        push(a * b);
    }


    public void divide() {
        if (count < 2) {
            throw new IllegalStateException("Not enough elements to perform division");
        }
        int b = pop();
        int a = pop();
        if (b == 0) {
            throw new ArithmeticException("Division by zero");
        }
        push(a / b);
    }

    public void print(){
        for(int i=0; i<count;i++){
            System.out.println(items[i]);
        }
    }
}
