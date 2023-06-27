import java.util.Scanner;
public class Spiralmatrix {
    public static void printspiral(int matrix[][])
    {
        int startrow=0;
        int startcol=0;
        int endrow=matrix.length-1;
        int endcol=matrix.length-1;
        while(startrow<=endrow && startcol<=endcol)
        {
            //top remove
            for(int j=startcol;j<=endcol;j++)
            {
                System.out.print(matrix[startrow][j]+ " ");
            }
            //right
            for(int i=startrow+1;i<=endrow;i++)
            {
                System.out.print(matrix[i][endcol]+" ");
            }
            //bottom
            for(int j=endcol-1;j>=startcol;j--)
            {
                if(startcol==endcol)
                {
                    break;
                }
                System.out.print(matrix[endrow][j]+" ");
            }
            //left
            for(int i=endrow-1;i>=startrow+1;i--)
            {
                if(startrow==endrow)
                {
                     break;
                }
                System.out.print(matrix[i][startcol]+" ");
            }
            startcol++;
            startrow++;
            endcol--;
            endrow--;
        }
        System.out.println();
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
        printspiral(matrix);
    }
    
}
 