class queue{
    private final int size = 20;
    private int[] QueArray;
    private int front;
    private int rear;
    public queue(){
        QueArray =  new int[size];
        front = 0;
        rear = -1;
    }
    public void enqueue(int j){
        if(rear == size -1){
            rear = -1;
        }
        QueArray[++rear] = j;
    }
    public int dequeue() { 
        int temp = QueArray[front++];
        if (front == size) {
            front = 0;
        }
        return temp;
    }
    public boolean isEmpty() {
        return (rear + 1 == front || (front + size - 1 == rear));
    }
}
class vertex{
    public char label;
    public boolean wasVisited;
    public vertex(char label){
        this.label = label;
        wasVisited = false;
    }
}
class graph{
    private final int MAX_VERTS = 20;
    private vertex vertexList[];
    private int adjMat[][];
    private int nVerts;
    private queue theQueue;
    public graph(){
        vertexList = new vertex[MAX_VERTS];
        adjMat = new int[MAX_VERTS][MAX_VERTS];
        nVerts = 0;
        for (int j = 0; j < MAX_VERTS; j++) { 
            for (int k = 0; k < MAX_VERTS; k++) { 
                adjMat[j][k] = 0;
            }
        }
        theQueue = new queue();
    }
    public void addVertex(char lab) {
        vertexList[nVerts++] = new vertex(lab);
    }
    public void addEdge(int start, int end) {
        adjMat[start][end] = 1;
        adjMat[end][start] = 1;
    }
    public void displayVertex(int v) {
        System.out.print(vertexList[v].label);
    }
    public void bfs() { 
        vertexList[0].wasVisited = true;
        displayVertex(0);
        theQueue.enqueue(0);
        int v2;
        while (!theQueue.isEmpty()) { // until queue empty,
            int v1 = theQueue.dequeue();
            while ((v2 = getAdjUnvisitedVertex(v1)) != -1) {
                vertexList[v2].wasVisited = true;
                displayVertex(v2);
                theQueue.enqueue(v2);
            }
        }
        for (int j = 0; j < nVerts; j++) {
            vertexList[j].wasVisited = false;
        }
    }
    public int getAdjUnvisitedVertex(int v) {
        for (int j = 0; j < nVerts; j++) {
            if (adjMat[v][j] == 1 && vertexList[j].wasVisited == false) {
                return j;
            }
        }
        return -1;
    }
} 
public class BFS {
    public static void main(String[] args) {
        graph theGraph = new graph ();
        theGraph.addVertex('A');
        theGraph.addVertex('B');
        theGraph.addVertex('C');
        theGraph.addVertex('D');
        theGraph.addVertex('E');
        theGraph.addEdge(0, 1);
        theGraph.addEdge(1, 2);
        theGraph.addEdge(0, 3);
        theGraph.addEdge(3, 4);
        System.out.print("Visits: ");
        theGraph.bfs();
        System.out.println();
    }
}