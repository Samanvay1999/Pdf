public class PatternHw
{
    public static void main(String[] args)
    {
        patternU();
        System.out.println();
         g();
        System.out.println();
        a();
        System.out.println();
        o();
        System.out.println();
        i();
    }
    static void patternU()
    {
        for (int i = 1; i <=4 ; i++)
        {
            for (int j = 1; j <=5 ; j++) {
                if (j==1 || i==4 || j==5)
                {
                    System.out.print("*");
                }
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
    static void g()
    {
        for (int i = 1; i <=4 ; i++) {
            for (int j = 1; j <=5 ; j++) {
                if ((j==1 && j<=3) ||  i==1|| (i==3 && j>=4) || i==4)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
    static void a()
    {
        for (int i = 1; i <=4 ; i++) {
            for (int j = 1; j <=4 ; j++) {
                if (i==1 || j==1 || i==3 || j==4)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
    static void o()
    {
        for (int i = 1; i <=4 ; i++) {
            for (int j = 1; j <=4 ; j++) {
                if (i==1 || j==1 || i==4 || j==4)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
    static void i()
    {
        for (int i = 1; i <=4 ; i++) {
            for (int j = 1; j <=5 ; j++) {
                if (i==1 || i==4 || j==3)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println(" ");
        }
    }

}
