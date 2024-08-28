import java.util.Scanner;

public class Exceptions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your first number : ");
        int num1 = sc.nextInt();
        System.out.println("Enter your second number : ");
        int num2 = sc.nextInt();

        // int div = num1 / num2;
        // System.out.println(div);

        try{
            int div = num1/num2;
            System.out.println(div);
        }
        catch(ArithmeticException exception){
            System.out.printf("%s, enter valid values..",exception.getMessage());
        }
    }
}
