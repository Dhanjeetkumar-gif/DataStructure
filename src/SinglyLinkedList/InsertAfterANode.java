package SinglyLinkedList;

public class InsertAfterANode{
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
	InsertAfterANode ssl=new InsertAfterANode();
ssl.head=new ListNode(90);
ListNode sec=new ListNode(12);
ListNode third=new ListNode(103);
ListNode fourth=new ListNode(140);

ssl.head.next=sec;
sec.next=third;
third.next=fourth;
ssl.insertAfterANode(third,77);
ssl.getData();

}
public  void  insertAfterANode(ListNode previous,int value) {
	ListNode newNode=new ListNode(value);
	if(previous==null) {
	  System.out.println("Prious nod ecan not be null");
	    return;
	}
	newNode.next=previous;
	previous.next=newNode;
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