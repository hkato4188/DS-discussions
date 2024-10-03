package Queue.Stack;

public class Main {
    public static void main(String[] args){
    Stack<Integer> testStack= new Stack();
    testStack.push(6);
    System.out.println(testStack.peek());
        testStack.push(3);
        System.out.println(testStack.peek());
        testStack.push(8);
        System.out.println(testStack.peek());
        testStack.push(1);
        Node<Integer> poppedValue = testStack.pop();
        System.out.println(poppedValue.data);
    }
}