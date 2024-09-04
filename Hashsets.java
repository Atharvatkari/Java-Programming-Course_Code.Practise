import java.util.*;
public class Hashsets {
    public static void main(String[]args){
        HashSet<String> set = new HashSet<>();
        set.add("India");
        set.add("Bangalore");
        set.add("China");
        set.add("Indonesia");

        System.out.println(set);

        // // Using Iterator
        // Iterator it = set.iterator();
        // while(it.hasNext()){
        //     System.out.println(it.next());
        // }

        // // Using Enhanced For Loop
        // for(String country : set){
        //     System.out.println(country);
        // }

        // LinkedHashSet
        LinkedHashSet lhs = new LinkedHashSet<>();
        lhs.add("Atharva");
        lhs.add("Abhilash");
        lhs.add("Armaan");
        lhs.add("Abhira");
        lhs.add("Atharva");

        //System.out.println(lhs);

        // TreeSet
        TreeSet<String> ts = new TreeSet<>();
        ts.add("Armaan");
        ts.add("Atharva");
        ts.add("Akshara");
        ts.add("Abhinav");
        ts.add("Abhimanyu");

        System.out.println(ts);
    }
}
