import java.util.Scanner;
public class oneway_circular {
class Node {
    private int data;
    private Node next;
 
    public Node() {
        data = 0;
        next = null;
    }
 
    public Node(int val) {
        data = val;
        next = null;
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
    private Node head;
    private Node tail;
    private Node x;
    private Node pre_x;
    public oneway_circular(){
        head = new Node();
        head.setnext(head);
        x = tail = head;
        pre_x = head;
    }
    public void move(){
        pre_x = x;
        x = x.getnext();
    }
    public void append(int value){
        Node n = new Node(value);
        tail.setnext(n);
        tail = n;
        tail.setnext(head);
        System.out.println("Appended value: "+value);
    }
        public boolean search(int val)
    {   x=head.getnext(); 
        pre_x=head; 
        int loc=0;
        while(x!=head)
        {   if(x.getdata()==val)
            { System.out.println("Found at location "+ loc);
                return true;}
            else  { loc++; move();}
        }
        System.out.println("Number not found");
        return false;
    }
        public void delete(int val)
    {
        if(search(val))
        {
            pre_x.setnext(x.getnext());
            x=x.getnext();
            System.out.println("\nDeleted Successfully..!");
        }
    }
        public void display()
    {   pre_x=head;
        x=pre_x.getnext();
        System.out.println("LinkedList: ");
        while(x!=head)
        {   System.out.println(x.getdata());
            move();
        }
    }
        public void insert_after(int d1, int d2)
      {
      if (search(d2))
      {
          Node nn=new Node(d1);
          nn.setnext(x.getnext());
          x.setnext(nn);
          System.out.println("Inserted Successfully..!!");
      }}

      public static void main(String[] args) {
 
        oneway_circular LList=new oneway_circular();
        int opt; int val;
        Scanner input = new Scanner(System.in);
        do {
            System.out.println("0.Append ");
            System.out.println("1.Insert");
            System.out.println("2.Delete");
            System.out.println("3.Search");
            System.out.println("4.Display");
            System.out.println("5.Quit");
            System.out.print("Select an operation : ");
            opt = input.nextInt();
 
            switch (opt) {
                case 0:
                    System.out.print("Enter number to be appended: ");
                    val = input.nextInt();
                    LList.append(val);
                    break;
                case 1:
                    System.out.print("Enter number to be inserted: ");
                    val = input.nextInt();
                    System.out.print("Enter the number after which you want to insert: ");
                    int loc = input.nextInt();
                    LList.insert_after(val, loc);
                    break;
                case 2:
                    System.out.print("Enter number to be deleted: ");
                    val = input.nextInt();
                    LList.delete(val);
                    break;
                case 3:
                    System.out.print("Enter number to be searched: ");
                    val = input.nextInt();
                    LList.search(val);
                    break;
                case 4:
                    LList.display();
                    break;
                case 5:
                    System.exit(0);
                default:
                    System.out.println("Wrong choice\n");
            }
        }
                while(opt!=5);
    }
}

