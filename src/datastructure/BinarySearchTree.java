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

    /**
     * 트리에 새로운 노드를 추가하는 put 메서드
     * 1. 크기를 비교해서 적절한 위치 찾기
     * 2-1. 이미 존재하는 key라면 value를 갱신
     * 2-2. 새 노드를 생성하고 부모와 연결
     * @param n 새 노드를 추가할 위치를 결정할 시작점
     * @param k 새 노드의 Key
     * @param v 새 노드의 Value
     * @return  새로 저장된 노드
     */
    public NodeForBST put(NodeForBST n, Key k, Value v) {
        /* 재귀 종료 조건
            1. 적절한 위치를 찾아서 set노드를 완료
            2. 파라미터 노드가 null : 노드가 (더이상) 없음 -> set 가능하도록 새로 등록할 노드 반환
         */
        if (n == null) {
            return new NodeForBST(k, v);
        }
        int compared = n.getKey().compareTo(k);
        if (compared > 0)                           // n의 key가 key보다 큼 -> 찾아야 하는 key가 더 작음
            n.setLeft(put(n.getLeft(), k, v));      // 왼쪽에서 적절한 위치를 찾고 왼쪽에 연결
        else if (compared < 0)                      // n의 key가 key보다 작음
            n.setRight(put(n.getRight(), k, v));    // 오른쪽에서 적절한 위치를 찾고 오른쪽에 연결
        else
            n.setValue(v);                      // 적절한 위치를 찾음
        return n;
    }
    /**
     * root부터 시작하는 put 메서드
     */
    public void put(Key k, Value v) {
        put(root, k, v);
    }
}
