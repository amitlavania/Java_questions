import java.util.*;
public class Palindrome {
    public static boolean isPalindrome(String str)
    {
        for(int i=0;i<str.length()/2;i++)
        {
            int n=str.length();
            if(str.charAt(i)!=str.charAt(n-i-1))
            {
                return false;
            }
            
        }
        return true;
    }
 
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str=sc.nextLine();
        System.out.println(isPalindrome(str));
        
    }


    
}
