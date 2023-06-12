// import java.util.*;
public class Largestnumber {
    public static  int largest(int numbers[])
    {
        int largestnum=Integer.MIN_VALUE;
        for(int i =0;i<numbers.length;i++)
        {
            if(largestnum<numbers[i])
            {
                largestnum=numbers[i];
            }    
        }
        return largestnum;
    }
    public static void main(String[] args) {
        int numbers[]={1,7,2,6,5,4,3};
        System.out.println("Largest value is:"+largest(numbers));    
    }
    
}
