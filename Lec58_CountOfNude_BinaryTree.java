public class Lec58_CountOfNude_BinaryTree {

    static class node{
        int data;
        node left, right;
        public node(int data){
            this.data = data;
            this.left = null;
            this.right = null;

        }
    }
    public static int count(node root){
        if(root == null){
            return 0;
        }
        int leftCount = count(root.left);
        int rightCount = count(root.right);
        return leftCount+rightCount+1;
    }

    public static void main(String[] args){

//
//                1
//
//         2              3
//
//       4   5        6      7

        node root = new node(1);
        root.left = new node(2);
        root.right = new node(3);
        root.left.left = new node(4);
        root.left.right = new node(5);
        root.right.left = new node(6);
        root.right.right = new node(7);
        System.out.println(count(root));
    }
}
