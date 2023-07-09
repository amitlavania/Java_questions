import java.util.ArrayList;

public class Maximum {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        // add
        list.add(5);
        list.add(6);
        list.add(9);
        list.add(1);
        list.add(3);
        int max=Integer.MIN_VALUE;
        for(int i=0;i<list.size();i++)
        {
            // if(max<list.get(i))
            // {
            //     max=list.get(i);
            // }
            //or we can use
            max=Math.max(max,list.get(i));
        }
        System.out.println(max);

    }

}
