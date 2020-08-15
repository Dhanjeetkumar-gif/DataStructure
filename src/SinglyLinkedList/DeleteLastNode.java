package SinglyLinkedList;

public class DeleteLastNode{
	private ListNode head;
	public static DeleteLastNode ssl;
private static  class ListNode{
	private int data;
	private ListNode next;
	public ListNode(int data) {
		this.data=data;
		this.next=null;
	}
}
public static void main(String[] args) {
	 ssl=new DeleteLastNode();
ssl.head=new ListNode(90);
ListNode sec=new ListNode(12);
ListNode third=new ListNode(103);
ListNode fourth=new ListNode(140);

ssl.head.next=sec;
sec.next=third;
third.next=fourth;
ssl.deleteLastNode();
ssl.getData();

}
public void  deleteLastNode() {
	ListNode temp=head;
	int c=1;
	int size=ssl.length();
	while(temp!=null) {
		temp=temp.next;
		c++;
		if(size-1==c) {
			break;
		}
	}
	
	//head=head.next;
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