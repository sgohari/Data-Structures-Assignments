package assignment01.nasir;

public class SingleLinkList<E> {

	// -----nested Node class----------
	private static class Node<E> {
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
			next = n;
		}
	}// -----end of nested Node class
		// instance variable of the SingleyLinkedList

	private Node<E> head = null;
	private Node<E> tail = null;
	private int size = 0;

	public SingleLinkList() {}

	// access methods
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

	public void insertAt(E e, int p) {
		Node<E> newest = new Node<>(e, null);
		if (p == 1) {
			addFirst(e);
		} else if (p == size + 1) {
			addLast(e);
		} else {
			if (p > size + 1 || p < 0) {
				System.out.println("The index is out of range.");
			} else {
				Node<E> cur = head;
				for (int i = 2; i < size + 1; i++) {
					if (p == i) {
						Node<E> temp = cur.getNext();
						cur.setNext(newest);
						cur.getNext().setNext(temp);
						size++;
						return;
					}
					cur = cur.getNext();
				}
			}
		}
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

	public E removeAt(int p) {
		if (isEmpty())
			return null;
		if (p < 1 || p > size) {
			System.out.println("The index " + p + " is out of range.");
			return null;
		}
		if (p == 1) {
			return removeFirst();
		} else {
			Node<E> cur = head;
			for (int i = 2; i < size + 1; i++) {
				if (p == i) {
					E answer = cur.getNext().getElement();
					if (p == size) {
						cur.setNext(null);
						tail = cur;
						// System.out.println("The item " + p + ": " +answer + " was deleted.");
					} else {
						Node<E> temp = cur;
						temp.setNext(cur.getNext().getNext());
						// System.out.println("The item " + p + ": " +answer + " was deleted.");
					}
					size--;
					return answer;
				}
				cur = cur.getNext();
			}
		}
		return null;
	}

	public void showSinglyLinkedList() {
		if (isEmpty()) {
			System.out.println("This is a empty SinglyLinkedList.");
		} else {
			System.out.println(head.getElement());
			if (size > 1) {
				Node<E> cur = head.getNext();
				for (int i = 0; i < size - 1; i++) {
					System.out.println(cur.getElement());
					cur = cur.getNext();
				}
			}

		}
	}

	// @SuppressWarnings("unchecked")
	public void swapNodes(int f, int s) {
			if(f < 1 || f > size) {//validating
				System.out.println("There is no " + f + " element, the list size is " + size + ".");
				return;
			}
			else if( s > size || s < 1) {//validating
				System.out.println("There is no " + s + " element, the list size is " + size + ".");
				return;
			}
			else {
				if(f==s) {// Do not need to swap
					return;
				}
				else {
					if(f>s) {// swap f and s if f > s
						int t = f;
						f=s;
						s=t;
					}
					// find nodes to swap
					E nf = head.getElement();
					E ns = tail.getElement();
					
					Node<E> cur = head;
					for(int i = 1; i < size+1; i++) {
						if(f==i) {
							nf = (E)cur.getElement();
						}
						else if(s==i) {
							ns = (E)cur.getElement();
						}
						cur = cur.getNext();
					}
					//swap nodes
					removeAt(f);
					insertAt(ns, f);
					removeAt(s);
					insertAt(nf, s);
					
				}
			}
	}
}
