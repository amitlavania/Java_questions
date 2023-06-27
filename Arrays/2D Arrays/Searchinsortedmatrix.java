import java.util.Scanner;

public class Searchinsortedmatrix {
    public static boolean search(int matrix[][], int key)
    {
        int rows=0 , col=matrix.length-1;
        while(rows< matrix.length && col>0)
        {
            if(matrix[rows][col] == key)
            {
                System.out.println("found key at (" + rows+ "," + col + ")");
                return true;
            }
            
            else if(key <matrix[rows][col])
            {
                col--;
            }
            else{
                rows++;
            }
        }
        System.out.println("Key not found");
        return false;
    }
    public static void main(String[] args) {
        int key=33;
        int matrix[][]=new int[4][4];
        int n=matrix.length , m=matrix[0].length;
        // int key=33;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the matrix value: ");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                matrix[i][j]=sc.nextInt();
            }
        }
         search(matrix,key);
    }
        
}
    
