import java.util.Scanner;
class RoataingArray
{
    public static void main (String[]args)
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter size of array");
        int n = sc.nextInt();
        int arr1[] = new int [n];
        System.out.println("Enter all the array elements");
        for(int i=0;i<n;i++)
        {
            arr1[i]=sc.nextInt();
        }
        System.out.println("");
        int temp = arr1[0];
        for(int i=1;i<n;i++)
        {
            arr1[i-1] = arr1[i];
        }
        arr1[n-1]=temp;
        System.out.println("Rotated array :");
        for(int x:arr1)
        {
            System.out.print(x+",");
        }
    }
}
