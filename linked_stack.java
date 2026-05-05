class Node {
    private int data;
    private Node next;
    public Node() {
        data = 0;
        next = null;
    }
    public Node(int val , Node n) {
        data = val;
        next = n;
    }
    public void setdata(int val){
        data = val;
    }
    public int getdata() {
        return data;
    }
    public Node getnext() {
        return next;
    }
    public void setnext(Node n) {
        next = n;
    }
}
public class linked_stack {
    protected Node top;
    protected int size;
    public linked_stack(){
        top = null;
        size = 0; 
    }
    public boolean isEmpty(){
        if(top == null){
            System.out.println("Stack is empty");
            return true;
        }
        else{
            System.out.println("Stack is not empty");
            return false;
        }
    }
    public int getSize(){
        return size;
    }
    public void push(int value){
        Node newNode = new Node(value, top);
        if(top == null){
            top = newNode;
        } else {
            newNode.setnext(top);
            top = newNode;
        }
        size++;
    }
    public int pop(){
        if(isEmpty()){
            System.out.println("Stack is empty, cannot pop value");
            return -1;
        }
        else{
            int value = top.getdata();
            top = top.getnext();
            size--;
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
            System.out.println("Top element is: "+top.getdata());     
            return top.getdata();
        }
    }
    public void  display(){
        if(isEmpty()){
            System.out.println("Stack is empty, cannot display values");
        }
        else{
            Node current = top;
            System.out.print("Stack elements: ");
            while(current != null){
                System.out.print(current.getdata() + " ");
                current = current.getnext();
            }
            System.out.println();
        }
    }   
    public static void main(String[] args) {
        linked_stack ls = new linked_stack();
        ls.push(10);
        ls.push(20);
        ls.peek();
        ls.pop();
        ls.peek();
        ls.display();
    }
}