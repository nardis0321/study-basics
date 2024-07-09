package datastructure;

public class NodeForTree <Key extends Comparable<Key>> {
    private Key     key;
    private NodeForTree<Key> left;
    private NodeForTree<Key> right;

    NodeForTree(Key item, NodeForTree<Key> lt, NodeForTree<Key> rt){
        key = item; left = lt; right = rt;
    }

    public Key  getKey(){ return key; }
    public NodeForTree<Key> getLeft(){ return left; }
    public NodeForTree<Key> getRight(){ return right; }

    public void setKey(Key item){ key = item; }
    public void setLeft(NodeForTree<Key> lt){ left = lt; }
    public void setRight(NodeForTree<Key> rt){ right = rt; }
}
