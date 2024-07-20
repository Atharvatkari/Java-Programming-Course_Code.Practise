import java.util.Scanner;

public class Functions {
    // Check given number is a prime or not..
    public static boolean CheckPrime(int num){
        boolean isPrime = true; 
        if(num == 2){
            System.out.println("Your number is prime..");
        }
        for(int i=2; i<=Math.sqrt(num); i++){
            if(num%2==0){
                isPrime = false;
            }
        }
            if(isPrime == true){
                System.out.println("Your number is prime...");
            }
            else{
                System.out.println("Your number is not prime...");
            }
        return true;
    }

    // Check reverse of the given number...
    public static int ReveseNumber(int num){
        int reversedNumber = 0;
        while (num > 0) {
            int lastDigit = num%10;
            num = num / 10;
            reversedNumber = (reversedNumber*10) + lastDigit;
        }
       return reversedNumber;
    }

    // Sum of Digits
    public static int SumOfDigits(int num){
        int sum = 0;
        for(int i=0; i<=num; i++){
            int lastDigit = num % 10;
            num /= 10;
            sum = sum + lastDigit;
        }
        return sum;
    }

    // Check Factorial of the Given Number
    public static int Factorial(int num){
        int fact = 1;
        for(int i=1; i<=num; i++){
            fact = fact*i;
        } 
        return fact;
    }

    // Check a Value of Bionomial Coefficient
    public static int BionomialCoefficient(int num, int r){
        int a = Factorial(num);
        int b = Factorial(r);
        int num_r = Factorial(num-r);

        int bioCoefficient = a / (b * num_r);
        return bioCoefficient;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number : ");
        int num = sc.nextInt();
        // System.out.print("Enter the value of r : ");
        // int r = sc.nextInt();
    
        // int reversedNumber = ReveseNumber(num);
        // if(reversedNumber == num){
        //     System.out.println("Your number is palindrome...");
        // }
        // else{
        //     System.out.println("Your number is not palindrome...");
        // }
        // int sum = SumOfDigits(num);
        // System.out.println("Sum of the given numbers digit is : "+sum);
        //int fact = Factorial(num);
        //System.out.println("The factorial of given number is : "+fact);
        // int bioCoefficient = BionomialCoefficient(num, r);
        // System.out.println("The given value of bionomial coeffient is : "+bioCoefficient);
    }
}
