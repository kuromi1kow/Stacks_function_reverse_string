import java.util.Stack;

public class StringReverser {
    public String reverse_stack(String input){
        Stack<Character> stack=new Stack<>();
        String rev_word="";
        for(int i=input.length()-1;i>=0;i--){
            char c=input.charAt(i);
            stack.push(c);
        }
        rev_word= String.valueOf(stack);
        return rev_word;
    }
    public String reverse_builder(String input){
        StringBuilder sb=new StringBuilder();
        for(int i=input.length()-1;i>=0;i--){
            char c =input.charAt(i);
            sb.append(c);
        }
            var result=sb.toString();
            return result;
        }
        public String reverse_Buffer(String input){
        Stack<Character> stack=new Stack<>();
        for(char ch:input.toCharArray()) stack.push(ch);
        StringBuffer reversed=new StringBuffer();
        while(!stack.isEmpty())
            reversed.append(stack.pop());
        return reversed.toString();
        }


}


