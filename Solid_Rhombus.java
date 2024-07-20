public class Solid_Rhombus {
    public static void pattern(int num){
        for(int i=1; i<=num; i++){
            // spaces
            for(int j=1; j<=num-i; j++){
                System.out.print(" ");
            }
            // Stars
            for(int j=1; j<=num; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        pattern(10);
    }
}
