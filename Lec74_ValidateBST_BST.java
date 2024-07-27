public class Lec74_ValidateBST_BST {

    static class Node{
        int data;
        Node left;
        Node right;

        public Node(int data){
            this.data = data;
        }

    }

    public static boolean isValidBST(Node root, Node min, Node max){
        if(root == null){
            return true;
        }

        if(min != null && root.data <= min.data){
            return false;
        } else if (max != null && root.data >= max.data) {
            return false;
        }

        return isValidBST(root.left, min, root)
                && isValidBST(root.right, root, max);

    }

    public static void main(String[] args){
        int values[] = {8, 5, 10, 3, 6, 11, 1, 4, 14};
        Node root = null;


        if(isValidBST(root, null, null)){
            System.out.println("Valid");
        }else {
            System.out.println("Not Valid");
        }
    }


}
