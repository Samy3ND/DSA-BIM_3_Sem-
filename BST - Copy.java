class Node {
    int info;
    Node left, right;

    public Node(int item) {
        info = item;
        left = right = null;
    }
}

class BST {
    static Node root = null;

    public Node insert(Node root, int key) {
        if (root == null) {
            Node nnode = new Node(key);
            nnode.info = key;
            nnode.left = nnode.right = null;
            root = nnode;
        } else if (key < root.info) {
            root.left = insert(root.left, key);
        } else if (key > root.info) {
            root.right = insert(root.right, key);
        }
        return root;
    }
     void inorder() { 
        inorderRec(root); 
    }
    void inorderRec(Node root)
    {
        if (root != null) {
            inorderRec(root.left);
            System.out.print(root.info + " ");
            inorderRec(root.right);
        }
    }

    public static void main(String[] args) {
        BST run = new BST();
        root = run.insert(root, 25);
        run.insert(root, 45);
        run.insert(root, 30);
        run.insert(root, 15);
        run.inorder();
    }
}