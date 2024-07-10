import java.util.Stack;

public class Lec30_ValidParentheses_stack {
    public static boolean isValid(String str){
        Stack<Character> s = new Stack<>();
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);

            //opening
            if(ch == '(' || ch == '{' || ch == '['){
                s.push(ch);
            }else {
                // chosing
                if(s.isEmpty()){
                    return false;
                }

                if( (s.peek() == '(' && ch == ')')
                        || (s.peek() == '[' && ch == ']')
                        || (s.peek() == '{'&& ch == '}' )){
                    return true;
                }else {
                    return false;
                }
            }
        }
        if(s.isEmpty()){
            return true;
        }else {
            return false;
        }
    }
    public static void main(String[] args){
        String str = "(({})[]";
        System.out.println(isValid(str));
    }
}
