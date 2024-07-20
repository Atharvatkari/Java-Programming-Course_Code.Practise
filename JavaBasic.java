import java.util.Scanner;

public class JavaBasic{
    public static void main(String[] args) {
        // Variables and Datatypes Questions

        // 1.Average of three numbers
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your first number : ");
        int num1 = sc.nextInt();
        System.out.print("Enter your Second number : ");
        int num2 = sc.nextInt();
        System.out.print("Enter your Third number : ");
        int num3 = sc.nextInt();

        int avg = (num1 + num2 + num3) / 3 ;
        System.out.print("The average of your three input numbers : " +avg);

        // 2.Area of Square
        System.out.print("Please enter your values of side : ");
        int side = sc.nextInt();
        int area = side * side;
        System.out.print("Area of Squares is : " +area);

        // 3.Total costs of three items
        System.out.print("Enter the price of your pencil : ");
        float pencil = sc.nextFloat();
        System.out.print("Enter the price of your pen : ");
        float pen = sc.nextFloat();
        System.out.print("Enter the price of your eraser : ");
        float eraser = sc.nextFloat();

        float totalCosts = pencil + pen + eraser;
        System.out.println("Total costs of your items is : " +totalCosts);

        float gst = totalCosts * 0.18f;
        System.out.print("The total price after applying by gst in your items is : "+gst);

        // 4.Type of results
        byte b = 4;
        char c = 'a';
        short s = 512;
        int i = 1000;
        float f = 3.14f;
        double d = 99.9954;

        double result = (f*b) + (i*c) - (d*s);
        System.out.println(result);

        // 5.Stetement
        int $ = 24;
        System.out.println($);

    }
}