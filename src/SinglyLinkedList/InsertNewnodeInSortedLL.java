package SinglyLinkedList;
public class InsertNewnodeInSortedLL{
	private ListNode head;
	public static InsertNewnodeInSortedLL ssl;
private static  class ListNode{
	private int data;
	private ListNode next;
	public ListNode(int data) {
		this.data=data;
		this.next=null;
	}
}
public static void main(String[] args) {
	 ssl=new InsertNewnodeInSortedLL();
ssl.head=new ListNode(9);
ListNode sec=new ListNode(10);
ListNode third=new ListNode(11);
ListNode fourth=new ListNode(14);
ListNode fifth=new ListNode(15);

ssl.head.next=sec;
sec.next=third;
third.next=fourth;
fourth.next=fifth;
System.out.println(ssl.length());
ssl.insertIntoSortedLL(13);
ssl.getData(ssl.head);
}
public void insertIntoSortedLL(int value) {
ListNode newNode=new ListNode(value);
ListNode temp=null;
ListNode current=head;
if(head==null) {
	head=newNode;
}
while(current!=null&&current.data<newNode.data) {
	temp=current;
	current=current.next;
}
temp.next=newNode;
newNode.next=current;
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