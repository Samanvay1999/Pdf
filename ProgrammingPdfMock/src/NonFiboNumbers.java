import java.util.LinkedList;
import java.util.Scanner;

public class NonFiboNumbers
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 1st number");
        int m= sc.nextInt();
        System.out.println("Enter 2nd number");
        int n=sc.nextInt();
        int a=0,b=1,c=1;
        LinkedList<Integer> l=new LinkedList<>();

//        while (b<=n)
//        {
//            l.add(b);//0 1
//            a=b;//0 1
//            b=c;//1 1
//            c=a+b;//1 2
//        }
//        System.out.println(l);
//        for (int i = m; i <=n ; i++)
//        {
//            if (!l.contains(i))
//                System.out.print(i+" ");
//
//        }

        for (int i = m; i <=n ; i++)
       {
            if (c==i)
            {
                a=b;
                b=c;
                c=a+b;
            }
           else
            {
                l.add(i);
            }
        }
        System.out.print(l);
    }
}
