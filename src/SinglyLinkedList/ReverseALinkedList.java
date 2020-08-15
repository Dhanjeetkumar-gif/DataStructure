package SinglyLinkedList;

public class ReverseALinkedList{
	private ListNode head;
	public static ReverseALinkedList ssl;
private static  class ListNode{
	private int data;
	private ListNode next;
	public ListNode(int data) {
		this.data=data;
		this.next=null;
	}
}
public static void main(String[] args) {
	 ssl=new ReverseALinkedList();
ssl.head=new ListNode(90);
ListNode sec=new ListNode(12);
ListNode third=new ListNode(103);
ListNode fourth=new ListNode(140);
ListNode fifth=new ListNode(78);

ssl.head.next=sec;
sec.next=third;
third.next=fourth;
fourth.next=fifth;
System.out.println(ssl.length());
ListNode n=ssl.reverseLL(ssl.head);


ssl.getData(n);
}
public ListNode  reverseLL(ListNode head) {
ListNode next=null;
ListNode previous=null;
ListNode current=head;
if(head==null) {
	return head;
}
while(current!=null) {
	next=current.next;
	current.next=previous;
	previous=current;
	current=next;
}
//head=current;
return previous;
}
public void getData(ListNode head) {
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