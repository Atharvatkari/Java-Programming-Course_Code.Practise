import java.util.ArrayList;
import java.util.Collections;

public class ArrayListPractiseQuestions {
    // Problem 1
    public static boolean checkMonotone(ArrayList<Integer> list){
        // for(int i=0; i<list.size(); i++){
        //     for(int j=i+1; j<list.size(); j++){
        //         if(list.get(i)<=list.get(j)){
        //             System.out.println("Monotone is in increasing order...");
        //             return true;
        //         }
        //         if(list.get(i)>=list.get(j)){
        //             System.out.println("Monotone is in decreasing order...");
        //             return true;
        //         }
        //     }
        // }
        // return false;
        boolean inc = true;
        boolean dec = true;
        for(int i=0;i<list.size()-1;i++) {
            if(list.get(i) >list.get(i+1)){
               inc = false; 
            }
            if(list.get(i) <list.get(i+1)){
               dec = false;
            }
        }
        return inc||dec;
    }

    // Problem 2
    public static ArrayList<Integer> findLonely(ArrayList<Integer> list){
        Collections.sort(list);
        ArrayList<Integer> list1 = new ArrayList<>();
        for(int i=1; i<list.size()-1; i++){
            if(list.get(i-1)+1 < list.get(i) && list.get(i)+1 < list.get(i+1)){
                list1.add(list.get(i));
            }
        }
    
        if(list.size()==1){
            list1.add(list.get(0));
        }
        if(list.size() > 1){
            if(list.get(0)+1 < list.get(1)){
                list1.add(list.get(0));
            }
            if(list.get(list.size()-2) < list.get(list.size()-1)){
                list1.add(list.get(list.size()-1));
            }
        }
        return list1 ;

    }
    public static int mostFrequent(ArrayList<Integer> list, int key){
        int [] results = new int[1000];

        for(int i=0; i<list.size()-1; i++){
            if(list.get(i)==key){
                results[list.get(i+1)-1]++;
            }
        }

        int max = Integer.MIN_VALUE;
        int ans = 0;

        for(int i=0; i<1000; i++){
            if(results[i] > max){
                max = results[i];
                ans = i+1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(2);
        list.add(2);
        list.add(2);
        list.add(3);
        int key = 2;

        //System.out.println(checkMonotone(list));
        //System.out.println(findLonely(list));
        System.out.println(mostFrequent(list, key));
    }
}
