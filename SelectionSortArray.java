public class SelectionSortArray {
    public static void SelectionSort(int arr[]){
        for(int i=0; i<arr.length-1; i++){
            int minPosition = i;
            for(int j=i+1; j<arr.length-1; j++){
                if(arr[minPosition]>arr[j]){
                    minPosition = j;
                }
            }
            // Swap
            int temp = arr[minPosition];
            arr[minPosition] = arr[i];
            arr[i] = temp;
        }
    }
    public static void printArray(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[] = {5,4,1,3,2,0,1,2};
        SelectionSort(arr);
        printArray(arr);
    
    }
}
