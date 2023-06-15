import java.util.Scanner;

public class Diagonalsum
{
    public static int  diagonal(int matrix[][])
    {
        int sum=0;

        //efficient
        for(int i=0;i<matrix.length;i++)
        {
            //primarydiagonal
            sum+=matrix[i][i];
            //secondary
            if(i!=matrix.length-1-i)
            {
                sum+=matrix[i][matrix.length-i-1];
            }
        }
        return sum;

        //bruteforce
        // for(int i=0;i<matrix.length;i++)
        // {
        //     //primary diagonal
        //     for(int j=0;j<matrix[0].length;j++)
        //     {
        //         if(i==j)
        //         {
        //             sum+=matrix[i][j];
        //         }
        //         //secondary diagonal
        //         else if(i+j == matrix.length-1)
        //         {
        //             sum+=matrix[i][j];
        //         }
        //     }
        // }
        // return sum;
    }
    public static void main(String[] args) {
        int matrix[][]=new int[4][4];
        int n=matrix.length , m=matrix[0].length;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the matrix value: ");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                matrix[i][j]=sc.nextInt();
            }
        }
        System.out.println("The sum is : "+diagonal(matrix));
    }
}