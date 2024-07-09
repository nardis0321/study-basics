package datastructure;

public class BinaryTree<Key extends Comparable<Key>> {
    /**
     * 이진트리의 노트 : key와 left, right
     */

    private NodeForTree root;

    public BinaryTree(){
        root = null;
    }

    public NodeForTree getRoot() {return root;}
    public void setRoot(NodeForTree newRoot) {root = newRoot;}
    public boolean isEmpty(){ return root == null; }

    // preorder(), inorder(), postorder(), levelorder()
    // 전위 : N L R
    public void preorder(NodeForTree n){
        if(n != null){
            System.out.println(n+" ");
            preorder(n.getLeft());
            preorder(n.getRight());
        }
    }

}
