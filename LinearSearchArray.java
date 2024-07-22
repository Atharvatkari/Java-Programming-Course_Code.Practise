import java.util.Scanner;

public class LinearSearchArray {
    public static int ArrayCC(int key, int number[]){
        for(int i=0; i<number.length; i++){
            if(number[i]==key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number[] = {10,20,22,45,56,33};
        System.out.print("Enter the value of key : ");
        int key = sc.nextInt();
        int index = ArrayCC(key, number);
        if(index == -1){
            System.out.println("Not Found....");
        }
        else{
            System.out.println("Key is an index is : "+index);
        }
    }
}
