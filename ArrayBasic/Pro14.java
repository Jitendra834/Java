


// creat a program to search a element in 2d array

import java.util.*;

public class Pro14 {
 public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter number of rows: ");
    int rows = sc.nextInt();
    System.out.print("Enter number of columns: ");
    int cols = sc.nextInt();
    int[][] arr = new int[rows][cols];
    System.out.println("Enter elements of the array:");
    for (int i = 0; i < rows; i++) {
        for (int j = 0; j < cols; j++) {
            arr[i][j] = sc.nextInt();
        }
    }
    System.out.print("Enter element to search: ");
    int target = sc.nextInt();
    boolean found = false;
    for (int i = 0; i < rows; i++) {
        for (int j = 0; j < cols; j++) {
            if (arr[i][j] == target) {
                System.out.println("Element found at (" + i + ", " + j + ")");
                found = true;
            }
        }
    }
    if (!found) {
        System.out.println("Element not found");
    }
}
}
