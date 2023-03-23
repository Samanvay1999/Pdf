public class FiboInRev
{
    //Write a program to print first 10 fibonacci series in reverse order.
    public static void main(String[] args) {
        int a=0;
        int b=0;
        int c=1;
        int count=0;
        while(count<10)
        {
            System.out.print(b+" ");
            count++;
            a = b;//34
            b = c;//55
            c = a + b;//89
        }
        System.out.println();
        System.out.println("--------------------------------");
        while(count>0)
        {
            System.out.print(a+" ");
            count--;
            c=b-a;//21
            b=a;//34
            a=c;//21

        }
    }
}
