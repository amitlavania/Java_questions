public class pascaltrainglestar {
    public static void main(String[] args) {

        // 1st method
        // int n = 5;
        // for(int i=1;i<=2*n+1;i++)
        // {
        // for(int j=1;j<=i;j++)
        // {
        // System.out.print("*"+" ");

        // }

        // System.out.println();
        // }
        // for(int i=n-1;i>=0;i--)
        // {
        // for(int j=1;j<=i;j++)
        // {
        // System.out.print("*"+" ");
        // }
        // System.out.println();
        // }

        // 2nd method
    int n=5;
    int star=1;
    int row=1;
    while(row<=2*n-1)
    {        
        int i=1;
        while(i<=star)
        {
            System.out.print("*"+" ");
            i++;
        }
        if(row<n)
        {
            star++;
           
        }
        else{
            star--;
           

        }
        row++;
        System.out.println();
    }

     }

}
