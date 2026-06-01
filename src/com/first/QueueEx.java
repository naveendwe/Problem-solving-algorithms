package com.first;

public class QueueEx {
       static class Queue{
           static int[] arr;
           static int size;
           static int rear = -1;

           Queue(int n){
               arr = new int[n];
               this.size = n;
           }

           static boolean isEmpty(){
               return rear == -1;
           }
           public static void add(int data){
               if(rear == size-1){
                   System.out.println("Full Queue");
                   return;
               }
               arr[++rear] = data;
           }
           public static int remove(){
               if(isEmpty()){
                   System.out.println("Empty Queue");
                   return -1;
               }
               int front = arr[0];
               for(int i = 0; i<rear;i++){
                   arr[i] = arr[i+1];
               }
               rear--;
               return front;
           }
           public static int peek(){
               if(isEmpty()){
                   System.out.println("Empty queue");
                   return -1;
               }
               return arr[0];
           }

       }

    public static void main(String[] args) {
        Queue s = new Queue(3);
        s.add(1);
        s.add(3);
        s.add(4);
        s.remove();
        for(int i = 0;i<=s.rear;i++){
            System.out.println(s.arr[i]);
        }
    }
    static Node head;
    static class Node{
           int data;
           Node next;
           // constructor
           Node(int data){
               this.data = data;
               this.next = null;
           }

    }

    public static void add(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;  // add new data in node
            return;
        }
        head.next = newNode;
    }


}
