package SinglyLinkedList;
public class InsertElementAtPosition{
	private ListNode head;
	public static InsertElementAtPosition ssl;
private static  class ListNode{
	private int data;
	private ListNode next;
	public ListNode(int data) {
		this.data=data;
		this.next=null;
	}
}
public static void main(String[] args) {
	 ssl=new InsertElementAtPosition();
ssl.head=new ListNode(90);
ListNode sec=new ListNode(12);
ListNode third=new ListNode(103);
ListNode fourth=new ListNode(140);

ssl.head.next=sec;
sec.next=third;
third.next=fourth;
ssl.insertAtPosition(77,1);
ssl.getData();

}
public  ListNode  insertAtPosition(int value,int pos) {
	ListNode newNode=new ListNode(value);
	int size=ssl.length();
	if(pos>size+1||pos<1) {
		System.out.println("Invalid position");
		return head;
	}
	if(pos==1) {
	newNode.next=head;
	head=newNode;
	return newNode;
	}
	else {
	ListNode previous=head;
	int count=1;
	while(count<pos-1) {
		previous=previous.next;
		//
//		previous.next=newNode;
		count++;
	}
	ListNode current=previous.next;
	newNode.next=current;
	previous.next=newNode;
	return head;
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