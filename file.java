package ja;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class file {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the filename
        System.out.print("Enter the filename (with extension): ");
        String filename = scanner.nextLine();

        int charCount = 0;
        int wordCount = 0;
        int lineCount = 0;

        // Try to open and read the file
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;

            while ((line = reader.readLine()) != null) {
                lineCount++;
                charCount += line.length();

                // Split the line into words using whitespace as the delimiter
                String[] words = line.split("\\s+");
                wordCount += words.length;
            }

            // Display results
            System.out.println("Number of characters: " + charCount);
            System.out.println("Number of words: " + wordCount);
            System.out.println("Number of lines: " + lineCount);

        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }

        scanner.close();
    }
}
