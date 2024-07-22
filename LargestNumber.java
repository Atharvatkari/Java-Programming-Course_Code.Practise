public class LargestNumber {
    public static int Largest(int numbers[]){
        int Largest = Integer.MIN_VALUE;
        int Smaller = Integer.MAX_VALUE;
        for(int i=1; i<numbers.length; i++){
            if(Largest < numbers[i]){
                Largest = numbers[i];
            }
            if(Smaller > numbers[i]){
                Smaller = numbers[i];
            }
        }
        System.out.println("Smallest value is : "+Smaller);
        return Largest;
    }
    public static void main(String[] args) {
        int numbers[] = {23,45,3,55,24,12};
        System.out.println("Largest value is : "+Largest(numbers));
    }

}
