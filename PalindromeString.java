public class PalindromeString {
    public static boolean palindromeOfString(String str){
        for(int i=0; i<str.length()/2; i++){
            int n = str.length();
            if(str.charAt(i) != str.charAt(n-1-i)){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
       String str= "nitin";
       boolean checkString = palindromeOfString(str);
       if(checkString){
        System.out.println("These string is a palindrome...");
       }
       else{
        System.out.println("These string is not a palindrome...");
       }
    }
}
