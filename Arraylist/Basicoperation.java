import java.util.*;
public class Basicoperation{
public static void main(String[] args) {
    ArrayList<Integer> list=new ArrayList<>();
    //add
    list.add(1);
    list.add(2);
    list.add(3);
    list.add(4);
    System.out.println(list);
    //get
    // int element=list.get(3);
    // System.out.println("element is: "+element);

    //remove
    // int  element=list.remove(2);
    // System.out.println(element);

    //set
    // list.set(2,10);
    // System.out.println(list);

    //contains
    // System.out.println(list.contains(1));
    // System.out.println(list.contains(12));

    //size
    System.out.println(list.size());

    // reverse print the list
    for(int i=list.size()-1;i>=0;i--)
    {
        System.out.print(list.get(i) +" ");
    }
    System.out.println();






    
}
}