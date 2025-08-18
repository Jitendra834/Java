



// Write a Java program to count how many numbers are greater than 100 and how many are less than 100 in an array.

import java.util.Scanner;

public class Pro10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int greater = 0, less = 0, equal = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] > 100)
                greater++;
            else if (arr[i] < 100)
                less++;
            else
                equal++;
        }
        System.out.println("Numbers greater than 100: " + greater);
        System.out.println("Numbers less than 100: " + less);
        System.out.println("Numbers equal to 100: " + equal);
    }
}
