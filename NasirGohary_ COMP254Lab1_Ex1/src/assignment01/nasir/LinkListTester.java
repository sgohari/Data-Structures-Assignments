package assignment01.nasir;

public class LinkListTester {

	public static void main(String[] args) {

		System.out.println("\n<=====Singly Linked List Demo======>");
		System.out.println("Printing Empty Linked-List");
		SingleLinkList<String> singleLS = new SingleLinkList<String>();
		singleLS.showSinglyLinkedList();
		System.out.println("\n<=====++++++++++++++++++++++++=====>");
		System.out.println("Adding Four NODES and Displaying All ");
		singleLS.addFirst("Node01");
		singleLS.addFirst("Node02");
		singleLS.addFirst("Node03");
		singleLS.addFirst("Node04");
		singleLS.showSinglyLinkedList();
		System.out.println("<=====++++++++++++++++++++++++=====>\n");
		System.out.println("\n************************************");
		System.out.println("Removing 'Node02' from the list ");
		singleLS.removeAt(3);
		singleLS.showSinglyLinkedList();
		System.out.println("Item 3 was deleted..");
		System.out.println("************************************\n");
		System.out.println("************************************");
		System.out.println("Deleting 'Node03' from the list ");
		singleLS.removeAt(2);
		System.out.println("\nItem 2 was deleted.");
		singleLS.showSinglyLinkedList();
		System.out.println("************************************\n");
		System.out.println("************************************");
		System.out.println("Deleting 'Node01' from the list ");
		singleLS.removeAt(2);
		System.out.println("Item 1 was deleted.");
		singleLS.showSinglyLinkedList();
		System.out.println("************************************\n");
		System.out.println("************************************");
		System.out.println("Deleting 'Node04' from the list ");
		singleLS.removeAt(1);
		singleLS.showSinglyLinkedList();
		System.out.println("************************************");
		System.out.println("************************************");
		System.out.println("Displaying the size of Linked List");
		System.out.println(singleLS.size());
		System.out.println("************************************");
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
