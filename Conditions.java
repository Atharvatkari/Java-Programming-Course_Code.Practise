import java.util.Scanner;

public class Conditions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if(num % 3 == 0 && num % 5 != 0){
            System.out.println("Fizz");
        }
        else if (num % 5 == 0 && num % 3 != 0){
            System.out.println("Buzz");
        }
        else if (num % 3 == 0 && num % 5 == 0){
            System.out.println("FizzBuzz");
        }
    }
}
