package assignment01.nasir;

public class DoubleLinkedList<E> {
	
	private static class Node<E> {
		private E element;

		private Node<E> prev;
		private Node<E> next;

		public Node(E e, Node<E> p, Node<E> n) {
			super();
			this.element = e;
			this.prev = p;
			this.next = n;
		}

		public Node<E> getPrev() {
			return prev;
		}

		public void setPrev(Node<E> prev) {
			this.prev = prev;
		}

		public Node<E> getNext() {
			return next;
		}

		public void setNext(Node<E> next) {
			this.next = next;
		}

		public E getElement() {
			return element;
		}	
		
	}// End Node 

	
	private Node<E> header;
	private Node<E> trailer;
	private int size=0;
	public DoubleLinkedList() {		
		header = new Node<>(null,null,null);
		trailer = new Node<>(null,header,null);
		header.setNext(trailer);
	}
	public int size() {return size;}
	
	public boolean isEmpty(){return size==0;}
	
	public E first() {
		if(isEmpty())return null;
		return header.getNext().getElement();
	}
	public E last() {
		if(isEmpty())return null;
		return trailer.getPrev().getElement();
	}
	public void addFirst(E e) {
		addBetween(e,header,header.getNext());
	}
	
	public void addLast(E e) {
		addBetween(e,trailer.getPrev(),trailer);
	}
	
	public E removeFirst() {
		if(isEmpty())return null;
		return remove(header.getNext());
	}
	
	
	private void addBetween(E e, Node<E> predecessor, Node<E> successor) {
		Node<E> newest=new Node<>(e,predecessor, successor);
		predecessor.setNext(newest);
		successor.setPrev(newest);
		size++;		
	}
	private E remove(Node<E> node) {
		Node<E> predecessor=node.getPrev();
		Node<E> successor=node.getPrev();
		predecessor.setNext(successor);
		successor.setPrev(predecessor);
		size--;	
		return node.getElement();
	}
	public void display() {
		if(isEmpty())System.out.println("Empty");
		else {
			System.out.println(" The list is");
			Node<E> current=header;
			while(current!=null) {
				System.out.println(current.element);
				current=current.getNext();
			}
				
		}
	}

}
