 class matrixTranspose
{
    public static void main (String[]args)
    {
        int[][]matrix = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };
        int rows = matrix.length;//no of rows
        int cols = matrix[0].length;//no of colomns
        
        int transpose[][]=new int [cols][rows];//rows --> col length , rows --> col length
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<cols;j++)
            {
                transpose[j][i]=matrix[i][j];//stores the values of rows of matrix in coloms of transpose
            }
        }
        //printing the transpose
        for(int i=0;i<cols;i++)
        {
            for(int j=0;j<rows;j++)
            {
                System.out.print(transpose[i][j]+" ");
            }
            System.out.println();
        }
    }
}