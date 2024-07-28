public class RemoveDuplicatesApproach {
    public static void removeDuplicates(String str, int idx, StringBuilder sb, boolean map[]){
        // Base Case
        if(idx == str.length()){
            System.out.println(sb);
            return;
        }
        // Kaam
        char currChar = str.charAt(idx);
        if(map[currChar-'a']==true){
            // duplicate
            removeDuplicates(str, idx+1, sb, map);
        }
        else{
            map[currChar-'a'] = true;
            removeDuplicates(str, idx+1, sb.append(currChar), map);
        }
    }
    public static void main(String[] args) {
        String str = "appnnacollege";
        removeDuplicates(str, 0, new StringBuilder(" "), new boolean[26]);
    }
}
