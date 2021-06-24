/*
Aaron flores
2021
*/

package StructureData;

public class Lista {

    private Node head = null;
    private int size = 0;

    public class Node {
        public Book book;
        public Node nextNode = null;

        public Node(Book book) {
            this.book = book;
        }

        @Override
        public String toString() {
            return "book: "+this.book;
        }
        
    }

    public void insertNodeBegin(Book book){
        Node node = new Node(book);

        node.nextNode = head;
        head = node;
        ++size;
        
    }

    public void insertNodeFinal(Book book) { 
        Node node = new Node(book);
        if (head == null) {
            head = node;
        } else {
            Node point = head;
            while (point.nextNode != null) {
                point = point.nextNode;
            }
            point.nextNode = node;
        }
        ++size;
    }

    public void insertNodePosition(int position, Book book){
        Node node = new Node(book);
        if (head == null){
            head = node;
        } else {
            Node point = head;
            int count = 0;
            while (count < position -1 && point.nextNode != null) {
                point = point.nextNode;
                ++count;
            }
            node.nextNode = point.nextNode;
            point.nextNode = node;
        }
        ++size;
    }

    public Book getBookByPosition(int position) {
        if (head == null) {
            return null;
        } else {
            Node pointer = head;
            int count = 0;
            while (count < position && pointer.nextNode != null) {
                pointer = pointer.nextNode;
                ++count;
            }
            if (count != position) {
                return null;
            } else {
                return pointer.book;
            }
        }
    }

    public void deleteFirstNode() {
        if (head != null){
            Node first = head;
            head = head.nextNode;
            first.nextNode = null;
            --size;
        }
      
    }

    public void deleteLastNode(){
        if (!isEmpty()){
            if(head.nextNode == null){
                head = null;
            } else {
                Node pointer = head;
                while (pointer.nextNode.nextNode != null) {
                    pointer = pointer.nextNode;
                }
                pointer.nextNode = null;
            }
            --size;
        }
    }

    public void deleteNodeByPosition(int position){
        if (!isEmpty()){
            if(head.nextNode == null){
                head = null;
            } else {
                Node pointer = head;
                int count = 0;
                while (count < position -1 && pointer.nextNode != null) {
                    pointer = pointer.nextNode;
                    ++count;
                }
                Node temporal = pointer.nextNode;
                pointer.nextNode = pointer.nextNode.nextNode;
                temporal.nextNode = null;
                
            }
            --size;
        }
    }

    public int size() { 
        return size;
    }

    public void iterate() {
        if (head == null) {
            System.out.println("is empty");
        } else {
            Node pointer = head;
            while (pointer != null) {
                System.out.println(pointer);
                pointer = pointer.nextNode;
            }
        }
    }

    public boolean isEmpty(){
        return head == null;
    }
}
