public class PriQueStatic {
    Que q0;
    Que q1;
    Que q2;

    public PriQueStatic() {
        q0 = new Que(10);
        q1 = new Que(10);
        q2 = new Que(10);
    }

    public void enqueue(int data, int pri) {
        if (pri == 0)
            q0.enqueue(data);
        else if (pri == 1)
            q1.enqueue(data);
        else
            q2.enqueue(data); // Priority 2 or any other value
    }

    public int dequeue() {
        if (!q0.isEmpty())
            return q0.dequeue();
        else if (!q1.isEmpty())
            return q1.dequeue();
        else if (!q2.isEmpty())
            return q2.dequeue();
        else {
            System.out.println("Priority Queue is Empty");
            return -1;
        }
    }

    public static void main(String[] args) {
        PriQueStatic obj = new PriQueStatic();

        obj.enqueue(20, 1);
        obj.enqueue(15, 0);
        obj.enqueue(30, 2);
        obj.enqueue(25, 3); // Goes to q2 because priority is not 0 or 1

        System.out.println("Dequeue = " + obj.dequeue());
        System.out.println("Dequeue = " + obj.dequeue());
        System.out.println("Dequeue = " + obj.dequeue());
        System.out.println("Dequeue = " + obj.dequeue());
    }
}

class Que {
    int[] arr;
    int tail;

    public Que(int size) {
        arr = new int[size];
        tail = -1;
    }

    public void enqueue(int data) {
        if (isFull()) {
            System.out.println("Queue is Full");
        } else {
            arr[++tail] = data;
        }
    }

    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is Empty");
            return -1;
        } else {
            int x = arr[0];
            tail--;
            move();
            return x;
        }
    }

    public void move() {
        for (int i = 0; i <= tail; i++) {
            arr[i] = arr[i + 1];
        }
    }

    public boolean isEmpty() {
        return tail == -1;
    }

    public boolean isFull() {
        return tail == arr.length - 1;
    }
}