package csc223.jf;

public class ArrayQueue implements Queue{

    int[] data;
    int topIdx;
    int capacity;

    public ArrayQueue(int capacity){
        this.data = new int[capacity];
        this.topIdx = 0;
        this.capacity = 10;
    }


    public void enqueue(int item){
        // adding to the queue
        if (topIdx >= data.length) {
            return;

        }
        else{
            data[topIdx] = item;
            topIdx++;
        }
    }

    public int dequeue(){
        //removes from queue
        int dequeued = 0;
        if (isEmpty()){
            System.out.println ("Cant dequeue an empty queue");
        }

        dequeued = this.data[this.topIdx];
        return dequeued;

    }

    public int peek(){
        // returns item at the front of the queue
        return this.data[0];
    }

    public boolean isEmpty(){
        return this.topIdx == 0;
    }


    public int size(){
        if (this.isEmpty()){
            return 0;

        }
        else{
            return this.topIdx;
        }
    }

    public static void main(String[] args) {
        ArrayQueue queue = new ArrayQueue(10);

    }

}
