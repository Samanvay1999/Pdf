import java.util.Arrays;
import java.util.Scanner;

public class Cumulative {
    //Write a program that takes 5 numbers as input the program that will
    //take and then print the cumulative sum of the numbers?
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[5];
        int arr1[]=new int[5];
        int len=0;
        for (int i = 0; i <5 ; i++)
        {
            System.out.println("enter value for "+i+" index value");
            arr[i]=sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length ; i++) {
            int sum=0;
            for (int j = 0; j <=i; j++)
            {
                sum+=arr[j];
            }
            arr1[len]=sum;
            len++;
        }
        for (int i = 0; i < arr1.length ; i++) {
            System.out.print(arr1[i]+" ");
        }
    }
}