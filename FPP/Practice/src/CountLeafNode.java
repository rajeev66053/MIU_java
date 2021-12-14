class Node1 {
  int item;
  Node1 left, right;

  public Node1(int key) {
  item = key;
  left = right = null;
  }
}

public class CountLeafNode{
  // root of Tree
  Node1 root;

  CountLeafNode() {
  root = null;
  }

  // method to count leaf nodes
  public static int countLeaf(Node1 node) {
    if(node == null) {
      return 0;
    }

    // if left and right of the node is null
    // it is leaf node
    if (node.left == null && node.right == null) {
      return 1;
    }
    else {
      return countLeaf(node.left) + countLeaf(node.right);
    }
  }

  public static void main(String[] args) {

    // create an object of Tree
	  CountLeafNode tree = new CountLeafNode();

    // create nodes of tree
    tree.root = new Node1(5);
    tree.root.left = new Node1(3);
    tree.root.right = new Node1(8);

    // create child nodes of left child
    tree.root.left.left = new Node1(2);
    tree.root.left.right = new Node1(4);

    // create child nodes of right child
    tree.root.right.left = new Node1(7);
    tree.root.right.right = new Node1(9);

    // call method to count leaf nodes
    int leafNodes = countLeaf(tree.root);
    System.out.println("Total Leaf Nodes = " + leafNodes);
  }
}