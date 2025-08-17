

// find numer of occurrences of n element in an array


import java.util.*;
public class Pro2 {
    public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);
    System.out.print("Enter element size :");
    int size = sc.nextInt();
    int arr[] = new int[size];
    int i=0;
    while(size > i)
    {
        System.out.print("Enter element number " +(i+1)+": ");
        arr[i] = sc.nextInt();
        i++;
    }
    int search,n=0;
    System.out.println("Enter element to search:");
    search = sc.nextInt();
    for(i=0;i<arr.length;i++)
    {
        if(arr[i]==search)
        {
            // System.out.println(search +" Element found at index: " + i);
            n ++;
        }
    }
    System.out.println(search + " Element found " + n + " times.");

   } 
}
