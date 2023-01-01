package Microsoft;

/*You are given an array of strings tokens that represents an arithmetic expression in a Reverse Polish Notation.

Evaluate the expression. Return an integer that represents the value of the expression.

Note that:

The valid operators are '+', '-', '*', and '/'.
Each operand may be an integer or another expression.
The division between two integers always truncates toward zero.
There will not be any division by zero.
The input represents a valid arithmetic expression in a reverse polish notation.
The answer and all the intermediate calculations can be represented in a 32-bit integer.
 */

import java.util.*;
public class Question1  {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<Integer>();
        String operators = "+-*/";
        for(String token : tokens){
            if(!operators.contains(token)){
                stack.push(Integer.valueOf(token));
                continue;
            }
            int a = stack.pop();
            int b = stack.pop();
            if (token.equals("+")){
                stack.push(b + a);
            }
            else if(token.equals("-")){
                stack.push(b - a);
            }else if(token.equals("*")){
                stack.push(b * a);
            }else {
                stack.push(b / a);
            }
        }
        return stack.pop();
    }
}
