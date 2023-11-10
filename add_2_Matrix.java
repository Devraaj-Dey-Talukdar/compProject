
class add_2_Matrix
{
    public static void main (String[]args)
    {
        int A[][] = {
            {0,1},
            {1,0},
        };
        int B[][] = {
            {2,4},
            {6,8},
        };
        int sum[][] = new int [A.length][A[0].length];
        for(int i=0;i<A.length;i++)
        {
            for(int j=0;j<A[0].length;j++)
            {
                sum[i][j]= A[i][j]+B[i][j];
            }
        }
        
        for(int i=0;i<2;i++)
        {
            for(int j=0;j<2;j++)
            {
                System.out.print(sum[i][j]+" ");
            }
            System.out.println();
        }
    }
}