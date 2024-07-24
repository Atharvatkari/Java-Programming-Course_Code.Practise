public class RecursionsBasics {
    // Problem 1
    public static void PrintDec(int num){
        if(num == 1){
            System.out.println(num);
            return ;
        }
        PrintDec(num-1);
        System.out.println(num+" ");
    }

    // Problem 2
    public static void printInc(int num){
        if(num == 1){
            System.out.println(num+" ");
            return;
        }
        System.out.println(num+" ");
        printInc(num - 1);
    }

    // Problem 3
    public static int fact(int num){
        if(num == 0){
            return 1;
        }
        int fnm1 = fact(num-1);
        int fn = num * fact(num-1);
        return fn;
    }

    // Problem 4
    public static int calSum(int num){
        if(num==1){
            return 1;
        }
        int snm1 = calSum(num-1);
        int sn = num + snm1;
        return sn;
    }

    // Problem 5
    public static int fib(int num){
        if(num==1 || num==0){
            return num;
        }
        int fnm1 = fib(num-1);
        int fin2 = fib(num-2);
        int fn = fnm1 + fin2;
        return fn;
    }

    // Problem 6
    public static boolean isSorted(int arr[], int i){
        if(i==arr.length-1){
            return true;
        }
        if(arr[i]>arr[i+1]){
            return false;
        }
        return isSorted(arr, i+1);
    }

    // Problem 7
    public static int firstOccurence(int arr[], int key, int i){
        if(i == arr.length){
            return -1;
        }
        if(arr[i]==key){
            return i;
        }
        return firstOccurence(arr, key, i+1);
    }

    // Problem 8
    public static int lastOccurence(int arr[], int key, int i){
        if(i == arr.length){
            return -1;
        }
        int isFound = lastOccurence(arr, key, i+1);
        if(isFound == -1 && arr[i]==key){
            return i;
        }
        return isFound;
    }

    // Problem 9
    public static int power(int x, int n){
        if(n==0){
            return 1;
        }
        int xnm1 = power(x, n-1);
        int xn = x * xnm1;
        return xn;
    }

    // Problem 10
    public static int optimizedPower(int x, int n){
        if(n==0){
            return 1;
        }
        //int halfpowersqu = optimizedPower(x, n/2)*optimizedPower(x, n/2);
        int halfPower = optimizedPower(x, n/2);
        int halfpowersqu = halfPower*halfPower;
        // n is odd
        if(n%2 != 0){
            halfpowersqu = x * halfpowersqu ;
        }
        return halfpowersqu;

    }
    public static void main(String[] args) {
        //PrintDec(10);
        //printInc(10);
        //System.out.println(fact(10));
        //System.out.println(calSum(10));
        //System.out.println(fib(100));
        // int arr[] = {1,2,6,3,4,5,10,11};
        // System.out.println(isSorted(arr, 0));
        // int arr[] = {8,3,6,9,5,10,2,5,3};
        // int key = 5;
        //System.out.println(firstOccurence(arr, key, 0));
        //System.out.println(lastOccurence(arr, key, 0));
        //System.out.println(power(2, 3));
        System.out.println(optimizedPower(2, 5));
    }
}
