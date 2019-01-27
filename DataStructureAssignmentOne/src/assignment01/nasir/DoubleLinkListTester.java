package assignment01.nasir;

public class DoubleLinkListTester {

	public static void main(String[] args) {
		
		DoubleLinkedList<String> student=new DoubleLinkedList<String>();
		student.addFirst("Nasir");
		//student.removeFirst();
		student.display();
		student.addFirst("Syed");
		student.addLast("Gohary");
		//student.removeFirst();
		student.display();
		//System.out.println(student);
	}

}
