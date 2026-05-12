import java.util.Scanner;
public class intopre {
    private stack theStack;
    private String input;
    private String output = "";
    public intopre(String in) {
        input = reverseAndSwap(in);
        int stackSize = input.length();
        theStack = new stack(stackSize);
    }
    public String reverseAndSwap(String str) {
        String reversed = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            char ch = str.charAt(i);
            if (ch == '(')
                reversed += ')';
            else if (ch == ')')
                reversed += '(';
            else
                reversed += ch;
        }
        return reversed;
    }
    public String doTrans() {
        for (int j = 0; j < input.length(); j++) {
            char ch = input.charAt(j);
            switch (ch) {
                case '+':
                case '-':
                    gotOper(ch, 1);
                    break;

                case '*':
                case '/':
                    gotOper(ch, 2);
                    break;

                case '(':
                    theStack.push(ch);
                    break;

                case ')':
                    gotParen();
                    break;

                default:
                    output = output + ch;
                    break;
            }
        }
        while (!theStack.isEmpty()) {
            output = output + theStack.pop();
        }
        return reverse(output);
    }
    public void gotOper(char opThis, int prec1) {
        while (!theStack.isEmpty()) {
            char opTop = theStack.pop();
            if (opTop == '(') {
                theStack.push(opTop);
                break;
            }
            else {
                int prec2;
                if (opTop == '+' || opTop == '-')
                    prec2 = 1;
                else
                    prec2 = 2;
                if (prec2 < prec1) {
                    theStack.push(opTop);
                    break;
                }
                else {
                    output = output + opTop;
                }
            }
        }
        theStack.push(opThis);
    }
    public void gotParen() {
        while (!theStack.isEmpty()) {
            char chx = theStack.pop();
            if (chx == '(')
                break;
            else
                output = output + chx;
        }
    }
    public String reverse(String str) {
        String rev = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            rev += str.charAt(i);
        }
        return rev;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter infix expression: ");
        String input = sc.nextLine();
        intopre theTrans = new intopre(input);
        String output = theTrans.doTrans();
        System.out.println("Prefix expression: " + output);
    }
    class stack {
        private int maxSize;
        private char[] stackArray;
        private int top;
        public stack(int size) {
            this.maxSize = size;
            stackArray = new char[maxSize];
            top = -1;
        }
        public boolean isEmpty() {
            return top == -1;
        }
        public boolean isFull() {
            return top == maxSize - 1;
        }
        public void push(char value) {
            if (!isFull()) {
                stackArray[++top] = value;
            }
        }
        public char pop() {
            if (!isEmpty()) {
                return stackArray[top--];
            }
            return (char) -1;
        }
        public char peek() {
            if (!isEmpty()) {
                return stackArray[top];
            }
            return (char) -1;
        }
    }
}