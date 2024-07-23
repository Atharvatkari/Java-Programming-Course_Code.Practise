import java.util.Arrays;
import java.util.Scanner;

public class StringsPracticeQuestions {


    public static void main(String[] args) {
        // Count LowerCase Vowels
        // String vowels = new Scanner(System.in).next();
        // int count = 0;
        // for(int i=0; i<vowels.length(); i++){
        //     char ch = vowels.charAt(i);
        //     if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
        //         count++;
        //     }
        // }
        // System.out.println("Count of lowercase vowels is : "+count);

        // Ouput of Code
        // String str = "ShradhaDidi";
        // String str1 = "ApnaCollege";
        // String str2 = "ShradhaDidi";
        // System.out.println(str.equals(str1)+ " " + str.equals(str2));

        // Output of Code
        // String str3 = "ApnaCollege".replace("l", "");
        // System.out.println(str3);

        // Check Anagrams of each other 
        String s1 = "atharva";
        String s2 = "falguni";
        //Convert Strings to lowercase. Why? so thatwe don't have to checkseparately for lower & uppercase.
        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();
        // First check - if the lengths are the same
        if(s1.length() == s2.length()){
            // convert strings into char array
            char[] s1charArray = s1.toCharArray();
            char[] s2charArray = s2.toCharArray();
            // sort the char array
            Arrays.sort(s1charArray);
            Arrays.sort(s2charArray);
            // if the sorted char arrays are sameor identical then the strings areanagram
            boolean result = Arrays.equals(s1charArray, s2charArray);
            if(result){
                System.out.println(s1 + " and " + s2 + " are the anagrams of each other.");
            }
            else{
                System.out.println(s1 + " and " + s2 + " are not the anagrams of each other.");
            }
        }else{
            // case when lengths are not equal
            System.out.println(s1 + " and " + s2 + " are not the anagrams of each other.");
        }
    }
}
