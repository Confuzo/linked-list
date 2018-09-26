/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author confuzo (Abraão Dantas)
 * @author A linked list implementation similar to java.util.LinkedList
 */
public class List<T> {

    private class Node {

        private T data;
        private Node prev;
        private Node next;

        public Node() {
            this.data = null;
            this.prev = null;
            this.next = null;
        }

        public Node(T data, Node prev, Node next) {
            this.data = data;
            this.prev = prev;
            this.next = next;
        }

    }

    /*public class Iterator<T> {

        private Node current;
        private int size_ite;

        public Iterator() {
            current = null;
            size_ite = size;
        }

        public Iterator(Node n) {
            current = n;
        }

        public boolean hasNext() {
            return true;
        }

        public Node next() {
            return current;
        }

    }*/
    private Node head;
    private Node tail;
    private int size;

    public List() {
        head = new Node(null, null, null);
        tail = new Node(null, head, null);
        head.next = tail;
        size = 0;
    }

    public void push_back(T data) {
        if (size == 0) {
            head.data = data;
            size++;
        } else {
            Node tmp = new Node(data, tail.prev, tail);
            tail.prev.next = tmp;
            tail.prev = tmp;
            size++;
        }
    }

    public void push_front(T data) {
        if (size == 0) {
            head.data = data;
            size++;
        } else {
            Node tmp = new Node(data, null, head);
            head.prev = tmp;
            head = tmp;
            size++;
        }
    }
    
    public void pop_front(){
        if(size > 0){
            head = head.next;
            size--;
        }
    }
    public void pop_back(){
        if(size > 0){
            tail.prev = tail.prev.prev;
            size--;
        }
    }
    
    public int size(){
        return size;
    }
    
    public boolean empty(){
        return size == 0;
    }
    
    public void clear(){
        size = 0;
        head = null;
        tail = null;
        head.next = tail;
        tail.prev = head;
    }
    
    public Node front(){
        return head;
    }
    
    public Node back(){
        return tail.prev;
    }
    
    public void printall(){
        Node temp = head;
        for(int i=0; i< size; i++){
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

}
