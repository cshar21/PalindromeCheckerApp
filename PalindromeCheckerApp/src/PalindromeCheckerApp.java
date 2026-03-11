import java.util.Stack;
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
    }
}