import java.util.Stack;
import java.util.Scanner;

public class Main {
    public static Scanner scanner=new Scanner(System.in);
    public static void main(String[] args) {
        String word="hello";
        var rev=new StringReverser();
        System.out.println(rev.reverse_stack(word));
        System.out.println(rev.reverse_builder(word));
        System.out.println(rev.reverse_Buffer(word));


        var stack = new Stack_Array(10);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        System.out.println(stack.size());
        stack.print();
        System.out.println(stack.isEmpty());
        stack.pop();
        stack.print();
        stack.peek();
    }
}