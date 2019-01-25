package assignment01.nasir;

public class SingleLinkList<E> {

	static class Node<E> {
		private E element;
		private Node<E> next;

		public Node(E e, Node<E> n) {
			element = e;
			next = n;
		}

		public E getElement() {
			return element;
		}

		public Node<E> getNext() {
			return next;
		}

		public void setNext(Node<E> n) {
			this.next = n;
		}

	}// end of nested Node class

	private Node<E> head = null;
	private Node<E> tail = null;
	private int size = 0;

	public int size() {
		return size;
	}

	public boolean isEmpty() {
		return size == 0;
	}

	public E first() {
		if (isEmpty())
			return null;
		return head.getElement();
	}

	public E last() {
		if (isEmpty())
			return null;
		return tail.getElement();
	}

	public void addFirst(E e) {
		head = new Node<>(e, head);
		if (size == 0)
			tail = head;
		size++;
	}

	public void addLast(E e) {
		Node<E> newest = new Node<>(e, null);
		if (isEmpty())
			head = newest;
		else
			tail.setNext(newest);
		tail = newest;
		size++;
	}

	public E removeFirst() {
		if (isEmpty())
			return null;
		E answer = head.getElement();
		head = head.getNext();
		size--;
		if (size == 0)
			tail = null;
		return answer;
	}

	public void display() {
		if (isEmpty())
			System.out.println("Empty");
		else {
			System.out.println(" The list is");
			Node<E> current = head;
			while (current != null) {// && current.getElement()!=null
				System.out.println(current.getElement());
				// System.out.println(current.element);
				current = current.getNext();
			}

		}
	}

	public void swapNodes(Node<E> node1, Node<E> node2) {
		if (isEmpty())
			System.out.println("Empty");
		else {
			Node<E> temp = node2;
			Node<E> current = node1;
			while (current != null) {
				node1.setNext(temp.getNext());
				node2.setNext(current.getNext());
				current = current.getNext();
			}

		}
	}

}
