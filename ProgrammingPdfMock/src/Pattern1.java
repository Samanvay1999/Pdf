public class Pattern1
{
    public static void main(String[] args)
    {
        for (int i = 1; i <=4; i++) {
            for (int j = 1; j <=27 ; j++) {
           if (j==1 || i==4&&j<=5|| j==5 || i==6 || i==1  )
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }

    }
}
