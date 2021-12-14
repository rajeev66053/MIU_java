
public class DeleteBinarySearchTree {
	
	/* Class containing left
    and right child of current node
     * and key value*/
    class Node {
        int key;
        Node left, right;
 
        public Node(int item)
        {
            key = item;
            left = right = null;
        }
    }
 
    // Root of BST
    Node root;
 
    // Constructor
    DeleteBinarySearchTree() { root = null; }
 
    // This method mainly calls deleteRec()
    void deleteKey(int key) { root = deleteRec(root, key); }
 
    /* A recursive function to
      delete an existing key in BST
     */
    Node deleteRec(Node root, int key)
    {
    	System.out.println("root "+root.key);
    	System.out.println("key "+key);
        /* Base Case: If the tree is empty */
        if (root == null) {
            return root;
        }
 
        /* Otherwise, recur down the tree */
        System.out.println("root.key "+ root.key);
        if (key < root.key) {
            root.left = deleteRec(root.left, key);
    		System.out.println((root.left !=null)?"l "+root.left.key:"left null");
        }else if (key > root.key) {
            root.right = deleteRec(root.right, key);
    		System.out.println((root.right !=null)?"r "+root.right.key:"right null");
        }
 
        // if key is same as root's
        // key, then This is the
        // node to be deleted
        else {

            System.out.println("rwew");
            // node with only one child or no child
            if (root.left == null) {
            	System.out.println((root.right != null)?"dfsfdsf"+root.right.key: "gright null");
                return root.right;
            }else if (root.right == null) {
            	System.out.println((root.left != null)?"fsdsf"+root.left.key: "eleft null");
                return root.left;
            }
 
            // node with two children: Get the inorder
            // successor (smallest in the right subtree)
            System.out.println("root.right "+root.right.key);
            root.key = minValue(root.right);

    		System.out.println("root.key "+root.key);
 
            // Delete the inorder successor
            root.right = deleteRec(root.right, root.key);

    		System.out.println("root.right "+root.right.key);
        }
 
        return root;
    }
 
    int minValue(Node root)
    {
        int minv = root.key;
        System.out.println("minv "+root.key);
        while (root.left != null)
        {
            minv = root.left.key;

            System.out.println("minv "+minv);
            root = root.left;

            System.out.println("root "+root.key);
        }
        return minv;
    }
 
    // This method mainly calls insertRec()
    void insert(int key) { root = insertRec(root, key); }
 
    /* A recursive function to
       insert a new key in BST */
    Node insertRec(Node root, int key)
    {
 
        /* If the tree is empty,
          return a new node */
        if (root == null) {
            root = new Node(key);
            return root;
        }
 
        /* Otherwise, recur down the tree */
        if (key < root.key)
            root.left = insertRec(root.left, key);
        else if (key > root.key)
            root.right = insertRec(root.right, key);
 
        /* return the (unchanged) node pointer */
        return root;
    }
 
    // This method mainly calls InorderRec()
    void inorder() { 
    	System.out.println("root" +root.key);
    	inorderRec(root);
    	}
 
    // A utility function to do inorder traversal of BST
    void inorderRec(Node root)
    {
        if (root != null) {
            inorderRec(root.left);
            System.out.print(root.key + " ");
            inorderRec(root.right);
        }
    }
 
    // Driver Code
    public static void main(String[] args)
    {
    	DeleteBinarySearchTree tree = new DeleteBinarySearchTree();
 
        /* Let us create following BST
              50
           /     \
          30      70
         /  \    /  \
        20   40  60   80 */
        tree.insert(50);
        tree.insert(30);
        tree.insert(20);
        tree.insert(40);
        tree.insert(70);
        tree.insert(60);
        tree.insert(80);
 
        System.out.println(
            "Inorder traversal of the given tree");
        tree.inorder();
 
        System.out.println("\nDelete 20");
        tree.deleteKey(20);
        System.out.println(
            "Inorder traversal of the modified tree");
        tree.inorder();
 
        System.out.println("\nDelete 30");
        tree.deleteKey(30);
        System.out.println(
            "Inorder traversal of the modified tree");
        tree.inorder();
 
        System.out.println("\nDelete 50");
        tree.deleteKey(50);
        System.out.println(
            "Inorder traversal of the modified tree");
        tree.inorder();
    }

}
