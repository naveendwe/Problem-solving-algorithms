package com.second;


import java.util.LinkedList;

public class PriorityTask {
    Node head;
    class Node{
        String data;
        Node next;
        Node(String data){
            this.data = data;
            next = null;
        }
    }
    void addFirst(String data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }
    void printList(){
        if(head == null){
            System.out.println("List is empty");
            return;
        }
        Node currNode = head;
        while(currNode!= null){
            System.out.print(currNode.data + " : ");
            currNode = currNode.next;
        }
        System.out.println("NULL");
    }
    void addLast(String data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        Node lastNode = head;
        while(lastNode.next!= null){
            lastNode = lastNode.next;
        }
        lastNode.next = newNode;
    }
    void removeFirst(){
        if(head == null){
            System.out.println("List is empty");
            return;
        }
        head = head.next;
    }
    void removeLast(){
        if(head == null){
            System.out.println("List is empty");
            return;
        }
        if(head.next == null){
            head = null;
            return;
        }
        Node currentNode = head;
        while(currentNode.next.next!= null){
            currentNode = currentNode.next;
        }
        currentNode.next = null;
    }

    public static void main(String[] args) {
         PriorityTask p = new PriorityTask();
         p.addFirst("a");
         p.addFirst("is");
         p.addLast("code");
         p.addLast("program");
         p.removeFirst();
         p.removeLast();
         p.printList();

    }
}
