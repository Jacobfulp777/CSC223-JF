package csc223.jf;


public class DoublyLinkedList extends SinglyLinkedList {

    Node tail;
    
    public DoublyLinkedList(){
        super();
        this.head = new Node(' ');
        this.tail = this.head;
    }

    //inserts an item in the list
    @Override
    public void insert(char item){
        Node currNode = this.head;
        while (currNode.next != null){
            currNode = currNode.next;

        }
        Node newNode = new Node(item);
        currNode.next = newNode;
        newNode.previous = currNode;
        this.sz++;
    }
    

    // Removes an item from the list
    @Override
    public void remove(char item){
        Node currNode = this.head;
        while (currNode.next.data != item){
            currNode = currNode.next;

        }
        currNode.next.previous = currNode.previous;
        currNode.previous.next = currNode.next;

        this.sz--;
    }


    // Get the first item, return '☠' if the list is empty
    @Override
    public char getFirst(){
        return super.getFirst();
    }

    // Get the last item, return '☠' if the list is empty
    @Override
    public char getLast(){
        return super.getLast();
    }

    // Get an item at a specific index, return '☠' if index is out of bounds
    @Override
    public char get(int index){
        return super.get(index);
    }

    // Get the size of the list
    @Override
    public int size(){
        return super.size();
    }

    // Check if the list is empty
    @Override
    public boolean isEmpty(){
        return super.isEmpty();
    }

    // Clear the list
    @Override
    public void clear(){
        this.head.next = null;
        this.tail = this.head;
        this.sz = 0;
    }

    // Check if the list contains an item
    @Override
    public boolean contains(char item){
        return super.contains(item);
        
    }

    // Get the index of an item, if it exists else return -1
    @Override
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
    @Override
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
    @Override
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
    @Override
    public String toString(){
        return super.toString();

    }

}
