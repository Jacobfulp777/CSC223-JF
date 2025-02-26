package csc223.jf;

public class Node {
    
    Node next = null;
    Node previous = null;
    char data;

    public Node(char item, Node next){
        this.next = null;
        this.previous = null;
        this.data = ' ';

    }

    public Node(char data){
        this.next = null;
        this.data = data;
        this.previous = null;
    }

}