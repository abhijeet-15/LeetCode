import java.util.Stack;

/*A parentheses string is valid if and only if:

It is the empty string,
It can be written as AB (A concatenated with B), where A and B are valid strings, or
It can be written as (A), where A is a valid string.
You are given a parentheses string s. In one move, you can insert a parenthesis at any position of the string.

For example, if s = "()))", you can insert an opening parenthesis to be "(()))" or a closing parenthesis to be "())))".
Return the minimum number of moves required to make s valid.

*/

public class Q921 {
    class Solution {
        int move = 0;
        public int minAddToMakeValid(String s) {

            Stack<Character> myStack = new Stack<>();
            for(int i = 0; i < s.length(); i++){
                if( myStack.isEmpty() && s.charAt(i) == ')'){
                    move++;
                }
                else if(s.charAt(i) == '('){
                    myStack.push('(');
                }

                else if(!myStack.isEmpty() && s.charAt(i) == ')'){
                    myStack.pop();
                    move++;
                }

            }

            while(!myStack.isEmpty()){
                myStack.pop();
                move++;
            }
            return move;

        }
    }
}


