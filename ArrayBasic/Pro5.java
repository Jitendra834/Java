
// create a program delete a specific element in array and return new Array 

import java.util.*;

public class Pro5 {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter Array size :");
    int size = sc.nextInt();
    int arr[] = new int[size];

    for(int i=0;i<size;i++)
    {
        System.out.print("Enter element "+(i+1)+": ");
        arr[i] = sc.nextInt();
    }
    System.out.print("Enter element for delete :");
    int delete = sc.nextInt();
    for(int i=0;i<arr.length;i++)
    {
        if(arr[i]==delete)
        {
            continue;
        }
        System.out.print(arr[i]+" ");
    }

    }    
}
