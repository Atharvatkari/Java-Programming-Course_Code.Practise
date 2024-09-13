public class Tries {
    static class Node{
        Node children[] = new Node[26];
        boolean eow = false;

        Node(){
            for(int i=0; i<26; i++){
                children[i] = null;
            }
        }
    }
    public static Node root = new Node();

    public static void insert(String words){
        Node curr = root;
        for(int level=0; level<words.length(); level++){
            int idx = words.charAt(level) - 'a';
            if(curr.children[idx] == null){
                curr.children[idx] = new Node();
            }
            curr = curr.children[idx];
        }
        curr.eow = true;
    }
    public static boolean search(String key){
        Node curr = root;
        for(int level=0; level<key.length(); level++){
            int idx = key.charAt(level) - 'a';
            if(curr.children[idx] == null){
                return false;
            }
            curr = curr.children[idx];
        }
        return curr.eow == true;
    }

    // 1st problem = Word Break 
    public static boolean wordBreak(String key){
        if(key.length() == 0){
            return true;
        }
        for(int i=0; i<=key.length(); i++){
            if (search(key.substring(0,i)) && wordBreak(key.substring(i))) {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        // String words[] = {"the","a","there","their","any","thee"};
        // for(int i=0; i<words.length; i++){
        //     insert(words[i]);
        // }

        // System.out.println(search("their"));
        // System.out.println(search("atharva"));
        // System.out.println(search("any"));
        // System.out.println(search("thee"));

        String arr[] = {"i","like","sam","samsung","mobile","ice"};
        for(int i=0; i<arr.length; i++){
            insert(arr[i]);
        }
        String key = "ilikesamsungmobile";
        System.out.println(wordBreak(key));



    }
}
