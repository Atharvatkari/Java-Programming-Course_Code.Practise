import java.util.*;
import java.util.HashMap;

public class CountDistitinctElements {
    public static void main(String[] args) {
        int num[] = {4,3,2,5,6,7,3,4,2,1,9};
        HashSet<Integer> set = new HashSet<>();

        for(int i=0; i<num.length; i++){
            set.add(num[i]);
        }
        System.out.println("ans = "+set.size());
    }
}
