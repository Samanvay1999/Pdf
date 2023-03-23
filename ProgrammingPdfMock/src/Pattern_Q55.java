import java.util.Scanner;

public class Pattern_Q55
{
    /*                  1
                      1 2 1
                    1 2 3 2 1
                  1 2 3 4 3 2 1
                1 2 3 4 5 4 3 2 1
              1 2 3 4 5 6 5 4 3 2 1
            1 2 3 4 5 6 7 6 5 4 3 2 1  */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter row value ");
        int n=sc.nextInt();
        int t=n;

        int col=1;
        for (int i = 0; i <n ; i++)
        {
            int p=1;
            for (int j =1; j<n-i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <=col; j++)
            {

                System.out.print(p);
                if (j>col/2)
                {
                    p--;
                }
                else
                {
                    p++;
                }

            }
            col+=2;
            System.out.println();
        }
    }

}
