
// create a program to check if the given Array is sorted

import java.util.*;
public class Pro4 {
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

        int inc = incre(arr);
        if(inc ==1)System.out.println("Array is Increment order ");
        else System.out.println("Array is not sorted ");
   

   
 }
  public static int incre(int[] arr) {
    
    for(int i=0;i<arr.length-1;i++)
    {
        if(arr[i]>=arr[i+1])
        {
            return 0;
        }
    }
        return 1;
    
    }
}
