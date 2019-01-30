package assignment01.nasir;

public class DoubleLinkListTester {

	public static void main(String[] args) {
		
		DoubleLinkedList<String> doublyListM = new DoubleLinkedList<String>();
		doublyListM.addLast("Node01");
		doublyListM.addLast("Node02");
		doublyListM.addLast("Node03");
		doublyListM.addLast("Node04");
		doublyListM.addLast("Node05");
		System.out.println("This is the double linked list M :");
		doublyListM.showDoublyLinkedList();
		System.out.println("The size of the list L is " + doublyListM.size()+ " now.");
		System.out.println();
		//bu.showDoublyLinkedListReverse();
		
		DoubleLinkedList<String> doublListL = new DoubleLinkedList<String>();
		doublListL.addLast("Node06");
		doublListL.addLast("Node07");
		doublListL.addLast("Node08");
		System.out.println("This is the double linked list M:");
		doublListL.showDoublyLinkedList();
		
		System.out.println();
		System.out.println("Concatenated L into M:");
		doublyListM.concatenated(doublListL);
		doublyListM.showDoublyLinkedList();
		System.out.println("The size of the list L is " + doublyListM.size() + " now.");


	}

}
