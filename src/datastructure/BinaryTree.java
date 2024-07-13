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
    // 중위 : L N R
    public void inorder(NodeForTree n){
        if(n != null){
            inorder(n.getLeft());
            System.out.println(n+" ");
            inorder(n.getRight());
        }
        // 0 1 3 7
        // 7: null --> sout(7) --> null
        // 3:       sout(3) --> inorder(8) --> null, sout(8), null
        // 1:       sout(1) --> indorder(4) -->
        //                          inorder(9) --> null sout(9) null
        //                          sout(4) --> inorder(10)=sout(10)
        // 7 3 8 1 9 4 10
    }
    // 후위 : L R N
    public void postorder(NodeForTree n){
        if(n != null){
            postorder(n.getLeft());
            postorder(n.getRight());
            System.out.println(n+" ");
        }
        // 0 1 3 7 sout(7)
        // 3: postorder(8) --> null sout(8) null --> sout(3)
        // 1: postorder(4) --> p(9): sout(9), p(10): sout(10), sout(4)
        // 7 8 3 9 10 4
    }

}
