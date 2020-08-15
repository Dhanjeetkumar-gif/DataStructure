package SinglyLinkedList;

public class DeleteFirstNode{
	private ListNode head;
	public static DeleteFirstNode ssl;
private static  class ListNode{
	private int data;
	private ListNode next;
	public ListNode(int data) {
		this.data=data;
		this.next=null;
	}
}
public static void main(String[] args) {
	 ssl=new DeleteFirstNode();
ssl.head=new ListNode(90);
ListNode sec=new ListNode(12);
ListNode third=new ListNode(103);
ListNode fourth=new ListNode(140);

ssl.head.next=sec;
sec.next=third;
third.next=fourth;
ssl.deleteFisrtNode();
ssl.getData();

}
public void  deleteFisrtNode() {
	ListNode temp=head;
	head=head.next;
	temp.next=null;
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