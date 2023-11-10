import java.util.Scanner;

public class TwistedPrime
{
    public static void main(String[] args)
    {
        // TODO code application logic here
        int n, num, r,
        rev = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number=");
        n = sc.nextInt();
        num = n;
        while (num > 0)
        {
            r = num % 10;
            rev = (rev * 10) + r;
            num = num / 10;
        }
        if (prime(n) && prime(rev))
        {
            System.out.println("Twisted Prime");
        }
        else
        {
            System.out.println("Not Twisted Prime");
        }
    }
    static boolean prime(int n)
    {
        // TODO code application logic here
        int i = 2;
        boolean flag = true;
        while (n > i)
        {
            if (n % 2 == 0)
            {
                flag = false;
                break;
            }
            i++;
        }
        return flag;
    }
}
