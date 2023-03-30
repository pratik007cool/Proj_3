package proj3;

import org.junit.Test;

import static org.junit.Assert.*;

public class LinkedListTest {
    LinkedList newNode = new LinkedList();
    @Test
    public void getLength() {
    }

    @Test
    public void insertAtHead() {
        assertEquals(0, newNode.getLength());
        newNode.insertAtHead("A");
        assertEquals(1, newNode.getLength());
        newNode.insertAtHead("B");
        assertEquals(2, newNode.getLength());
    }

    @Test
    public void insertAtTail() {
        newNode.insertAtHead("A");
        assertEquals(1, newNode.getLength());
        newNode.insertAtHead("B");
        newNode.insertAtHead("C");
        newNode.insertAtTail("D");  //insertion at tail of ll.
        newNode.insertAtHead("E");
        assertEquals("(E, C, B, A, D)", newNode.toString());
        assertEquals(5, newNode.getLength());
    }

    @Test
    public void testToString() {
        assertEquals("()", newNode.toString());
        newNode.insertAtTail("D");
        newNode.insertAtTail("C");
        assertEquals("(D, C)", newNode.toString());
    }

    @Test
    public void testgetIthItem(){
        newNode.insertAtTail("A");
        newNode.insertAtTail("B");
        newNode.insertAtTail("C");
        newNode.insertAtTail("D");
        newNode.insertAtTail("E");
        newNode.insertAtTail("F");
        //System.out.println(newNode.toString());
        assertEquals("B",newNode.getIthItem(1) );
        assertEquals("C",newNode.getIthItem(2) );
        assertEquals("F",newNode.getIthItem(5) );
        assertEquals(null,newNode.getIthItem(7) );
    }

    @Test
    public void removeTest() {

        newNode.insertAtTail("A");
        newNode.insertAtTail("B");
        newNode.insertAtTail("C");
        newNode.insertAtTail("D");
        newNode.insertAtTail("E");
        newNode.insertAtTail("F");

        System.out.println(newNode.toString());
        newNode.remove(5);
        System.out.println(newNode.toString());
    }
}