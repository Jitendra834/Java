

// Find Minimum and maximum element in given Array

import java.util.*;
public class Pro3{
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter element size :");
    int size = sc.nextInt();
    int arr[] = new int[size];
    for(int i=0;i<size;i++)
    {
        System.out.print("Enter element number "+(i+1)+": ");
        arr[i] = sc.nextInt();
    }        
    int max = arr[0];
    int min = arr[0];
    for(int i=0;i<arr.length;i++)
    {
      if(max < arr[i])
      {
        max = arr[i];
      }
      if(min > arr[i])
      {
        min = arr[i];
      }
    }
    System.out.println("Maximum element is: " + max);
    System.out.println("Minimum element is: " + min);
}
}