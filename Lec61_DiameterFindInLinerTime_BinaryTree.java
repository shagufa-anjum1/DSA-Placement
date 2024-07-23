public class Lec61_DiameterFindInLinerTime_BinaryTree {
    static class node{
        int data;
        node left, right;
        public node(int data){
            this.data = data;
            this.left = null;
            this.right = null;

        }
    }
    static class Info{
        int dia;
        int hig;
        public Info(int dia, int hig){
            this.dia = dia;
            this.hig = hig;
        }
    }

    public static Info diameter(node root){
        if(root == null){
            return new Info(0, 0);
        }
        Info lefInfo = diameter(root.left);
        Info rightInfo = diameter(root.right);
        int dia = Math.max(Math.max(lefInfo.dia, rightInfo.dia), lefInfo.hig+rightInfo.hig+1);
        int hig = Math.max(lefInfo.hig, rightInfo.hig)+1;
        return new Info(dia, hig);
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
        System.out.println(diameter(root).dia);

    }

}
