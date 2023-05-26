package datastructure.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import datastructure.LinkedList;
import datastructure.Node;

class LinkedListTest {

	@Test
	void testAddAndGet() {
		LinkedList list = new LinkedList();
		list.addInTheFirst(1);
		list.addInTheLast(2);
		list.addInTheMid(3, 1);
		
		assertEquals(1, list.getNode(0).getData());
		assertEquals(3, list.getNode(1).getData());
		assertEquals(2, list.getNode(2).getData());

		assertEquals(list.getNode(1), list.getNode(0).getNext());
		assertEquals(list.getNode(2), list.getNode(1).getNext());
		assertEquals(null, list.getNode(2).getNext());
		
	}
	
	@Test
	void testRemoveFirst(){
		LinkedList list = new LinkedList();
		list.addInTheLast(1);
		list.addInTheLast(2);
		list.addInTheLast(3);

		list.removeNode(0);
		
		assertEquals(2, list.getNode(0).getData());
		assertEquals(3, list.getNode(1).getData());
		
		assertEquals(list.getNode(1), list.getNode(0).getNext());
		assertEquals(null, list.getNode(1).getNext());
	}
	
	@Test
	void testRemoveLast(){
		LinkedList list = new LinkedList();
		list.addInTheLast(1);
		list.addInTheLast(2);
		list.addInTheLast(3);
		
		list.removeNode(2);
		
		assertEquals(1, list.getNode(0).getData());
		assertEquals(2, list.getNode(1).getData());
		
		assertEquals(list.getNode(1), list.getNode(0).getNext());
		assertEquals(null, list.getNode(1).getNext());
	}
	
	@Test
	void testRemoveMid(){
		LinkedList list = new LinkedList();
		list.addInTheLast(1);
		list.addInTheLast(2);
		list.addInTheLast(3);
		
		list.removeNode(1);
		
		assertEquals(1, list.getNode(0).getData());
		assertEquals(3, list.getNode(1).getData());
		
		assertEquals(list.getNode(1), list.getNode(0).getNext());
		assertEquals(null, list.getNode(1).getNext());
	}

}
