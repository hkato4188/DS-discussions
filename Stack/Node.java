package Queue.Stack;

public class Node<T> {
    T data;
    Node<T> previous;

    public Node(T data){
        this.data = data;
        this.previous = null;
    }
}