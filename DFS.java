import java.util.Stack;
class Vertex {
    public char label;
    public boolean wasVisited;
    public Vertex(char lab){ 
            label = lab;
            wasVisited = false;
    }
} 
class Graph {
    private final int MAX_VERTS = 20;
    private Vertex vertexList[]; 
    private int adjMat[][];
    private int nVerts;
    private Stack theStack;
    public Graph(){
        vertexList = new Vertex[MAX_VERTS];
        adjMat = new int[MAX_VERTS][MAX_VERTS];
        nVerts = 0;
        for (int y = 0; y < MAX_VERTS; y++){
            for (int x = 0; x < MAX_VERTS; x++){
                adjMat[x][y] = 0;
            }
        }
        theStack = new Stack();
    } // end constructor
    public void addVertex(char lab) {
        vertexList[nVerts++] = new Vertex(lab);
    }
    public void addEdge(int start, int end) {
        adjMat[start][end] = 1;
        adjMat[end][start] = 1;
    }
    public void displayVertex(int v) {
        System.out.print(vertexList[v].label);
    }
    public void dfs(){
        vertexList[0].wasVisited = true; 
        displayVertex(0);
        theStack.push(0);
        while (!theStack.isEmpty()){
                int v = getAdjUnvisitedVertex((int)theStack.peek());
            if (v == -1){
                theStack.pop();
            } else{ 
                vertexList[v].wasVisited = true;
                displayVertex(v);
                theStack.push(v);
            }
        }
    }
    public int getAdjUnvisitedVertex(int v){
        for (int i = 0; i < nVerts; i++){
            if(adjMat[v][i] == 1 && !vertexList[i].wasVisited){
                return i;
            }
        }
        return -1;
    }
}

public class DFS {
    public static void main(String[] args) {
        Graph theGraph = new Graph();
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
        theGraph.dfs();
        System.out.println();
    
    }
}