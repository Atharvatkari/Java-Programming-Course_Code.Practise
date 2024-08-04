import java.util.ArrayList;

public class Arraylists {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(5);
        list.add(33);
        list.add(56);
        System.out.println(list);
        list.add(1,34);
        System.out.println(list);

        int element = list.get(2);
        System.out.println("The value of the index is : "+element);

        list.remove(3);
        System.out.println(list);

        list.set(3, 45);
        System.out.println(list);

        boolean checkVal = list.contains(45);
        System.out.println("The given value in the list is : "+checkVal);
    }
}
