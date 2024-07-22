package datastructure;

import java.util.LinkedList;
import java.util.Queue;

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
    }
    // 후위 : L R N
    public void postorder(NodeForTree n){
        if(n != null){
            postorder(n.getLeft());
            postorder(n.getRight());
            System.out.println(n+" ");
        }
    }

    public void levelorder(NodeForTree n){
       // level 순회는 QUEUE를 사용하면 넣은 순서대로 출력된다
        Queue<NodeForTree> q = new LinkedList<>();
        NodeForTree polled;
        q.offer(n); //queue에 주어진 노드 n을 넣기
        while(!q.isEmpty()){    // queue가 텅 빌 때까지 반복
            polled = q.poll();  // 가장 먼저 저장한 노드를 꺼내서 출력
            System.out.println(polled+" ");
            if(polled.getLeft() != null)    // 꺼낸 노드의 왼쪽 오른쪽 노드를 순서대로 queue에 넣기
                q.offer(polled.getLeft());
            if(polled.getRight() != null)
                q.offer(polled.getRight());
        }
    }

    public int size(NodeForTree n){
        if(n == null)    // 베이스 조건, 노드가 null일 시 사이즈 0으로 종료
            return 0;
        // 사이즈는 트리의 노드 수 = 1(루트의) + 왼쪽 노드수 + 오른쪽 노드 수
        return (1 + size(n.getLeft()) + size(n.getRight()) );
    }

}
