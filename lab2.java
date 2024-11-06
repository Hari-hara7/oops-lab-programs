
package oopslab;

import java.util.Scanner;

public class lab2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the size of the arrays
        System.out.print("Enter the size of the arrays: ");
        int size = scanner.nextInt();

        // Declare two arrays
        int[] array1 = new int[size];
        int[] array2 = new int[size];

        // Read elements for the first array
        System.out.println("Enter elements for the first array:");
        for (int i = 0; i < size; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            array1[i] = scanner.nextInt();
        }

        // Read elements for the second array
        System.out.println("Enter elements for the second array:");
        for (int i = 0; i < size; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            array2[i] = scanner.nextInt();
        }

        // Count even and odd numbers in the first array
        int evenCountArray1 = 0, oddCountArray1 = 0;
        for (int num : array1) {
            if (num % 2 == 0) {
                evenCountArray1++;
            } else {
                oddCountArray1++;
            }
        }

        // Count even and odd numbers in the second array
        int evenCountArray2 = 0, oddCountArray2 = 0;
        for (int num : array2) {
            if (num % 2 == 0) {
                evenCountArray2++;
            } else {
                oddCountArray2++;
            }
        }

        // Check if the arrays are symmetrical (i.e., same number of even and odd numbers)
        if (evenCountArray1 == evenCountArray2 && oddCountArray1 == oddCountArray2) {
            System.out.println("The arrays are symmetrical.");
        } else {
            System.out.println("The arrays are not symmetrical.");
        }

        // Close the scanner
        scanner.close();
    }
}

