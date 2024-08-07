import java.util.Stack;

public class ValidParanthesesUsingStack {
    // Check valid parantheses or not
    public static boolean isValid(String str){
        Stack<Character> s = new Stack<>();
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            if(ch == '(' || ch == '{' || ch == '['){
                s.push(ch);
            }
            else{
                if(s.isEmpty()){
                    return false;
                }
                if((s.peek()=='(' && s.peek()==')')||
                (s.peek()=='{' && s.peek()=='}') ||
                (s.peek()=='[' && s.peek()==']')){
                    s.pop();
                }
                else{
                    return false;
                }
            }
        }
        if(s.isEmpty()){
            return true;
        }
        else{
            return false;
        }
    }

    // Check duplicate parantheses or not
    public static boolean isDuplicate(String str){
        Stack<Character> s = new Stack<>();

        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            // closing
            if(ch == ')'){
                int count = 0;
                while (s.peek() != '(') {
                    s.pop();
                    count++;
                }
                if(count<1){
                    return true;
                }
                else{
                    s.pop();
                }
            }
                else{
                    s.push(ch);
                }
            }
            return false;
        }

        // Max Area in Histogram
        public static void maxArea(int arr[]){
            int maxArea = 0;
            int nsr[] = new int[arr.length];
            int nsl[] = new int[arr.length];
            // Next Smaller Right
            Stack<Integer> s = new Stack<>();
            for(int i=arr.length-1; i>=0; i--){
                while (!s.isEmpty() && arr[s.peek()]>=arr[i]) {
                    s.pop();
                }
                if (s.isEmpty()) {
                    nsr[i] = arr.length;
                }
                else{
                    nsr[i] = s.peek();
                }
                s.push(i);
            }
            // Next Smaller Left
            s = new Stack<>();
            for(int i=0; i<arr.length; i++){
                while (!s.isEmpty() && arr[s.peek()]>=arr[i]) {
                    s.pop();
                }
                if (s.isEmpty()) {
                    nsl[i] = -1;
                }
                else{
                    nsl[i] = s.peek();
                }
                s.push(i);
            }
            // Current Area : width = j-i-1 = nsr[i]-nsl[i]-1
             for(int i=0; i<arr.length; i++){
                int height = arr[i];
                int width = nsr[i]-nsl[i]-1;
                int currArea = height * width;
                maxArea = Math.max(currArea, maxArea);
             }
             System.out.println("Maximum Area in histogram is : "+maxArea);
        }
    public static void main(String[] args) {
        // String str = "[()]";
        // System.out.println(isValid(str));
        // String str1 = "(((a+b) + (c+d)))";
        // System.out.println(isDuplicate(str1));
        int arr[] = {2,4};
        maxArea(arr);
    }
}
