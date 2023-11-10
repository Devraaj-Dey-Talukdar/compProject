import java.util.Scanner;

public class PrimeNumber
{
    public static void main(String[] args)
    {
        int size,c=0;        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of prime=");
        size = sc.nextInt();        
        int n=2;
        while(c<=size)
        {
            boolean flag = true;
            for(int i=2;i < n;i++)
            {
                if (n % i == 0)
                {
                    flag = false;
                    break;
                }
            }
            if (flag)
            {
                System.out.println("Number is prime="+n);
                c++;                
            } 
            n++;
        }
        
    }
}