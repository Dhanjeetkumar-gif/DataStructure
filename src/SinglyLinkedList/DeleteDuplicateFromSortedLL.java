package SinglyLinkedList;

public class DeleteDuplicateFromSortedLL{
	private ListNode head;
	public static DeleteDuplicateFromSortedLL ssl;
private static  class ListNode{
	private int data;
	private ListNode next;
	public ListNode(int data) {
		this.data=data;
		this.next=null;
	}
}
public static void main(String[] args) {
	 ssl=new DeleteDuplicateFromSortedLL();
ssl.head=new ListNode(90);
ListNode sec=new ListNode(90);
ListNode third=new ListNode(123);
ListNode fourth=new ListNode(140);
ListNode fifth=new ListNode(140);

ssl.head.next=sec;
sec.next=third;
third.next=fourth;
fourth.next=fifth;
System.out.println(ssl.length());
ssl.deleteDuplicate();
ssl.getData(ssl.head);
}
public void deleteDuplicate() {
ListNode current=head;
while(current!=null&&current.next!=null) {
	if(current.data==current.next.data) {
		current.next=current.next.next;
		}
	else {
		current=current.next;
	}
	
}
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