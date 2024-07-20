public class Diamond_Pattern {
    public static void pattern(int num){
        for(int i=1; i<=num; i++){
            // spaces
            for(int j=1; j<=num-i; j++){
                System.out.print(" ");
            }
            // stars
            for(int j=1; j<=2*(i)-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=num; i>=1; i--){
            for(int j=1; j<=num-i; j++){
                System.out.print(" ");
            }
            // stars
            for(int j=1; j<=2*(i)-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        pattern(8);
    }
}
