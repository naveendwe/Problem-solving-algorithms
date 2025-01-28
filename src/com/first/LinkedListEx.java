package com.first;

public class LinkedListEx {

      class Node {
          int data;
          Node next;

          public Node(int data) {
              this.data = data;
              this.next = null;
          }
      }
     static Node head;
      LinkedListEx() { head = null; }

      // Insertion at the beginning of the linked list
    void push(int new_data) {
        Node new_node = new Node(new_data);
        new_node.next = head;
        head = new_node;
    }

    // Insertion at the end of the linked list
    void addLast(int new_data) {
        Node new_node = new Node(new_data);
        Node last = head;
        if(head == null) {
            head = new_node;
            return;
        }
        while (last.next!= null) {
            last = last.next;
        }
        last.next = new_node;
        new_node.next = null;
    }
    void printList(){
        Node temp = head;
        while (temp!= null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static Node reverseRecursive(Node head){
          if (head == null || head.next == null)
             return head;
          Node newHead = reverseRecursive(head.next);
          head.next.next = head;
          head.next = null;
          return newHead;
    }
    public static void printNode(Node head){
          while(head!= null){
              System.out.print(head.data + " ");
              head = head.next;
          }
          System.out.println();
    }
    public static void main(String[] args){
        LinkedListEx list = new LinkedListEx();
        list.push(7);
        list.push(1);
        list.push(3);
        list.addLast(5);
        list.addLast(9);

        System.out.println("Created Linked List:");
        list.printList();
        Node node = reverseRecursive(head);
        printNode(node);

    }

}
