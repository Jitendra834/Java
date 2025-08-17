

// create program to find the sum and average of all elements in an array


import java.util.*;
public class Pro1{

    public static void main(String str [])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number of element :");
        int size = sc.nextInt();
        int arr[] = new int[size];
        int i=0;
        int sum = 0;
        while(size > i)
        {
            System.out.print("Enter Element number "+ (i+1) + ": ");
            arr[i] = sc.nextInt();
            sum = arr[i]+sum;
            i++;
        }
        System.out.println("sum :" +sum);
        double avg = (double)sum/size;
        System.out.println("Avg :"+avg);
    }
}