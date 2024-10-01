package Queue;

public class Queue {

    public int length;

    public Node head;
    public Node tail;

    public Queue() {
        this.length = 0;
    }

    public void peek() {
        // return this.head;
        System.out.println(this.head.data);
    }

    // We are removing head
    // to do that we assign head.next to head
    // we delete old head

    // check if head... if no head undefined
    // head ref starts on 1st value
    // head next ref... points to 2nd value
    // return the value of the current head
    // then pop it by setting head ref to the head next ref

    public Node dequeue() {
        // if (length == 0) {
        // System.out.println("there is no head or tail, you can't perform this
        // action");

        if (length == 1) {
            this.head.next = null;
            this.tail.next = null;
            this.length--;
            return this.head;
        } else {
            Node temp = this.head;
            this.head = this.head.next;
            temp.next = null;
            this.length--;
            return temp;
        }
    }

    public void enqueue(int data) {
        Node appendedNode = new Node(data);

        if (this.length == 0) {
            this.head = appendedNode;
            this.tail = appendedNode;
            this.length++;
        } else {
            Node temp = this.tail;
            temp.next = appendedNode;
            this.tail = appendedNode;
            this.length++;
        }
    }

    public String toString() {
        String ourQueueString = "";

        Node current = this.head;

        for (int i = 0; i < this.length; i++) {
            ourQueueString = ourQueueString + " " + current.data;
            current = current.next;
        }
        return (ourQueueString);
    }

}
