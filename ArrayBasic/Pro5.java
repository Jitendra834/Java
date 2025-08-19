
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
        System.out.print("Enter element number "+(i+1)+": ");
        arr[i] = sc.nextInt();
    }
    System.out.print("Enter number that you want to delete :");
    int delete = sc.nextInt();

    int ans [] = fun(arr,delete);
    System.out.print("New Array after deletion :");
    for(int i=0;i<ans.length;i++)
    {
        System.out.print(ans[i]+" ");
    }
}
 public static int [] fun (int arr[], int delete)
 {
//  public static int[] fun(int arr[], int delete) {

 {
    int n=0,j=0;
    for(int i=0;i<arr.length;i++)
    {
        if(arr[i]==delete)
        {
            n++;
        }
    }
    if(n==0) return arr;
    int new_arr[] = new int[arr.length - n ];
    for(int i=0;i<arr.length;i++)
    {
        if(arr[i]!= delete)
        {
            new_arr[j++] = arr[i];
        }
    }
    return new_arr;
 }

}
}

    // Scanner sc = new Scanner(System.in);
    // System.out.print("Enter Array size :");
    // int size = sc.nextInt();
    // int arr[] = new int[size];

    // for(int i=0;i<size;i++)
    // {
    //     System.out.print("Enter element "+(i+1)+": ");
    //     arr[i] = sc.nextInt();
    // }
    // System.out.print("Enter element for delete :");
    // int delete = sc.nextInt();
    // for(int i=0;i<arr.length;i++)
    // {
    //     if(arr[i]==delete)
    //     {
    //         continue;
    //     }
    //     System.out.print(arr[i]+" ");
    // }
    // }   
