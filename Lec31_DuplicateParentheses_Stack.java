import java.util.Stack;

public class Lec31_DuplicateParentheses_Stack {
    public static boolean isDuplicate(String str){
        Stack<Integer> s = new Stack<>();

        for (int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            // closing
            if(ch == ')'){
                int count = 0;

                while (s.pop() != '('){
                    count++;
                }
                if (count < 1){
                    return true; // duplicate
                }else {
                    s.pop(); // opening pair
                }
            }else {
                // opening
                s.push(Integer.valueOf(ch));
            }
        }
        return false;
    }
    public static void main(String[] args){
        String str = "((a+b))";
        String str1 = "(a-b)";
        System.out.println(isDuplicate(str));
        System.out.println(isDuplicate(str1));
    }
}
