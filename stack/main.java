import java.util.*;
public class main{
    @SuppressWarnings("unchecked")
    public static void main(String[] args){
        
        Stack stack = new Stack<String>();
        stack.push("MK11");
        stack.push("E-Football");
        stack.push("Call Of Duty : Modern Warfare");
        stack.push("Ghost of Tsushima");
        stack.push("Fallout");
// Add item to the top

        System.out.println(stack.empty());//checks if the stack is empty
        System.out.println(stack.peek());//returns item at the top of the stack
        System.out.println(stack.search("Fallout")); //return the index

        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        
        //removes item from the top
        System.out.println(stack);
    }
}