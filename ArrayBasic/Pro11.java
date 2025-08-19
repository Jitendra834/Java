

// create a progrsm to revers array 

import java.util.*;
public class Pro11 {
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
        int swap;
        for(int i=0,j=size-1;i<j;i++,j--)
        {
            swap = arr[i];
            arr[i] = arr[j];
            arr[j] = swap;
        }
        for(int i=0;i<size;i++)
        {
            System.out.print(arr[i]+" ");
        }


    }
    


}
