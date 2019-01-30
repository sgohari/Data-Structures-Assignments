package assignment01.nasir;

public class LinkListTester {

	public static void main(String[] args) {

		System.out.println("\nPrinting Single Linked List with no NODE is added!!\n");
		SingleLinkList<String> singleLS = new SingleLinkList<String>();
		singleLS.showSinglyLinkedList();
		System.out.println("\nAdding Four NODES and Displaying All\n ");
		singleLS.addFirst("Node01");
		singleLS.addFirst("Node02");
		singleLS.addFirst("Node03");
		singleLS.addFirst("Node04");
		singleLS.showSinglyLinkedList();
		System.out.println("\nRemoving 'Node02' from the list\n ");
		singleLS.removeAt(3);
		singleLS.showSinglyLinkedList();
		System.out.println("The item 3 was deleted..\n");
		System.out.println();
		singleLS.removeAt(2);
		System.out.println("The item 2 was deleted.");
		singleLS.showSinglyLinkedList();
		System.out.println();
		singleLS.removeAt(2);
		System.out.println("Another item 2 was deleted.");
		singleLS.showSinglyLinkedList();
		System.out.println();
		singleLS.removeAt(1);
		singleLS.showSinglyLinkedList();

		System.out.println(singleLS.size());
		System.out.println();
		singleLS.insertAt("newNode1", 1);
		singleLS.insertAt("newNode5", 2);
		singleLS.showSinglyLinkedList();

		System.out.println();
		singleLS.insertAt("newNode4", 2);
		singleLS.insertAt("newNode3", 2);
		singleLS.insertAt("newNode2", 2);
		singleLS.showSinglyLinkedList();

		singleLS.swapNodes(2, 3);
		System.out.println();
		System.out.println("After swapping of item 2 and 3");
		singleLS.showSinglyLinkedList();

		singleLS.swapNodes(5, 3);
		System.out.println();
		System.out.println("After swapping of item 5 and 3");
		singleLS.showSinglyLinkedList();
	}

}
