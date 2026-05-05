public class two_stack {
    int maxSize;
    int [] stackArray ;
    int top1;
    int top2;
    public two_stack(int size){
        this.maxSize = size;
        stackArray = new int[maxSize];
        top1=-1;
        top2=maxSize;
    }
    public boolean  isEmpty1(){
        if(top1==-1){
            System.out.println("Stack 1 is empty");
            return true;
        }
        else{
            System.out.println("Stack 1 is not empty");
            return false;
        }
    }
    public boolean isEmpty2(){
            if(top2==maxSize){
                System.out.println("Stack 2 is empty");
                return true;
            }
            else{
                System.out.println("Stack 2 is not empty");
                return false;
            }
            }
    public boolean isFull(){
            if(top1+1==top2){
                System.out.println("Stacks are full");
                return true;
            }
            else{
                System.out.println("Stacks are not full");
                return false;
            }
            }
    public void push1(int value){
        if(isFull()){
            System.out.println("Stacks are full, cannot push value to Stack 1");
        }
        else{
            top1++;
            stackArray[top1]=value;
            System.out.println("Pushed value: "+value+" to Stack 1");
        }
    }
    public void push2(int value){
        if(isFull()){
            System.out.println("Stacks are full, cannot push value to Stack 2");
        }
        else{
            top2--;
            stackArray[top2]=value;
            System.out.println("Pushed value: "+value+" to Stack 2");
        }
    }
    public int pop1(){
        if(isEmpty1()){
            System.out.println("Stack 1 is empty, cannot pop value");
            return -1;
        }
        else{
            int value = stackArray[top1];
            top1--;
            System.out.println("Popped value: "+value+" from Stack 1");
            return value;
        }
    }
    public int pop2(){
        if(isEmpty2()){
            System.out.println("Stack 2 is empty, cannot pop value");
            return -1;
        }
        else{
            int value = stackArray[top2];
            top2++;
            System.out.println("Popped value: "+value+" from Stack 2");
            return value;
        }
    }
    public static void main(String[] args) {
        two_stack ts = new two_stack(10);
        ts.push1(1);
        ts.push1(2);
        ts.push2(9);
        ts.push2(8);
        ts.pop1();
        ts.pop2();
    }
}
