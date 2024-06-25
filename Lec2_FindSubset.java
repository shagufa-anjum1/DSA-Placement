public class Lec2_FindSubset {
    public static void findSubset(String str, String ans, int i){

        // base case
        if(i == str.length()){
            if(ans.length() == 0){
                System.out.println("null");
            }else {
                System.out.println(ans);
            }
            return;
        }

        //Recursion (kaam)
          // 1 choose for yes
        findSubset(str, ans+str.charAt(i), i+1);

           // 2 choose for no
        findSubset(str, ans, i+1);


    }
    public static void main(String[] args){
        String str = "abc";
        findSubset(str, " ", 0);
    }
}
