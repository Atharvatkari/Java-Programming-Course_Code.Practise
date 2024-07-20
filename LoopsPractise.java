import java.util.Scanner;

public class LoopsPractise {
    public static void main(String[] args) {

         //Question no 1:
        for(int i=0; i<5; i++){
            System.out.println("Hello");
            i+=2;
        }

        //Question no 2:
        Scanner sc = new Scanner(System.in);
        int number;
        int choice;
        int evenNum = 0;
        int oddNum = 0;
        do{
            System.out.print("Enter the number : ");
            number = sc.nextInt();
            if(number%2 == 0){
                evenNum+=number;
            }
            else{
                oddNum+=number;
            }
            System.out.print("If you want to continue,then enter 1 for continue otherwise enter the 0 : ");
            choice = sc.nextInt();
        }while(choice==1);

        System.out.println("Sum of the even number is : "+evenNum);
        System.out.println("Sum of the odd number is : "+oddNum);

        //Question no 3:
        System.out.print("Enter the number : ");
        int number = sc.nextInt();
        int fact=1;
        for(int i=1; number>=i; i++){
                fact *= i;
        }
            System.out.println("The factorial of your number is : " +fact);

        //Question no 4:
        System.out.print("Enter the number : ");
        int num = sc.nextInt();
        for(int i=1; i<=10; i++){
            System.out.printf("%d x %d = %d\n",num,i,num*i);
        }

        //Question 5:
        for(int i=0; i<=5; i++){
            System.out.println("i = "+i);
        }
        System.out.println("i after the loop = "+i);
    }
}