import java.util.Scanner;

public class BinarySearch_Array {
    public static int GetBinaryArray(int arr[], int key){
        int start = 0;
        int end = arr.length-1;
        while (start<=end) {
            int mid = (start+end) / 2 ;
            // Comparison
            if(arr[mid] == key){
                return mid;
            }
            //right
            if(arr[mid] < key){
                start = mid + 1;
            } 
            //left
            else{
                end = mid - 1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = {10,12,34,40,50};
        System.out.print("Enter the value of key : ");
        int key = sc.nextInt();

        System.out.println("The index for key is : "+GetBinaryArray(arr,key));
    }
}
