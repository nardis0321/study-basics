package datastructure;

public class BinarySearchTree<Key extends Comparable<Key>, Value> {
    public NodeForBST root;

    public NodeForBST getRoot() {
        return root;
    }

    public BinarySearchTree(Key newKey, Value newValue) {
        root = new NodeForBST(newKey, newValue);
    }

}
