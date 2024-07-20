public class Hollow_Rhombus {
    public static void pattern(int num){
        for(int i=1; i<=num; i++){
            // Spaces
            for(int j=1; j<=num-i; j++){
                System.out.print(" ");
            }
            // Hollow rectangle - stars
            for(int j=1; j<=num; j++){
                if(i==1 || i==num || j==1 || j==num){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        pattern(10);
    }
}
