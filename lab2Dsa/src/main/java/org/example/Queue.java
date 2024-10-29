package org.example;

import java.util.Arrays;

public class Queue {

    private int[] items;
    private int rear;
    private int front;
    private int count;

    public Queue(int size){
        if(size<=0){
            throw new IllegalArgumentException("Size should not be less than or equal to zero");
        }
        items= new int[size];
    }

    public void add (int item){
        if(count==items.length){
          throw new IllegalStateException("Queue is full");
        }

        items[rear]=item;
        rear=(rear+1) % items.length;
        count++;
    }
    public int remove(){
        if(count==0){
            throw new IllegalArgumentException("Queue is Empty");
        }
       int item= items[front];
        items[front]=0;
        front=(front+1) % items.length;
        count--;
        return item;
    }


    @Override
    public String toString(){
       return Arrays.toString(items);
    }
}
