public class transpose {
    public static void main(String[] args) {

        int row=2 , column=3;
        int matrix[][]={{2,3,7},{5,6,7}};
        printmatrix(matrix);

        int transpose[][]=new int[column][row];
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<column;j++)
            {
                transpose[j][i]=matrix[i][j];
            }
        }
        printmatrix(transpose);
        
    }
    public static void printmatrix(int matrix[][])
    {
    System.out.println("the matrix is : ");
    for(int i=0;i<matrix.length;i++)
    {
        for(int j=0;j<matrix[0].length;j++)
        {
            System.out.print(matrix[i][j]+ " ");
        }
        System.out.println();
    }
    }
}
