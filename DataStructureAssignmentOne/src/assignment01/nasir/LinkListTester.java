package assignment01.nasir;

public class LinkListTester {

	public static void main(String[] args) {
		
		SingleLinkList<String> student=new SingleLinkList<String>();
		//SingleLinkList<String> student2=new SingleLinkList<String>();
		//student2.display();
		student.display();
		student.addFirst("Syed");
		
		student.display();
		student.addFirst("Nasir");
		student.addLast("Gohary");
		//student.removeFirst();
		student.display();
		System.out.println(student.size());
		
		SingleLinkList.Node<String> h=null;
		SingleLinkList.Node<String> h1=null;
		//h.setNext(student);
		student.swapNodes(h, h1);

	}

}
