package datastructure;

public class LinkedList {
	private Node head;
	private Node tail;
	private int size = 0;
	
	public Node getNode(int index) {
		//head에서부터 index번째 노드 찾기
		Node x = head;
		for(int i=0; i<=index-1; i++) {
			x = x.getNext();
		}
		return x;
	}
	
	public void addInTheFirst(Object data) {
		Node newNode = new Node(data);
		newNode.setNext(head); //이미 존재하는 헤드의 앞에 끼워넣어서 첫번째로 위치시키기
		head = newNode;
		size++;
		if(head.getNext() == null) { 
			tail = head;
		}
	}
	
	public void addInTheLast(Object data) {
		Node newNode = new Node(data);
		if(size == 0) {
			addInTheFirst(data);
		} else {
			tail.setNext(newNode); //이전 노드에 위치 추가
			tail = newNode; //새 노드를 마지막 노드로 갱신
			size++;
		}
	}
	
	public void addInTheMid(Object data, int index) {
		if(index == 0) {
			addInTheFirst(data);
		} else {
			Node newNode = new Node(data);
			
			Node former = getNode(index-1);
			Node later = former.getNext();

			former.setNext(newNode);
			newNode.setNext(later);
			
			size++;
			if(later == null) {
				tail = newNode;
			}			
		}
	}
	
}
