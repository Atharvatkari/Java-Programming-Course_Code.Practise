public class TilingApproach {
    public static int tilingProblem(int n){//2xn(floor size)
        // n is the length of the floor
        // Base Case
        if(n==0 || n==1){
            return 1;
        }
        // Kaam
        // Verticle choice 
        int fnm1 = tilingProblem(n-1);
        // Horizantal choice
        int fnm2 = tilingProblem(n-2);
        int totalWays = fnm1 + fnm2;
        return totalWays;
    }
    public static void main(String[] args) {
        System.out.println(tilingProblem(3));
    }
}
