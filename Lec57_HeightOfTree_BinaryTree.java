public class Lec57_HeightOfTree_BinaryTree {
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
        System.out.println(height(root));
    }
}
