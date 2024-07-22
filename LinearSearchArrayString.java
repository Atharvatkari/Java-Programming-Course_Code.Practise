import java.util.Scanner;

public class LinearSearchArrayString {
    public static String ArraySearch(String foodMenu[], String key){
        for(int i=0; i<foodMenu.length; i++){
            if(foodMenu[i].equals(key)){
                return foodMenu[i];
            }
        }
        return null;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String foodMenu[] = {"Samosa","Vadapav","Panipuri","Ragadasamosa","Noodles"};
        System.out.print("Enter the value of key : ");
        String key = sc.next();
        String index = ArraySearch(foodMenu, key);
        if(index == null){
            System.out.println("Not Found....");
        }
        else{
            System.out.println("Key is an index is : "+index);
        }
    }
}
