public class ButterFlyPattern {
    public static void pattern(int num){
        // 1st Half
        for(int i=1; i<=num; i++){
            // stars - i
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            // stars - 2*(num-i)
            for(int j=1; j<=2*(num-i); j++){
                System.out.print(" ");
            }
            // stars - i
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        // 2nd Half
        for(int i=num; i>=1; i--){
            // stars - i
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            // stars - 2*(num-i)
            for(int j=1; j<=2*(num-i); j++){
                System.out.print(" ");
            }
              // stars - i
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        pattern(10);
    }
}
