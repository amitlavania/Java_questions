public class Findsubsets {

    public static  void findSub(String str,String ans,int i)
    {
        //base case
        if(i==str.length())
        {
            if(ans.length()==0)
            {
                System.out.println("null");
            }
            System.out.println(ans);
            return;
        }
        //yes
        findSub(str, ans+str.charAt(i), i+1);
        //no
        findSub(str, ans, i+1);
    }    public static void main(String[] args) {
        String str="abc";
        findSub(str, "", 0);
    }
    
}
