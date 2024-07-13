package datastructure;

public class LinkedList<E> {
	private Node<E> head;
	private Node<E> tail;
	private int size = 0;
	
	public Node<E> getNode(int index) {
		//head에서부터 index번째 노드 찾기
		Node<E> x = head;
		for(int i=0; i<=index-1; i++) {
			x = x.getNext();
		}
		return x;
	}
	
	public void addInTheFirst(E data) {
		Node<E> newNode = new Node<>(data);
		newNode.setNext(head); //이미 존재하는 헤드의 앞에 끼워넣어서 첫번째로 위치시키기
		head = newNode;
		size++;
		if(head.getNext() == null) { 
			tail = head;
		}
	}
	
	public void addInTheLast(E data) {
		Node<E> newNode = new Node<>(data);
		if(size == 0) {
			addInTheFirst(data);
		} else {
			tail.setNext(newNode); //이전 노드에 위치 추가
			tail = newNode; //새 노드를 마지막 노드로 갱신
			size++;
		}
	}
	
	public void addInTheMid(E data, int index) {
		if(index == 0) {
			addInTheFirst(data);
		} else {
			Node<E> newNode = new Node<>(data);
			
			Node<E> former = getNode(index-1);
			Node<E> later = former.getNext();

			former.setNext(newNode);
			newNode.setNext(later);
			
			size++;
			if(later == null) {
				tail = newNode;
			}			
		}
	}
	
	public void removeNode(int index) {
		Node<E> target = getNode(index);
		if(index==0) {					//첫번째 노드 삭제: 첫번째 노드를 다음 노드로 변경
			head = target.getNext(); 
			target.setData(null);
			target.setNext(null);
			size--;
		} else if(target == tail) {		//마지막 노드 삭제: 이전 노드를 마지막 노드로 변경
			Node<E> former = getNode(index-1);
			former.setNext(null); 
			tail = former;
			target.setData(null);
			size--;
		} else {						//중간 노드 삭제: 이전 노드와 다음 노드를 연결
			Node<E> former = getNode(index-1);
			former.setNext(target.getNext());
			target.setData(null);
			target.setNext(null);
			size--;
		}
	}
}
