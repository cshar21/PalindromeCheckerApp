import java.util.Stack;
import java.util.Queue;
import java.util.LinkedList;
public class PalindromeCheckerApp {

    public static void main(String[] args) {

        System.out.println("=================================");
        System.out.println(" Welcome to Palindrome Checker ");
        System.out.println(" Application Version: 1.0");
        System.out.println("=================================");

        // UC2 Hardcoded Palindrome
        String word = "madam";
        String reversed = "";
        for(int i = word.length()-1; i >=0; i--) {
            reversed += word.charAt(i);
        }
        if(word.equals(reversed)) {
            System.out.println(word + " is a Palindrome");
        } else {
            System.out.println(word + " is NOT a Palindrome");
        }

        // UC3: Palindrome Check Using String Reverse

        String input = "racecar";   // Example input string
        String reversedString = "";

        // Reverse the string using a for loop
            for (int i = input.length() - 1; i >= 0; i--) {
            reversedString += input.charAt(i);
            }

        // Compare original and reversed string
            if (input.equals(reversedString)) {
            System.out.println(input + " is a Palindrome (UC3)");
            } else {
            System.out.println(input + " is NOT a Palindrome (UC3)");
            }

        // UC5: Stack-Based Palindrome Checker

        String wordUC5 = "radar";

        // Create stack
            Stack<Character> stack = new Stack<>();

        // Push characters into stack
            for(int i = 0; i < wordUC5.length(); i++) {
            stack.push(wordUC5.charAt(i));
        }

        // Pop characters to build reversed string
            String reversedStack = "";

        while(!stack.isEmpty()) {
            reversedStack += stack.pop();
        }

        // Compare original and reversed
        if(wordUC5.equals(reversedStack)) {
            System.out.println(wordUC5 + " is a Palindrome (UC5)");
        }
        else {
            System.out.println(wordUC5 + " is NOT a Palindrome (UC5)");
        }

        // UC6: Queue + Stack Based Palindrome Check

        String wordUC6 = "madam";

        // Create Queue and Stack
        Queue<Character> queue = new LinkedList<>();
        Stack<Character> stackUC6 = new Stack<>();

        // Insert characters into Queue and Stack
        for(int i = 0; i < wordUC6.length(); i++) {
            char ch = wordUC6.charAt(i);
            queue.add(ch);      // Enqueue (FIFO)
            stackUC6.push(ch);  // Push (LIFO)
        }

        // Compare dequeue vs pop
        boolean isPalindromeUC6 = true;

        while(!queue.isEmpty()) {
            if(queue.remove() != stackUC6.pop()) {
                isPalindromeUC6 = false;
                break;
            }
        }

        // Print result
        if(isPalindromeUC6) {
            System.out.println(wordUC6 + " is a Palindrome (UC6)");
        }
        else {
            System.out.println(wordUC6 + " is NOT a Palindrome (UC6)");
        }
        // UC7: Deque-Based Optimized Palindrome Checker

        String wordUC7 = "refer";

        // Create Deque
        Deque<Character> deque = new ArrayDeque<>();

        // Insert characters into deque
        for(int i = 0; i < wordUC7.length(); i++) {
            deque.addLast(wordUC7.charAt(i));
        }

        // Compare front and rear
        boolean isPalindromeUC7 = true;

        while(deque.size() > 1) {
            char front = deque.removeFirst();
            char rear = deque.removeLast();

            if(front != rear) {
                isPalindromeUC7 = false;
                break;
            }
        }

        // Display result
        if(isPalindromeUC7) {
            System.out.println(wordUC7 + " is a Palindrome (UC7)");
        }
        else {
            System.out.println(wordUC7 + " is NOT a Palindrome (UC7)");
        }
    }
}