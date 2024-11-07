package lab6;



	import java.util.HashMap;
	import java.util.Map;
	import java.util.Scanner;

	public class captital {

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Prompt the user for input
	        System.out.print("Enter a string: ");
	        String input = scanner.nextLine();

	        int capitalCount = 0;
	        int digitCount = 0;
	        Map<Character, Integer> vowelCount = new HashMap<>();
	        
	        // Initialize vowel count map
	        for (char vowel : "AEIOUaeiou".toCharArray()) {
	            vowelCount.put(vowel, 0);
	        }

	        System.out.println("Capital letters and their positions:");
	        for (int i = 0; i < input.length(); i++) {
	            char ch = input.charAt(i);

	            // Check if the character is a capital letter
	            if (Character.isUpperCase(ch)) {
	                capitalCount++;
	                System.out.println("Capital letter: " + ch + " at position " + i);
	            }

	            // Check if the character is a digit
	            if (Character.isDigit(ch)) {
	                digitCount++;
	            }

	            // Check if the character is a vowel and update count if so
	            if (vowelCount.containsKey(ch)) {
	                vowelCount.put(ch, vowelCount.get(ch) + 1);
	            }
	        }

	        // Display the results
	        System.out.println("\nNumber of capital letters: " + capitalCount);
	        System.out.println("Number of digits: " + digitCount);
	        System.out.println("Vowel occurrences:");

	        for (char vowel : "AEIOUaeiou".toCharArray()) {
	            System.out.println(vowel + ": " + vowelCount.get(vowel));
	        }

	        scanner.close();
	    }
	}
