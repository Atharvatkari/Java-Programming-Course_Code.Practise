public class Pattern {
    public static void main(String[] args) {
        // Star pattern
        for(int line=1; line<=10; line++){
            for(int star=1; line>=star; star++){
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
        // Inverted Star Pattern
        for(int line=1; line<=10; line++){
            for(int star=1; star<=(10-line)+1; star++){
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
        // Half Pyramid Pattern
        for(int line=1; line<=10; line++){
            for(int number=1; number<=line; number++){
                System.out.print(number );
            }
            System.out.println();
        }
        System.out.println();
        // Print Character Pattern
        char ch = 'A';
        for(int line=1; line<=10; line++){
            for(int chars=1; chars<=line; chars++){
                System.out.print(ch );
                ch++;
            }
            System.out.println();
        }
        System.out.println();
        // Square Pattern
        for(int r1=1; r1<=4; r1++){
            for(int c1=1; c1<=4; c1++){
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
        // Rectangle Pattern
        for(int r1=1; r1<=4; r1++){
            for(int c1=1; c1<=8; c1++){
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
        // Bottom Right Triangle Pattern
        for(int line=1; line<=10; line++){
            for(int star=1; star<=10; star++){
               if(line+star >= 10+1){
                System.out.print("*");
               }
               else{
                System.out.print(" ");
               }
            }
            System.out.println();
        }
        System.out.println();
        // Top Right Triangle Pattern
        for(int line=1; line<=10; line++){
            for(int star=1; star<=10; star++){
               if(star-line >= 0){
                System.out.print("*");
               }
               else{
                System.out.print(" ");
               }
            }
            System.out.println();
        }
        // X Pattern Printing
        for(int line=1; line<=5; line++){
            for(int star=1; star<=5; star++){
               if(star-line == 0 || star+line == 5+1){
                System.out.print("*");
               }
               else{
                System.out.print(" ");
               }
            }
            System.out.println();
        }
    
    }
}
