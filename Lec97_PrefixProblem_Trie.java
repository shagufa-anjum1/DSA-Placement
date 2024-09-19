public class Lec97_PrefixProblem_Trie {
    static class Node {
        Node children[] = new Node[26]; // Array to store references to children nodes
        boolean endOfWord = false;      // To mark the end of a word
        int freq;                       // Frequency to store how many words pass through this node

        public Node(){
            for(int i = 0; i < children.length; i++){
                children[i] = null;
            }
            freq = 0; // Initialize the frequency as 0 for the root
        }
    }

    public static Node root = new Node();

    // Method to insert a word into the Trie
    public static void insert(String word){
        Node curr = root;

        for(int i = 0; i < word.length(); i++){
            int idx = word.charAt(i) - 'a';

            if(curr.children[idx] == null){
                curr.children[idx] = new Node(); // Create a new node if it doesn't exist
            } else {
                curr.children[idx].freq++; // Increment frequency if node already exists
            }
            curr = curr.children[idx];
        }
        curr.endOfWord = true; // Mark the end of the word
    }

    // Method to find and print the shortest unique prefix for each word
    public static void findPrefix(Node root, String ans) {
        if(root == null) {
            return;
        }

        // If the frequency of this node is 1, the current string is a unique prefix
        if(root.freq == 0) { // We only need to print when we reach the end of a unique prefix
            System.out.println(ans);
            return;
        }

        // Traverse the Trie and find prefixes
        for(int i = 0; i < root.children.length; i++) {
            if(root.children[i] != null) {
                findPrefix(root.children[i], ans + (char)(i + 'a'));
            }
        }
    }

    public static void main(String args[]) {
        String arr[] = {"zebra", "day", "duck", "dove"}; // Input words

        // Insert words into the Trie
        for(int i = 0; i < arr.length; i++){
            insert(arr[i]);
        }

        // Call findPrefix to print the unique prefixes starting from each child of the root
        for(int i = 0; i < root.children.length; i++) {
            if(root.children[i] != null) {
                findPrefix(root.children[i], "" + (char)(i + 'a'));
            }
        }
    }
}
