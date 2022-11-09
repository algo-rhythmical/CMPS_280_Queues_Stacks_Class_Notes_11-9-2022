import java.util.LinkedList;
import java.util.Stack;


public class Main {
    public static void main(String[] args) {

/*        LinkedList<String> queue = new LinkedList<>();

        queue.add("First");
        queue.add("Second");
        queue.add("3rd");
        queue.add("4th");

        System.out.println(queue);

        String s = queue.remove();      //removing the first in from queue and set to String variable s
        System.out.println(s);
        System.out.println(queue);

        s = queue.poll();               //removing the next element from queue and set to variable s. if no element, throws exception
        System.out.println(s);
        System.out.println(queue);

        s = queue.peek();               //set element next in queue to variable s without removing from queue
        System.out.println(s);
        System.out.println(queue);
*/

        Stack<String> stack = new Stack<>();
        System.out.println(stack);

        stack.push("1st");
        stack.push("2nd");
        stack.push("3rd");
        stack.push("4th");

        System.out.println(stack);

        String s = stack.pop();         //removing last in from stack and assigning to String variable s
        System.out.println(s);
        System.out.println(stack);

        stack.push("4th");          //adding what we removed back to the stack, retains position
        System.out.println(stack);

        s = stack.peek();               //set element that was last in stack to variable s without removing from stack
        System.out.println(s);
        System.out.println(stack);
    }
}
