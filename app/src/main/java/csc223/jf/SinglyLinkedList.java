package csc223.jf;

public class SinglyLinkedList implements LinkedList{

    Node head;
    int sz;

    public SinglyLinkedList(){
        this.head = new Node(' ');
        this.sz = 0;
    }

    // Insert an item at the end of the list for unsorted lists
    public void insert(char item){
        Node newNode = new Node(item);
        if (this.head.next == null){
            this.head.next = newNode;
        } else {
            Node currNode = this.head;
            while (currNode.next != null){
                currNode = currNode.next;

            }
        
            currNode.next = newNode;
            this.sz++;

        }
    }

    // Removes an item from the list
    public void remove(char item){
        if (this.head.next == null){
            return 
        }

        Node currNode = this.head.next;
        while (currNode.next.data != item && currNode.next != null){
            currNode = currNode.next;

        }
        
        currNode.next = currNode.next.next;
        this.sz--;
        
    }


    // Get the first item, return '☠' if the list is empty
    public char getFirst(){
        if (this.isEmpty()){
            return '☠';
        }
        return this.head.next.data;
    }

    // Get the last item, return '☠' if the list is empty
    public char getLast(){
        if (this.isEmpty()){
            return '☠';
        }
        Node currNode = this.head;
        while (currNode.next != null){
            currNode = currNode.next;

        }
        return currNode.data;
    }

    // Get an item at a specific index, return '☠' if index is out of bounds
    public char get(int index){
        int count = 0;

        if (index < 0 || index > this.sz-1){
            return '☠';
        }

        Node currNode = this.head;
        while (currNode.next != null){
            currNode = currNode.next;
            count++;

        }
        return currNode.data;
    }

    // Get the size of the list
    public int size(){
        return this.sz;
    }

    // Check if the list is empty
    public boolean isEmpty(){
        return this.head.next == null;
    }

    // Clear the list
    public void clear(){
        this.head.next = null;
    }

    // Check if the list contains an item
    public boolean contains(char item){
        Node currNode = this.head;
        while (currNode.next.data != item && currNode.next != null){
            currNode = currNode.next;

        }

        if (currNode.data == item){
            return true;
        }
        else{

        return false;
        }
    }

    // Get the index of an item, if it exists else return -1
    public int indexOf(char item){
        int count = 0;
        Node currNode = this.head;
        while (currNode.next.data != item && currNode.next != null){
            currNode = currNode.next;
            count++;
        }

        if (currNode.data == item){
            return count;
        }
        
        else{
            return -1;
        }
    }

    // Get the last index of an item, if it exists else return -1
    public int lastIndexOf(char item){
        Node currNode = this.head;
        int foundIdx = 0;
        int count = 0;
        while (currNode.next != null){
            if (currNode.data == item){
                foundIdx = count;
            }
            currNode = currNode.next;
            count++;
            
        }
        return foundIdx;
    }

    // Reverse the list
    public void reverse(){
        // use three pointer method, keep track of prev, curr, next, aim for 0(1) solution (make a new linked list)
        Node prev = null;
        Node currNode = this.head.next;
        Node next = null;
        while (currNode != null){
            next = currNode.next;
            currNode.next = prev;
            prev = currNode;
            currNode = next;

        }
        this.head.next = prev;
    }

    // Creates and returns a String representation of the list
    // e.g. `A -> B -> C -> D` should return "ABCD";
    public String toString(){
        StringBuilder items = new StringBuilder();
        if (this.isEmpty()){
            return "[]";
        }
        items.append("[");
        Node currNode = this.head.next;
        while (currNode != null){
            items.append(currNode.data);
            
            if (currNode.next != null){
                items.append("->");
            }
            currNode = currNode.next;

        }
        items.append("]");
        return items.toString();
    }
}