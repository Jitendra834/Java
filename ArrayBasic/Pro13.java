

// create a program to merge two sorted array


import java.util.*;
public class Pro13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first array size :");
        int s1 = sc.nextInt();
        int arr1[] = new int[s1];
        System.out.println("Enter array elemt in sorted :");
        for(int i=0;i<s1;i++)
        {
            System.out.print("Enter element number "+(i+1)+": ");
            arr1[i] = sc.nextInt();

        }
        System.out.print("Enter second array size :");
        int s2 = sc.nextInt();
        int arr2[] = new int[s2];
        for(int i=0;i<s2;i++)
        {
            System.out.print("Enter element number "+(i+1)+": ");
            arr2[i] = sc.nextInt();
        }

        int merge[] = new int[s1 + s2];
        int k=0,j=0,i=0;
        for(k=0;k< merge.length;k++)
        {
            if(i < s1 && j < s2 )
            {
                if(arr1[i] < arr2[j])
                {
                    merge[k] = arr1[i];
                    i++;
                }
                else {
                    merge[k] = arr2[j];
                    j++;
                }
            }
            else if(i< s1)
            {
                merge[k] = arr1[i];
                i++;
            }
            else {
                merge[k] = arr2[j];
                j++;
            }
        }
        for(i=0;i<merge.length;i++)
        {
            System.out.print(merge[i]+" ");
        }
    }
}
