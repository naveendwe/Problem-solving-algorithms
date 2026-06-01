package com.first;

import java.util.Stack;

public class StackUsingLL {

    static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    static class Stack{
        public static Node head;

        public void push(int data){
            Node newNode = new Node(data);
            if(head == null){
               head = newNode;
               return;
            }
            newNode.next = head;
            head = newNode;
        }
        public static void pushBottom(int data, java.util.Stack<Integer> s){
            if(s.isEmpty()){
                s.push(data);
                return;
            }
            int top = s.pop();
            pushBottom(data, s);
            s.push(top);

        }
        public int pop(){
            if(head == null){
                System.out.println("Stack is empty");
                return -1;
            }
            int top = head.data;
            head = head.next;
            return top;
        }
        public int peek(){
            if(head == null){
                System.out.println("Stack is emtpy");
                return -1;
            }
            return head.data;
        }
    }

    public static void main(String[] args) {
        java.util.Stack<Integer> s = new java.util.Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        Stack.pushBottom(4,s);
    }
}
