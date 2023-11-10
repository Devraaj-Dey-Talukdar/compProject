import java.util.Scanner;

public class GCDProgram
{
    public static void main(String[] args)
    {
        int a, b, gcd = 1;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a=");
        a = sc.nextInt();
        System.out.print("Enter b=");
        b = sc.nextInt();
        int min, max;
        min = a;
        if (min > b)
        {
            min = b;
            max = a;
        }
        else
        {
            min = a;
            max = b;
        }
        while (max > min)
        {
            int r = max % min;
            if (r == 0)
            {
                gcd = min;
                break;
            }
            else
            {
                max = min;
                min = r;
            }
        }
        System.out.println("GCD=" + gcd);
    }
}
