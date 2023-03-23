import java.util.Scanner;

public class Q79 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int m= sc.nextInt();
        for (int i = 0; i <m ; i++) {
            for (int j = 1; j <m-i ; j++)
            {
                System.out.print(" ");
            }
            int num=1;
            for (int j = 0; j <=i ; j++) {
                System.out.print(num+" ");
                num=num*(i-j)/(j+1);
            }
            System.out.println();
        }
    }
}
