public class BST {

    class Node {
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
            left = null;
            right = null;
        }
    }

    private Node root;

    public BST() {
        root = null;
    }

    // Insert a node
    public void insert(int data) {
        Node newNode = new Node(data);

        if (root == null) {
            root = newNode;
            return;
        }

        Node current = root;
        Node parent;

        while (true) {
            parent = current;

            if (data < current.data) {
                current = current.left;

                if (current == null) {
                    parent.left = newNode;
                    return;
                }
            } else {
                current = current.right;

                if (current == null) {
                    parent.right = newNode;
                    return;
                }
            }
        }
    }

    // Search for a value
    public boolean find(int id) {
        Node current = root;

        while (current != null) {
            if (current.data == id) {
                return true;
            } else if (id < current.data) {
                current = current.left;
            } else {
                current = current.right;
            }
        }

        return false;
    }

    // Inorder Traversal
    public void display(Node root) {
        if (root != null) {
            display(root.left);
            System.out.print(root.data + " ");
            display(root.right);
        }
    }

    // Getter for root
    public Node getRoot() {
        return root;
    }

    public static void main(String[] args) {

        BST b = new BST();

        b.insert(10);
        b.insert(5);
        b.insert(15);
        b.insert(3);
        b.insert(7);
        b.insert(12);
        b.insert(18);

        System.out.println("Inorder Traversal of the BST:");
        b.display(b.getRoot());

        int searchValue = 7;

        if (b.find(searchValue)) {
            System.out.println("\nValue " + searchValue + " found in the BST.");
        } else {
            System.out.println("\nValue " + searchValue + " not found in the BST.");
        }
    }
}
