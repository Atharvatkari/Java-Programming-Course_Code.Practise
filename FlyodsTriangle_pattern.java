public class FlyodsTriangle_pattern {
    public static void Pattrn(int num){
        int counter = 1;
        for(int i=1; i<=num; i++){
            for(int j=1; j<=i; j++){
                System.out.print(counter +" ");
                counter++;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Pattrn(5);
    }
}
