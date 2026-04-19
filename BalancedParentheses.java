import java.util.Stack;
class BalancedParentheses {
    static boolean check(String str){
        Stack<Character> s=new Stack<>();
        for(char c: str.toCharArray()){
            if(c=='(') s.push(c);
            else if(c==')'){
                if(s.isEmpty()) return false;
                s.pop();
            }
        }
        return s.isEmpty();
    }

    public static void main(String[] args){
        System.out.println(check("(())"));
    }
}