import java.util.Scanner;

public class Pattern_Q148
{
   //       A
    //    B A B
    //  C B A B C
    //D C B A B C D
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter a number");
       int m = sc.nextInt();

       int col=1;
       for (int i = 0; i <m ; i++) {
           char ch='A';
           ch+=i;
           for (int j = 1; j <m-i ; j++) {
               System.out.print(" ");
           }
           for (int j = 1; j <=col ; j++) {
               System.out.print(ch);
               if (j>col/2)
                   ch++;
               else
                   ch--;
           }
           System.out.println();
           col+=2;
       }
   }
}
