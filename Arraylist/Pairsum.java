import java.util.*;
public class Pairsum {

    //optimized we will assume that the arraylist is sorted
public static boolean sumpair(ArrayList<Integer> list,int target)
{
    int lp=0;
    int rp=list.size()-1;

    while(lp<rp)
    {
        if(list.get(lp)+list.get(rp)== target)
        {
            return true;
        }
        else if(list.get(lp) + list.get(rp)<target)
        {
            lp++;
        }
        else if(list.get(lp) +list.get(rp) >target)
        {
            rp--;
        }

    }
    return false;
}


    //brute force
    // public static boolean getsum(ArrayList<Integer> list,int target)
    // {
    //     for(int i=0;i<list.size();i++)
    //     {
    //         for(int j =i+1;j<list.size();j++)
    //         {
    //             if(list.get(i)+ list.get(j)==target)
    //             {
    //                 return true;
    //             }
    //         }
    //     }
    //     return false;
    // }
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        int target=3;
        // System.out.println(getsum(list,target));
        System.out.println(sumpair(list,target));
    }
}
