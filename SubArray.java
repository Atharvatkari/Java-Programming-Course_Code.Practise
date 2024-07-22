public class SubArray {

    // Bruteforce
    // public static void PrintMaxSubArray(int numbers[]){
    //     int currentSum = 0;
    //     int Max = Integer.MIN_VALUE;
    //     for(int i=0; i<=numbers.length; i++){
    //         int start = i;
    //         for(int j=i; j<numbers.length; j++){
    //             int end = j;
    //             currentSum = 0;
    //             for(int k=start; k<=end; k++){
    //               currentSum += numbers[k];
    //             }
    //             System.out.println(currentSum);
    //             if(Max < currentSum){
    //                 Max = currentSum;
    //             }
    //         }
    //     }
    //     System.out.print("Max sum : "+Max);
    // }

    // Prefix Sum
    // public static void PrefixSum(int numbers[]){
    //     int currentSum = 0;
    //     int maxSum = Integer.MIN_VALUE;
    //     int Prefix[] = new int[numbers.length];
    //     Prefix[0] = numbers[0];
        // Calculate Prefix Array
    //     for(int i=1; i<Prefix.length; i++){
    //         Prefix[i] = Prefix[i-1] + numbers[i];
    //     }
    //     for(int i=1; i<=numbers.length; i++){
    //         int start = i;
    //         for(int j=i; j<numbers.length; j++){
    //             int end = j;
    //             currentSum = start == 0 ? Prefix[end] : Prefix[end] - Prefix[start - 1];
    //             if(maxSum < currentSum){
    //                 maxSum = currentSum;
    //             }
    //         }
    //     }
    //     System.out.print("Max sum : "+maxSum);
    // }

    // KADANE'S
    public static void kadanes(int numbers[]){
        int maxSum = Integer.MIN_VALUE;
        int currentSum = 0;
        for(int i=0; i<numbers.length; i++){
            currentSum = currentSum + numbers[i];
            if(currentSum < 0){
                currentSum = 0;
            }
            maxSum = Math.max(maxSum, currentSum);
        }
        System.out.println("Max sum is : "+maxSum);
    }
    public static void main(String[] args) {
        int numbers[] = {-2,-3,4,-1,-2,1,5,-3};
        //PrintMaxSubArray(numbers);
        //PrefixSum(numbers);
        kadanes(numbers);
    }
}
