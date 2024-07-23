public class Lec60_DiameterOfTree_BinaryTree02 {

    static class node{
        int data;
        node left, right;
        public node(int data){
            this.data = data;
            this.left = null;
            this.right = null;

        }
    }
    public static int height(node root){
        if(root == null){
            return 0;
        }
        int leftHeight = height(root.left);
        int rightHeight = height(root.right);
        int Height = Math.max(leftHeight, rightHeight)+1;
        return Height;

    }
    public static int diameter(node root){
        if(root == null){
            return 0;
        }
        int leftDia = diameter(root.left);
        int leftHig = height(root.left);
        int rightDia = diameter(root.right);
        int rightHig = height(root.right);
        int selfDia = leftHig + rightHig +1;
        int maxDia = Math.max(selfDia, Math.max(leftDia, rightDia));
        return maxDia ;
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
        System.out.println(diameter(root));
    }


}
