import java.util.Stack;

public class Lec27_ReversString_Stack {
    public static String reverseString(String str){
        Stack<Character> s = new Stack<>();
        int index = 0;
        while (index < str.length()){
            s.push(str.charAt(index));
            index++;
        }
        StringBuilder result = new StringBuilder(" ");

        while (!s.isEmpty()){
            char curr = s.pop();
            result.append(curr);
        }
        return result.toString();
    }
    public static void main(String[] args){
        String str = "Shagufa Anjum";
        String result = reverseString(str);
        System.out.println(result);
    }

}
