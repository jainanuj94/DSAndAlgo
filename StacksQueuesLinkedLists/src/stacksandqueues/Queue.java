package stacksandqueues;

import java.util.Stack;

public class Queue {
    private static class Node{
        private int data;
        private Node next;
        private  Node(int data){
            this.data = data;
        }
    }

    private Node head; //remove from head
    private Node tail; // add to tail

    public boolean isEmpty(){
        if(head == null){
            return true;
        }
        return false;
    }

    public int peek(){
        if(head != null)
            return head.data;
        return -1;
    }

    public void add(int data){
        Node node = new Node(data);

        if(tail != null){
            tail.next = node;
        }
        tail = node;
        if(head == null){
            head = node;
        }
    }

    public int delete(){
        int data = head.data;
        head = head.next;
        if(head == null){
            tail = null;
        }
        return data;
    }
}
