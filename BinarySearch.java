import java.util.*;

public class BinarySearch
{
    public static void main(String[] args)
    {
        int n, lb, ub, mid, pos = -1;
        int ar[] = new int[10];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 10; i++)
        {
            System.out.print("Enter the number ar[" + i + "]:");
            ar[i] = sc.nextInt();
        }
        System.out.print("Enter number to be search:");
        n = sc.nextInt();
        lb = 0;
        ub = 9;
        while (lb < ub)
        {
            mid = (lb + ub) / 2;
            if (ar[mid] == n)
            {
                pos = mid + 1;
                break;
            }
            else if (ar[mid] > n)
            {
                ub = mid - 1;
            }
            else
            {
                lb = mid + 1;
            }
        }
        if (pos == -1)
        {
            System.out.println("Number not found.");
        }
        else
        {
            System.out.println("Position=" + pos);
        }
    }
}
