import java.util.Scanner;

public class Permutation_Q45
{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter any String value");
        String word=s.next();
        int len=word.length()-1;
        findP(word,0,len);
    }
    public static void findP(String s,int m,int n)
    {
        if(m==n)
        {
            System.out.println(s);
            return;
        }
        for (int i = m; i <=n ; i++)
        {
            s=swap(s,m,i);
            findP(s,m+1,n);
            s=swap(s,m,i);
        }
    }
    public static String swap(String s,int m,int n)
    {
        char ch[]= s.toCharArray();
        char help=ch[m];
        ch[m]=ch[n];
        ch[n]=help;
       String s1=new String(ch);
        return s1;
    }
}
