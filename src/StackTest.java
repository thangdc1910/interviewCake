import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

public class StackTest {

    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();
        stack.add(1);
        stack.add(2);
        stack.add(3);
        stack.add(4);
        stack.add(5);

        int length= stack.capacity();
        System.out.println(stack.peek());
        System.out.println(stack.pop());

        System.out.println(stack.peek());
        System.out.println(stack.pop());
        System.out.println(stack.peek());


        stack.add(10);

        System.out.println(stack.peek());

        System.out.println(stack.search(22));


        System.out.println("check empty: "+ stack.empty());

        Deque<Integer> deque = new ArrayDeque<>();

    }
}
