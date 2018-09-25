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

    public class Iterator<T>{

        private Node current;

        public Iterator() {
            current = null;
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

    }
    private Node head;
    private Node tail;
    private int size;

    public List() {
        head = new Node(null, null, null);
        tail = new Node(null, head, null);
        head.next = tail;;
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

    public void printall() {
        Node tmp = head;
        while(tmp != tail){
            System.out.println(tmp.data);
            tmp = tmp.next;
        }
    }

}
