package datastructure;

public class NodeForBST<Key extends Comparable<Key>,Value> {
    private Key     key;
    private Value   value;
    private NodeForBST    left, right;
    public NodeForBST(Key newKey, Value newValue){ //생성자
        key = newKey;
        value = newValue;
        left = right = null;
    }

    // getter and setter
    public Key getKey() {
        return key;
    }
    public void setKey(Key key) {
        this.key = key;
    }
    public Value getValue() {
        return value;
    }

    public void setValue(Value value) {
        this.value = value;
    }
    public NodeForBST getLeft() {
        return left;
    }
    public void setLeft(NodeForBST left) {
        this.left = left;
    }

    public NodeForBST getRight() {
        return right;
    }
    public void setRight(NodeForBST right) {
        this.right = right;
    }
}
