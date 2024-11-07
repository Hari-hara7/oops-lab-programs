package multiplecatch;

import java.util.InputMismatchException;
import java.util.Scanner;

public class muilt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = null;
        int n = 0;

        try {
            // Reading the number of elements in the array
            System.out.print("Enter the number of elements: ");
            n = scanner.nextInt();
            array = new int[n];

            // Reading elements from the keyboard
            System.out.println("Enter " + n + " integers:");
            for (int i = 0; i < n; i++) {
                array[i] = Integer.parseInt(scanner.next());
            }

            // Finding the smallest element in the array
            int smallest = array[0];
            for (int i = 1; i < n; i++) {
                if (array[i] < smallest) {
                    smallest = array[i];
                }
            }

            // Dividing each element by the smallest element
            System.out.println("\nDividing each element by the smallest element (" + smallest + "):");
            for (int i = 0; i < n; i++) {
                int result = array[i] / smallest;
                System.out.println("Result of array[" + i + "] / " + smallest + " = " + result);
            }

            // Reading index from the user to access an element
            System.out.print("\nEnter an index to access the element: ");
            int index = scanner.nextInt();
            System.out.println("Element at index " + index + " is " + array[index]);

        } catch (NumberFormatException e) {
            System.out.println("Error: Invalid number format. Please enter integers only.");
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed.");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Invalid index. Index is out of bounds.");
        } catch (InputMismatchException e) {
            System.out.println("Error: Invalid input. Please enter correct input types.");
        } finally {
            // Closing the scanner to avoid resource leakage
            scanner.close();
            System.out.println("\nProgram execution completed.");
        }
    }
}
