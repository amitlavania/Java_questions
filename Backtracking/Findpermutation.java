public class Findpermutation {

    public static void permutation(String  str, String ans )
    {   
        int n=str.length();
        if(n==0)
        {
            System.out.println(ans);
            return;
        }
        for(int i=0;i<n;i++)
        {
            char curr=str.charAt(i);
           
           String  Newstr=str.substring(0,i) + str.substring(i+1);
           permutation(Newstr, ans+curr);; 

        }
    }
    public static void main(String[] args) {
        String str="abc";
        permutation(str, "");
    }   
}
