package Queue.Stack;

public class Stack<T> {
    //1) we need the length, the head and rest is coming from the previous node
    public int length;
    public Node<T> head;

    public Stack() {
        this.head = null;
        this.length = 0;
    }

    //peek
    public T peek() {
        if (this.length != 0) {
            return this.head.data;
        }
        return null;
    }

    public void push(T input) {
        Node<T> pushedNode = new Node<T>(input);
        if (this.head == null) {
            this.head = pushedNode;
            this.length++;
        } else {
            pushedNode.previous = this.head;
            this.head = pushedNode;
            this.length++;
        }
    }

    //pop   if length 0 then return empty
    /*
     *if length of 1: copy head to different name and set head to null
     *
     *2+:
     *if length of 2: copy head to different name then set the head to previous
     *then free
     * */
    public Node<T> pop() {
        Node<T> poppedNode = this.head;
  /* if(this.length == 0){
      System.out.println("Stack is empty");
      return null;
   }
   */
        if (this.length == 1) {
            this.head = null;
            length--;
            return poppedNode;
        } else {
            this.head = this.head.previous;
            length--;
            //free it
            return poppedNode;
        }
    }
}


