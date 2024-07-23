public class StringCompression {
    public static String compress(String str){
        String newStr = " ";
        for(int i=0; i<str.length(); i++){
            Integer count = 1;
            while (i<str.length()-1 && str.charAt(i)==str.charAt(i+1)) {
                count++;
                i++;
            }
            newStr += str.charAt(i);
            if(count>1){
                newStr+=count.toString();
            }
        }
        return newStr;
    }
    public static void compress1(String str){
        StringBuilder sb = new StringBuilder();
        for(int i=1; i<str.length(); i++){
            Integer count = 1;
            while (i<str.length()-1 && str.charAt(i)==str.charAt(i+1)) {
                count++;
                i++;
            }
            sb.append(str.charAt(i));
            if(count > 1){
                sb.append(count.toString());
            }
        }
        System.out.println(sb.toString());
    }
    public static void main(String[] args) {
        String str = "aaabbcccddeeee";
        compress1(str);
    }
}
