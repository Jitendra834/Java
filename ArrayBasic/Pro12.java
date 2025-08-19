

// check array is pelindrome or not 

import java.util.*;

public class Pro12 {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter array size :");
    int size = sc.nextInt();
    int arr[] = new int[size];
    for(int i=0;i<size;i++)
    {
        System.out.print("Enter element number "+(i+1)+": ");
        arr[i] = sc.nextInt();
    }
    int new_arr[] = new int[arr.length];
    for(int i=0;i<size ;i++)
    {
        new_arr[i] = arr[i];
    }

    int swap ;
    for(int i=0,j=size-1;i<j;i++,j--)
    {
        swap = arr[i];
        arr[i] = arr[j];
        arr[j] = swap;
    }
    int a= 0;
    for(int i=0;i<size;i++)
    {
        if(new_arr[i]!=arr[i])
        {
            a=1;
            break;
        }
    }
    if(a==1)System.out.println("Not Palindrome");
    else System.out.println("Palindrome");
}    
}
