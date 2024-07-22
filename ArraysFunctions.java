public class ArraysFunctions {
    public static void main(String[] args) {
        // Equal Function
        String s1 = "Tony";
        String s2 = "Tony";
        String s3 = new String("Tony");
        if(s1.equals(s3)){
            System.out.println("Strings are equal...");
        }
        else{
            System.out.println("Strings are not equal...");
        }

        // SubString Function
        String str = "HelloWorld";
        System.out.println(str.substring(0, 5));

        // CompareTo Function
        String fruits[] = {"apple","mango","banana"};
        String largest = fruits[0];
        for(int i=0; i<fruits.length; i++){
            if(largest.compareTo(fruits[i])<0){
                largest = fruits[i];
            }
            }
            System.out.println(largest );

            // StringBuilder
            StringBuilder sb = new StringBuilder("");
            for(char ch='a'; ch <= 'z'; ch++){
                sb.append(ch);
            }
            System.out.println(sb.length());
       }

    }
