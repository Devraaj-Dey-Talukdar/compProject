class matrixMultiply
{
    public static void main (String[]args)
    {
        int[][] matrix1 = {
            {2, 4},
            {6, 8}
        };
        
        int[][] matrix2 = {
            {3, 5},
            {7, 9}
        };
        
        int row = matrix1.length;
        int colmn = matrix1[0].length;
        int[][] result = new int[row][colmn];
        
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<colmn;j++)
            {
                result[i][j] = 0;
                for(int k =0;k<colmn;k++)
                {
                    result[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }
        
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < colmn; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
}