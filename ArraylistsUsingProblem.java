import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArraylistsUsingProblem {

    // Problem 1
    public static void PrintAL(ArrayList<Integer> list){
        for(int i=0; i<list.size(); i++){
            System.out.print(list.get(i)+" ");
        }
        System.out.println();
    }

    // Problem 2
    public static void reversePrint(ArrayList<Integer> list){
        for(int i=list.size()-1; i>=0; i--){
            System.out.print(list.get(i)+" ");
        }
        System.out.println();
    }

    // Problem 3
    public static void maxPrint(ArrayList<Integer> list){
        int max = Integer.MIN_VALUE;
        for(int i=0; i<list.size(); i++){
            if(max < list.get(i)){
                max = list.get(i);
            }
        }
        System.out.println("Max Element in the list is : "+max);
    }

    // Problem 4
    public static void minPrint(ArrayList<Integer> list){
        int min = Integer.MAX_VALUE;
        for(int i=0; i<list.size(); i++){
            if(min > list.get(i)){
                min = list.get(i);
            }
        }
        System.out.println("Minimum Element in the list is : "+min);
    }

    // Problem 5
    public static void swap(ArrayList<Integer> list, int idx1 , int idx2){
        int temp = list.get(idx1);
        list.set(idx1, list.get(idx2));
        list.set(idx2,temp);
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(5);
        list.add(9);
        list.add(3);
        list.add(6);

        // PrintAL(list);
        // System.out.print("Reverse Print : ");
        // reversePrint(list);
        // maxPrint(list);
        // minPrint(list);

        // int idx1 = 1 , idx2 = 3;
        // System.out.println(list);
        // swap(list, idx1, idx2);
        // System.out.println(list);

        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
        Collections.sort(list,Collections.reverseOrder());
        System.out.println(list);
    }
}
