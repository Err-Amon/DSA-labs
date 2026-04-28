public class stack {
    private static int maxSize;
    int [] stackArray = new int[maxSize];
    int top = -1;
    public stack(int size){
        this.maxSize = size;
    }
    public boolean  isEmpty(){
        if(top==-1){
            System.out.println("Stack is empty");
            return true;
        }
        else{
            System.out.println("Stack is not empty");
            return false;
        }
    }
    public boolean isFull(){
            if(top==maxSize-1){
                System.out.println("Stack is full");
                return true;
            }
            else{
                System.out.println("Stack is not full");
                return false;
            }
            }
    public void push(int value){
        if(isFull()){
            System.out.println("Stack is full, cannot push value");
        }
        else{
            top++;
            stackArray[top]=value;
            System.out.println("Pushed value: "+value);
        }
    }
    public int pop(){
        if(isEmpty()){
            System.out.println("Stack is empty, cannot pop value");
            return -1;
        }
        else{
            int value = stackArray[top];
            top--;
            System.out.println("Popped value: "+value);
            return value;
        }
    }
    public int peek(){
        if(isEmpty()){
            System.out.println("Stack is empty, cannot peek value");
            return -1;
        }
        else{
            System.out.println("Top element is: "+stackArray[top]);     
            return stackArray[top];
        }
    }
    public int size(){
        return top+1;
    }
    public static void main(String[] args) {
        stack s = new stack(5);
        s.isEmpty();
        s.push(10);
        s.push(20);
        s.push(30); 
        s.push(40);
        s.isFull();
        s.peek();
        System.out.println("Stack size is: "+s.size());
        s.pop();
        s.peek();
    }
}
