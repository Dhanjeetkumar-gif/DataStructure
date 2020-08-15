package SinglyLinkedList;

public class InsertElementAtLast{
	private ListNode head;
private static  class ListNode{
	private int data;
	private ListNode next;
	public ListNode(int data) {
		this.data=data;
		this.next=null;
	}
}
public static void main(String[] args) {
	InsertElementAtLast ssl=new InsertElementAtLast();
ssl.head=new ListNode(90);
ListNode sec=new ListNode(12);
ListNode third=new ListNode(103);
ListNode fourth=new ListNode(140);

ssl.head.next=sec;
sec.next=third;
third.next=fourth;
ssl.insertAtLast(777);
ssl.getData();

}
public  void  insertAtLast(int value) {
	ListNode newNode=new ListNode(value);
	if(head==null) {
			    head=newNode;
	    return;
	}
	ListNode current=head;
	while(current.next!=null) {
		current=current.next;
		}
	current.next=newNode;
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

}