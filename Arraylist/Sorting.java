import java.util.*;

public class Sorting { 

    public static void main(String[] args) {
        ArrayList<Integer> li=new ArrayList<>();
        li.add(2);
        li.add(5);
        li.add(1);
        li.add(9);
        li.add(7);
        System.out.println(li);
        Collections.sort(li);
        System.out.println(li);
        //descending 
        Collections.sort(li,Collections.reverseOrder());
        System.out.println(li);
    }


    
}
