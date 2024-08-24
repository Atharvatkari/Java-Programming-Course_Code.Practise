import java.util.*;
import java.util.LinkedList;
public class BinaryTreeB {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    static class BinaryTree{
        static int idx = -1;
        public static Node builtTree(int nodes[]){
            idx++;
            if(nodes[idx] == -1){
                return null;
            }
            Node newNode = new Node(nodes[idx]);
            newNode.left = builtTree(nodes);
            newNode.right = builtTree(nodes);
            return newNode;
        }
        public static void preorder(Node root){
            if(root == null){
                return;
            }
            System.out.print(root.data+" ");
            preorder(root.left);
            preorder(root.right);
        }
        public static void Inorder(Node root){
            if(root == null){
                return;
            }
            Inorder(root.left);
            System.out.print(root.data+" ");
            Inorder(root.right);
        }
        public static void PostOrder(Node root){
            if(root == null){
                return;
            }
            PostOrder(root.left);
            PostOrder(root.right);
            System.out.print(root.data+" ");
        }
        // LevelOrder
        public static void LevelOrder(Node root){
            if(root == null){
                return;
            }
            Queue<Node> q = new LinkedList<>();
            q.add(root);
            q.add(null);
            while (!q.isEmpty()) {
                Node currNode = q.remove();
                if ((currNode == null)) {
                    System.out.println();
                if(q.isEmpty()){
                    break;
                }else{
                    q.add(null);
                }
            }else{
                System.out.print(currNode.data+" ");
                if(currNode.left !=null){
                    q.add(currNode.left);
                }
                if (currNode.right !=null) {
                    q.add(currNode.right);
                }
            }
        }
    }
}

// height of a tree
public static int height(Node root){
    if (root == null) {
        return 0;
    }
    int leftHeight = height(root.left);
    int rigthHeight = height(root.right);
    return Math.max(leftHeight, rigthHeight) + 1;
}

// count of a nodes
public static int count(Node root){
    if(root == null){
        return 0;
    }
    int leftCount = count(root.left);
    int rightCount = count(root.right);
    return leftCount + rightCount + 1;
}

// Sum of a nodes
public static int sum(Node root){
    if(root == null){
        return 0;
    }
    int leftSum = sum(root.left);
    int rightSum = sum(root.right);
    return leftSum + rightSum + root.data;
}

// Diameter of a tree
public static int diameter(Node root){
    if(root == null){
        return 0;
    }
    int leftDiam = diameter(root.left);
    int leftHt = height(root.left);
    int rightDiam = diameter(root.right);
    int rightHt = height(root.right);

    int selfDiam = leftHt + rightHt + 1;
    return Math.max(selfDiam, Math.max(leftDiam, rightDiam));
}

static class Info{
    int diam;
    int ht;

    public Info(int diam, int ht){
        this.diam = diam;
        this.ht = ht;
    }
}
public static Info Diameter(Node root){ //O(N)
    if(root == null){
        return new Info(0,0);
    }
    Info leftInfo = Diameter(root.left);
    Info rightInfo = Diameter(root.right);

    int diam = Math.max(Math.max(leftInfo.diam, rightInfo.diam), leftInfo.ht+rightInfo.ht);

    int ht = Math.max(leftInfo.ht, rightInfo.ht) + 1;
    return new Info(diam, ht);
}

// subtree of another tree
public static boolean isIdentical(Node node, Node subRoot) {
    if (node == null && subRoot == null) {
        return true;
    }
    if (node == null || subRoot == null || node.data != subRoot.data) {
        return false;
    }
    return isIdentical(node.left, subRoot.left) && isIdentical(node.right, subRoot.right);
}

public static boolean isSubtree(Node root, Node subRoot) {
    if (root == null) {
        return false;
    }
    if (isIdentical(root, subRoot)) {
        return true;
    }
    return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);
}

// Top view of a tree
static class Info1 {
    Node node;
    int hd;
    public Info1(Node node, int hd) {
        this.node = node;
        this.hd = hd;
    }
}

public static void topView(Node root) {
    if (root == null) return;

    Queue<Info1> q = new LinkedList<>();
    Map<Integer, Node> map = new HashMap<>();
    int min = 0, max = 0;

    q.add(new Info1(root, 0));

    while (!q.isEmpty()) {
        Info1 curr = q.poll();
        
        if (!map.containsKey(curr.hd)) {
            map.put(curr.hd, curr.node);
        }
        
        if (curr.node.left != null) {
            q.add(new Info1(curr.node.left, curr.hd - 1));
            min = Math.min(min, curr.hd - 1);
        }
        
        if (curr.node.right != null) {
            q.add(new Info1(curr.node.right, curr.hd + 1));
            max = Math.max(max, curr.hd + 1);
        }
    }

    for (int i = min; i <= max; i++) {
        if (map.containsKey(i)) {
            System.out.print(map.get(i).data + " ");
        }
    }
    System.out.println();
}
    public static void main(String[] args) {
        int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree = new BinaryTree();
        Node root = tree.builtTree(nodes);
        System.out.println(root);
        //tree.preorder(root);
         tree.Inorder(root);
        //tree.PostOrder(root);

        //tree.LevelOrder(root);

        // Node root = new Node(1);
        // root.left = new Node(2);
        // root.right = new Node(3);
        // root.left.left = new Node(4);
        // root.left.right = new Node(5);
        // root.right.left = new Node(6);
        // root.right.right = new Node(7);

        // Node subRoot = new Node(2);
        // subRoot.left = new Node(4);
        // subRoot.right = new Node(5);

        // root.right.left.right = new Node(8);
        // root.left.right.left.left = new Node(9);
        // root.right.left.right.left = new Node(10);

        //System.out.println(height(root));
        //System.out.println(count(root));
        //System.out.println(sum(root));
       // System.out.println(diameter(root));
        //System.out.println(Diameter(root).diam);

        //System.out.println(isSubtree(root, subRoot));
        topView(root);
    }
}
