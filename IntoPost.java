import java.io.IOException;
import java.util.Scanner;
public class IntoPost {
    private stack theStack;
    private String input;
    private String output = "";
    public IntoPost(String in){
        input = in;
        int stackSize = input.length();
        theStack = new stack(stackSize);
    }
    public String doTrans(){
        for(int j=0;j<input.length();j++){
            char ch = input.charAt(j);
            switch(ch){
                case '+':
                case '-':
                    gotOper(ch,1);
                    break;
                case '*':
                case '/':
                    gotOper(ch,2);
                    break;
                case '(':
                    theStack.push(ch);
                    break;
                case ')':
                    gotParen(ch);
                    break;
                default:
                    output = output + ch;
                    break;
            }
        }
        while(!theStack.isEmpty()){
            output = output + theStack.pop();
        }
        return output;
    }
    public void gotOper(char opThis,int prec1){
        while(!theStack.isEmpty()){
            char opTop = (char) theStack.pop();
            if(opTop == '('){
                theStack.push(opTop);
                break;
            }
            else{
                int prec2;
                if(opTop == '+' || opTop == '-'){
                    prec2 = 1;
                }
                else{
                    prec2 = 2;
                }
                if(prec2 < prec1){
                    theStack.push(opTop);
                    break;
                }
                else{
                    output = output + opTop;
                }
            }
        }
        theStack.push(opThis);
    }
    public void gotParen(char ch){
        while(!theStack.isEmpty()){
            char chx = (char) theStack.pop();
            if(chx == '('){
                break;
            }
            else{
                output = output + chx;
            }
        }
    
    }
    public static void main(String [] args) throws IOException {
        String input;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter infix expression: ");
        input = sc.nextLine();
        IntoPost theTrans = new IntoPost(input);
        String output = theTrans.doTrans();
        System.out.println("Postfix expression: "+output);
    }
    class stack{
        private int maxSize;
        private char[] stackArray;
        private int top;
        public stack(int size){ 
            this.maxSize = size;
            stackArray = new char[maxSize];
            top = -1;
        }        
        public boolean  isEmpty(){
            if(top==-1){
                return true;    
            }
            else{
                return false;
            }
        }        public boolean isFull(){
            if(top==maxSize-1){
                return true;
            }
            else{
                return false;
            }
        }
        public void push(char value){
            if(isFull()){
                System.out.println("Stack is full, cannot push value"); 
            }
            else{
                top++;
                stackArray[top]=value;
                System.out.println("Pushed value: "+value);
            }
        }
        public char pop(){
            if(isEmpty()){
                System.out.println("Stack is empty, cannot pop value");
                return (char) -1;
            }
            else{
                char value = stackArray[top];
                top--;
                System.out.println("Popped value: "+value);
                return value;
            }
        }
        public char peek(){
            if(isEmpty()){
                System.out.println("Stack is empty, cannot peek value");
                return (char) -1;}
            else{
                System.out.println("Top element is: "+stackArray[top]);
                return stackArray[top];     
            }
        }
    }
}
