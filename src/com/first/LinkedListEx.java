package com.first;

class Node{
    String data;
    Node next;
    Node(String data){
        this.data = data;
        this.next = null;
    }
}
public class LinkedListEx {
     Node head;
     private int size;
     LinkedListEx(){
         this.size = 0;
     }

    // add- first, last
    public void addFirst(String data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }
    public void addLast(String data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        Node currNode = head;
        while(currNode.next != null){
            currNode = currNode.next;
        }
        currNode.next = newNode;

    }
    public void printList(){
         if(head == null){
             System.out.println("List is empty");
             return;
         }
         Node currNode = head;
         while(currNode != null){
             System.out.print(currNode.data+" -> ");
             currNode = currNode.next;
         }
        System.out.println("null");
    }

    // delete first
    public void removeFirst(){
        if(head == null){
            System.out.println("The list is empty");
            return;
        }
        size--;
        head = head.next;
    }
    // delete last;
    public void removeLast(){
        if(head == null){
            System.out.println("The list is empty");
            return;
        }
        size--;
        if(head.next == null){
            head = null;
            return;
        }
        Node curr = head;
        while(curr.next.next != null){
            curr = curr.next;
        }
        curr.next = null;
    }
    public int getSize(){
         return this.size;
    }

    public void reverse(){
         if(head == null || head.next == null){
             return;
         }
         Node prev = head;
         Node curr = head.next;
         while(curr != null){
             Node nxt = curr.next;
             curr.next = prev;

             prev = curr;
             curr = nxt;
         }
         head.next = null;
         head = prev;
    }
    public Node reverseRecursion(Node head){
         if(head == null || head.next == null){
             return head;
         }
         Node newNode = reverseRecursion(head.next);
         head.next.next = head;
         head.next = null;
         return newNode;
    }

    public boolean detectCycle(Node head){
         if(head == null){
             return false;
         }
         Node hare = head;
         Node turtle = head;
         while(hare != null && hare.next != null){
             hare = hare.next.next;
             turtle = turtle.next;
             if(hare == turtle){
                 return true;
             }
         }
         return false;
    }

    public static void main(String[] args) {
        LinkedListEx l = new LinkedListEx();
        l.addFirst("a");
        l.addLast("b");
        l.addLast("c");
        l.addLast("d");
        System.out.println(l.detectCycle(l.head));
      //  l.printList();
    }

}
