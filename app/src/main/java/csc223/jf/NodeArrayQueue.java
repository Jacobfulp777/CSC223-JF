package csc223.jf;

public class NodeArrayQueue {

    TreeNode[] data;
    int topIdx;
    int capacity;

    public NodeArrayQueue(int capacity){
        this.data = new TreeNode[capacity];
        this.topIdx = 0;
        this.capacity = 10;
    }


    public void enqueue(TreeNode item){
        // adding to the queue
        if (topIdx >= this.capacity) {
            this.capacity += 10;

        }
        else{
            data[topIdx] = item;
            topIdx++;
        }
    }

    public TreeNode dequeue(){
        //removes from queue
        if (isEmpty()){
            System.out.println ("Cant dequeue an empty queue");
        }

        TreeNode dequeued = this.data[this.topIdx];
        return dequeued;

    }

    public TreeNode peek(){
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
