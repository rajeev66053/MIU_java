// class to create nodes
class Node2 {
  int key;
  Node2 left, right;

  public Node2(int item) {
  key = item;
  left = right = null;
  }
}

class BinaryTree {
  Node2 root;

  // Traverse tree
  public void traverseTree(Node2 node) {
    if (node != null) {
      traverseTree(node.left);
      System.out.print(" " + node.key);
      traverseTree(node.right);
    }
  }

  public static void main(String[] args) {

    // create an object of BinaryTree
    BinaryTree tree = new BinaryTree();

    // create nodes of the tree
    tree.root = new Node2(1);
    tree.root.left = new Node2(2);
    tree.root.right = new Node2(3);
    tree.root.left.left = new Node2(4);

    System.out.print("\nBinary Tree: ");
    tree.traverseTree(tree.root);
  }
}