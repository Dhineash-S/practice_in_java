// simple java program for binary tree
import java.util.*;

class Node {
    int key;
    Node left, right;

    public Node(int item) {
        key = item;
        left = right = null;
    }
}

class BinaryTree {
    Node root;

    public void travTree(Node node) {
        if (node != null) {
            travTree(node.left);
            System.out.print(" " + node.key);
            travTree(node.right);
        }
    }
}

public class BinaryTreeDemo {
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.root = new Node(1);
        tree.root.right = new Node(2);
        tree.root.left = new Node(3);
        tree.root.left.right = new Node(4);
        tree.root.left.left = new Node(5);
        System.out.print("\nBinary tree:");
        tree.travTree(tree.root);
    }
}
/*
 * output:
   Binary tree: 5 3 4 1 2
 */