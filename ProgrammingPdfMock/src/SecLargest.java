import java.util.Scanner;

public class SecLargest
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int n= sc.nextInt();
        int large=0;
        int small=9;
        int te=n;
        while(n!=0)
        {
            int ld=n%10;
            if (ld>large)
            {
                large=ld;
            }
            if (small>ld)
            {
                small=ld;
            }
            n/=10;
        }
        System.out.println(small+" small");
        System.out.println("large "+large);
        int l=0;
        int sm=9;
        while (te!=0)
        {
            int ld=te%10;
            if (ld<large && ld>l)
            {
                l=ld;
            }
            if (small<ld && ld<sm)
            {
                sm=ld;
            }
            te/=10;
        }
        System.out.println("2nd largest "+l);
        System.out.println("2nd smallest "+sm);
    }
}
