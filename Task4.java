/* Реализовать алгоритм перевода из инфиксной записи 
в постфиксную для арифметического выражения. */

import java.util.Stack;
import java.lang.StringBuilder;

class Task4 {
    public static void main(String[] args) {
        System.out.println(convert(" 1 + 2 - 3  *  4 / 5  "));
    }

    public static String convert(String expression) {
        StringBuilder sb = new StringBuilder();
        Stack<Character> op = new Stack<Character>();
        char[] chars = expression.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char ch = chars[i];
            if (Character.isDigit(ch)) {
                while (Character.isDigit(chars[i])) {
                    sb.append(chars[i++]);
                }
                sb.append(' ');
            } else if (isOperator(ch)) {
                while (!op.isEmpty() && priority(op.peek()) >= priority(ch)) {
                    sb.append(op.pop()).append(' ');
                }
                op.push(ch);
            }
        }
        while (!op.isEmpty()) {
            sb.append(op.pop()).append(' ');
        }
        return sb.toString();
    }

    private static boolean isOperator(char ch) {
        return ch == '^' || ch == '*' || ch == '/' || ch == '+' || ch == '-';
    }

    private static int priority(char operator) {
        switch (operator) {
            case '^':
                return 3;
            case '*':
            case '/':
                return 2;
            case '+':
            case '-':
                return 1;
        }
        return 0;
    }
}