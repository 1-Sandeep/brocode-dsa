
import java.util.Stack;

public class _01_DSA_Stack {
    public static void main(String[] args) {
        Stack<String> gameStack = new Stack<>();

//        check and return true or false of stack is empty or not
        System.out.println("\nIs gameStack empty ? " + gameStack.empty());

//        push() method: push an item/element onto the top of the stack
        gameStack.push("Tekken");
        gameStack.push("Poly Bridge");
        gameStack.push("GTA V");
        gameStack.push("World WarZ");
        gameStack.push("HALO");

        System.out.println("\nIs gameStack empty ? " + gameStack.empty());
//        will print the content of gameStack object
        System.out.println("\n" + gameStack);

//        peek() method: look at the object at the top of object without removing from stack
        System.out.println("\nPeeked Item from stack is : " + gameStack.peek());
        System.out.println(gameStack);

//        pop() method:  removes the object at the top of the stack
        System.out.println("\nRemoved Item from stack is : " + gameStack.pop());
        System.out.println(gameStack);

//        search() method: returns position of searched element
        System.out.println("\nPosition of GTA V in stack is : " + gameStack.search("GTA V"));

//        clear() method: will clear the stack
        gameStack.clear();
        System.out.println(gameStack);
    }
}