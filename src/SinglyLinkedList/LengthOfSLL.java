package SinglyLinkedList;
public class LengthOfSLL {
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
	LengthOfSLL ssl=new LengthOfSLL();
ssl.head=new ListNode(90);
ListNode sec=new ListNode(12);
ListNode third=new ListNode(103);
ListNode fourth=new ListNode(140);

ssl.head.next=sec;
sec.next=third;
third.next=fourth;
int l=ssl.getLengthOfSLL();
System.out.println(l);

}
public  int getLengthOfSLL() {
	if(head==null) {
		return 0;
	}
	ListNode current=head;
	int count=0;
	while(current!=null) {
		count++;
		current=current.next;
	}
	return count;
}
}