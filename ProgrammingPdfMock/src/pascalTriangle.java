public class pascalTriangle
{
    public static void main(String[] args) {
        int row=5;
        for(int i=0;i<row;i++)
        {
            for(int m=1;m<row-i;m++)
            {
                System.out.print(" ");
            }
            int num=1;
            for(int j=0;j<=i;j++ )
            {
                System.out.print(num+" ");
                num=num*(i-j)/(j+1);
            }
            System.out.println();
        }
    }
}
