package datastructure;

public class BinarySearchTree<Key extends Comparable<Key>, Value> {
    public NodeForBST root;

    public NodeForBST getRoot() {
        return root;
    }

    public BinarySearchTree(Key newKey, Value newValue) {
        root = new NodeForBST(newKey, newValue);
    }

    /**
     * 값을 찾는 get 메서드
     * @param n 탐색 시작 노드
     * @param k 탐색할 노드의 Key
     * @return Key에 해당하는 노드의 Value
     */
    public Value get(NodeForBST n, Key k) {
        // 베이스 : 노드를 찾거나 없으면 종료
        if (n == null) {
            return null;
        }

        // 루트 부터 비교하면서 크면 오른쪽 작으면 왼쪽 찾기
        int compared = n.getKey().compareTo(k); // 노드n의 키 - key

        // 큰 값 -> 오른쪽 서치
        if (compared > 0)
            return get(n.getRight(), k);
            // 작은 값 -> 왼쪽 서치
        else if (compared < 0)
            return get(n.getLeft(), k);
            // 노드를 찾음
        else
            return (Value) n.getValue();
    }
    /**
     * get메서드를 루트 노드부터 시작하는 메서드
     */
    public Value get(Key key) {
        return get(root, key);
    }

}
