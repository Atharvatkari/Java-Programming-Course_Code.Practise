public class ZeroOneTriangle_Pattern {
    public static void pattern(int num){
        for(int i=1; i<=num; i++){
            for(int j=1; j<=i; j++){
                if((i+j)%2 == 0){// even
                    System.out.print("1");
                }
                else{
                    System.out.print("0");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        pattern(10);
    }
}
