import java.util.Scanner;

public class PangramChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a sentence to check if it's a pangram: ");
        String input = scanner.nextLine();
        
        if (isPangram(input)) {
            System.out.println("The input is a pangram.");
        } else {
            System.out.println("The input is not a pangram.");
        }
        
        scanner.close();
    }

    public static boolean isPangram(String input) {
        // Convert input to lowercase to handle both uppercase and lowercase letters
        input = input.toLowerCase();
        
        // Create a boolean array to track the occurrence of each letter
        boolean[] letters = new boolean[26];
        
        // Iterate through the input and mark encountered letters
        for (char c : input.toCharArray()) {
            if (c >= 'a' && c <= 'z') {
                int index = c - 'a';
                letters[index] = true;
            }
        }
        
        // Check if all letters from 'a' to 'z' have been encountered
        for (boolean letter : letters) {
            if (!letter) {
                return false;
            }
        }
        
        return true;
    }
}