public class InvertedHalfPyramid_Numbers {
    public static void pattern(int num){
        // Outer loop
        for(int i=1; i<=num; i++){
            // Inner Loop
            for(int j=1; j<=(num-i)+1; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        pattern(10);
    }
}
