package com.first;

public class StackEx {

    static class Node{
         int data;
         Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    static class Stack{
        private int size;
        private int[] arr;
        private int indx = -1;

        Stack(int size){
            arr = new int[size];
            this.size = size;
        }
        public boolean isEmpty(){
            return indx == -1;
        }

        public void push(int data){
            if(indx == size-1){
                System.out.println("Stack is full");
                return;
            }
            arr[++indx] = data;
        }

        public int pop(){
            if(isEmpty()){
                System.out.println("Stack is empty");
                return -1;
            }
            int value = arr[indx];
            indx--;
            return value;
        }
        public int peek(){
            if(isEmpty()){
                System.out.println("Stack is empty");
                return -1;
            }
            return arr[0];
        }


    }

    public static void main(String[] args) {
        Stack s = new Stack(5);
        s.push(1);
        s.push(2);
        s.push(3);
    }
}
