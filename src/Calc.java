import java.util.Stack;


public class Calc {
    String expression;
    public Calc(String expression){
        this.expression=expression;
    }
    public  int calc() {
        Stack<Integer> stackOp = new Stack<>();
        int operand = 0;
        char operator = '+';
        for (int i = 0; i < expression.length(); i++) {
            char c = expression.charAt(i);
            if (Character.isDigit(c)) {
                operand = operand * 10 + (c - '0');
            }
            if (c == '+' || c == '-' || c == '*' || c == '/' || i == expression.length() - 1) {
                if (operator == '*') {
                    stackOp.push(stackOp.pop() * operand);
                } else if (operator == '/') {
                    stackOp.push(stackOp.pop() / operand);
                } else if (operator == '+') {
                    stackOp.push(operand);
                } else if (operator == '-') {
                    stackOp.push(-operand);
                }
                operator = c;
                operand = 0;
            }
        }
        int result = 0;
        while (!stackOp.isEmpty()) {
            result += stackOp.pop();
        }
        return result;
    }

}
