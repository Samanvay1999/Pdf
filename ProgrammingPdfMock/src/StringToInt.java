public class StringToInt
{
    //Write a program to convert string into int
    public static void main(String[] args)
    {
        String num="453";
        char a[]=num.toCharArray();
        int n=0;
        for (int i = 0; i <a.length ; i++)
        {
            int t=a[i]-48;
           n= n*10+t;
        }
        System.out.println(n);

    }
}
