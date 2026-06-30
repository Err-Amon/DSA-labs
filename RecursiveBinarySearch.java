class TreeNode {
    int data;
    TreeNode left, right;

    TreeNode(int data) {
        this.data = data;
        left = right = null;
    }
}

public class RecursiveBinarySearch {
    TreeNode root;

    public boolean binarySearch(TreeNode root, int key) {
        if (root == null)
            return false;

        if (root.data == key)
            return true;

        if (key < root.data)
            return binarySearch(root.left, key);

        return binarySearch(root.right, key);
    }

    public static void main(String[] args) {
        RecursiveBinarySearch tree = new RecursiveBinarySearch();

        tree.root = new TreeNode(50);
        tree.root.left = new TreeNode(30);
        tree.root.right = new TreeNode(70);
        tree.root.left.left = new TreeNode(20);
        tree.root.left.right = new TreeNode(40);
        tree.root.right.left = new TreeNode(60);
        tree.root.right.right = new TreeNode(80);

        if (tree.binarySearch(tree.root, 60))
            System.out.println("Element found.");
        else
            System.out.println("Element not found.");
    }
}