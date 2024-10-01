package Queue;

public class Main {

    public static void main(String args[]) {

        Queue testQueue = new Queue();
        testQueue.enqueue(3);
        testQueue.enqueue(4);
        testQueue.enqueue(5);
        testQueue.enqueue(6);
        System.out.println(testQueue.toString());
        testQueue.peek();
        testQueue.dequeue();
        testQueue.dequeue();
        System.out.println(testQueue.toString());

    }

}
