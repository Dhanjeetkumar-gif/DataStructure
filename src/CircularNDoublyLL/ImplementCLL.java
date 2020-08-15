package CircularNDoublyLL;

public class ImplementCLL {
	private Node last;
	private int length;
	private class Node{
	private	Node next;
    private int data;
		
		public Node(int data) {
			this.data=data;
		}
		
	}
	public ImplementCLL(){
		last=null;
		length=0;
	}
	public void addAfterLastNode(int value) {
		Node newNode=new Node(value);
		if(last==null) {
			last=newNode;
		}
		else {
			newNode.next=last.next;
			//last.next=newNode;
			last=newNode;
		}
		last.next=newNode;
	}

	public static void main(String[] args) {
		ImplementCLL ob=new ImplementCLL();
		ob.addElement();
		ob.display();
		ob.addNodeAtFirstPosition(112);
		ob.addNodeAtFirstPosition(90);
		ob.addAfterLastNode(1234);
		ob.display();

	}
	
	public void addElement() {
	Node first=new Node(10);
	Node sec=new Node(19);
	Node third=new Node(910);
	Node fourth=new Node(710);
	
	first.next=sec;
	sec.next=third;
	third.next=fourth;
	fourth.next=first;
	last=fourth;
	}
	public int length() {
		return length;
	}
	public boolean isEmpty() {
		return length==0;
	}
	public void display() {
		if(last==null) {
			return;
		}
		Node first=last.next;
			while(first!=last) {
			System.out.print(first.data+"-->");
			first=first.next;
		}
		System.out.println(first.data);
	
	}
	public void addNodeAtFirstPosition(int value) {
		Node newNode=new Node(value);
		if(isEmpty()) {
			last=newNode;
		}
		else {
			newNode.next=last.next;
		}
		last.next=newNode;
		length++;
	}
}
