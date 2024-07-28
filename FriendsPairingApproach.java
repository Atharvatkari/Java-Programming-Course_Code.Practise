public class FriendsPairingApproach {
    public static int friendsParing(int n){
        if(n==1 || n==2){
            return n;
        }
        // Choice
        // Single
        // int fnm1 = friendsParing(n-1);
        // // Pair
        // int fnm2 = friendsParing(n-2);
        // int pairWays = (n-1) * fnm2;
        // total ways
        // int totWays = fnm1 + pairWays;
        // return totWays;
        return friendsParing(n-1) + (n-1)*friendsParing(n-2);
    }
    public static void main(String[] args) {
        System.out.println(friendsParing(3));
    }
}
