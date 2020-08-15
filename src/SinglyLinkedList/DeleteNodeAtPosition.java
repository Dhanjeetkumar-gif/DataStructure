package SinglyLinkedList;
public class DeleteNodeAtPosition{
	private ListNode head;
	public static DeleteNodeAtPosition ssl;
private static  class ListNode{
	private int data;
	private ListNode next;
	public ListNode(int data) {
		this.data=data;
		this.next=null;
	}
}
public static void main(String[] args) {
	 ssl=new DeleteNodeAtPosition();
ssl.head=new ListNode(90);
ListNode sec=new ListNode(12);
ListNode third=new ListNode(103);
ListNode fourth=new ListNode(140);

ssl.head.next=sec;
sec.next=third;
third.next=fourth;
System.out.println(ssl.length());
ssl.deleteNodeAtPosition(5);
ssl.getData();
}
public void  deleteNodeAtPosition(int pos) {
	ListNode previous=head;
	if(head.next==null) {
		System.out.println(" node containing ["+head.data+"] will be deleted");
		head=null;
		return;
	}
	if(pos<1||pos>ssl.length()) {
		System.out.println("invalid position");
		return;
	}
	else {
	int count=1;
	
	while(count<pos-1) {
		previous=previous.next;
		count++;
	}
	ListNode current=previous.next;
	previous.next=current.next;
	current.next=null;
}
}
public void getData() {
	if(head==null) {
		return;
	}
	ListNode current=head;
	while(current!=null) {
		System.out.print(current.data+"-->");
		current=current.next;
	}
	System.out.println(current);
}
public int length() {
	int count=0;
	if(head==null) {
		return 0;
	}
	ListNode current=head;
	while(current!=null) {
		count++;
		current=current.next;
	}
	return count;
}
}