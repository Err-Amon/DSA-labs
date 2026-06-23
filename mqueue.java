public class mqueue {
    public static int nsize =5;
    int[] arr = new int[nsize];
    int head = 0;
    int tail = -1;
    public boolean isempty(){
        if(tail<0){
            return true;
        }
        else{
            return false;
        }
    }
    public boolean isfull(){
        if(tail==nsize-1){
            return true;
        }
        else{
            return false;
        }
    }
    public void enqueue(int val){
        if(isfull()){
            System.out.println("Queue is full");
        }
        else{
            tail++;
            arr[tail] = val; 
        }
    }
    public int dequeue(){
        if(isempty()){
            System.out.println("Queue is empty");
            return -9999;
        }
        else{
            int val = arr[head];
            moveArray();
            return val;
        }
    }
    public void moveArray(){
        for(int i=0;i<tail;i++){
            arr[i]=arr[i+1];
        }
        tail--;
    }
    public int front(){
        if(isempty()){
            System.out.println("Queue is empty");
            return -9999;
        }
        else{
            return arr[head];
        }
    }
    public int size(){
        return nsize+1;
    }
    public static void main(String[] args){
        mqueue q1 = new mqueue();
        q1.isempty();
        q1.isfull();
        q1.enqueue(20);
        q1.enqueue(60);
        q1.enqueue(56);
        q1.dequeue();
        System.out.println("Front of the queue is "+q1.front());
        System.out.println("Size of the queue is  "+q1.size());
    }

}
