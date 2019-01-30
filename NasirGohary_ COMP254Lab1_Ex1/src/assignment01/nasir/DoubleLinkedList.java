package assignment01.nasir;

public class DoubleLinkedList<E> {
	private static class Node<E>{
		private E element;
		private Node<E> prev;
		private Node<E> next; 
		public Node(E e, Node<E> p, Node <E> n){
			element = e;
			prev = p;
			next = n;
		}
		public E getElement() {
			return element;
		}
		public Node<E>getPrev(){
			return prev;
		}
		public Node<E>getNext(){
			return next;
		}
		public void setPrev(Node<E> p) {
			prev = p;
		}
		public void setNext(Node<E> n) {
			next = n;
		}
	}
	private Node<E> header;
	private Node<E> trailer;
	private int size = 0;
	//COnstructs a new empty list
	public DoubleLinkedList() {
		header = new Node<>(null, null, null);
		trailer = new Node<>(null, header, null);
		header.setNext(trailer);
	}
	//Returns the number of elements in the linked list
	public int size() {return size;}
	//Tests whether the linked list is empty
	public boolean isEmpty() { return size == 0;}
	//Return (but does not remove) the last element of the list
	public E first() {
		if(isEmpty()) return null;
		return header.getNext().getElement();
	}
	//public update methods
	//Adds element e to the front of the list
	public void addFirst(E e) {
		addBetween(e, header, header.getNext());
	}
	public void addLast(E e) {
		addBetween(e, trailer.getPrev(), trailer);
	}
	public E removeFirst() {
		if(isEmpty()) return null;
		return remove(header.getNext());
	}
	public E removeLast() {
		if(isEmpty()) return null;
		return remove(trailer.getPrev());
	}
	
	//private update methods
	//Adds element e to the linked list in between the given nodes
	private void addBetween(E e, Node<E>predecessor, Node<E> successor) {
		// create and link a new node
		Node<E>newest = new Node<>(e, predecessor, successor);
		predecessor.setNext(newest);
		successor.setPrev(newest);
		size++;
	}
	private E remove(Node<E> node) {
		Node<E>predecessor = node.getPrev();
		Node<E>successor = node.getNext();
		predecessor.setNext(successor);
		successor.setPrev(predecessor);
		size--;
		return node.getElement();
	} //-------end of DoublyLinkedList class------------
	
	public void showDoublyLinkedList(){
		if(isEmpty()) {
			System.out.println("This is a empty list.");
		}
		else {
			Node<E> cur = header;
			for(int i = 0; i < size; i++) {
				System.out.println(cur.getNext().getElement());
				cur = cur.getNext();
			}
		}
	}
	public void showDoublyLinkedListReverse(){
		if(isEmpty()) {
			System.out.println("This is a empty list.");
		}
		else {
			Node<E> cur = trailer;
			for(int i = 0; i < size; i++) {
				System.out.println(cur.getPrev().getElement());
				cur = cur.getPrev();
			}
		}
	}
	public DoubleLinkedList<E> concatenated(DoubleLinkedList<E> M){
		if(!M.isEmpty()) {
			Node<E> cur = M.header;
			for(int i = 0; i < M.size; i++) {
				addLast(cur.getNext().getElement());
				cur= cur.getNext();
			}
		}
		return this;
	}
}

