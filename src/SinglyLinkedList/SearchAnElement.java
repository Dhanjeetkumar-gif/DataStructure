package SinglyLinkedList;

public class SearchAnElement{
	private ListNode head;
	public static SearchAnElement ssl;
private static  class ListNode{
	private int data;
	private ListNode next;
	public ListNode(int data) {
		this.data=data;
		this.next=null;
	}
}
public static void main(String[] args) {
	 ssl=new SearchAnElement();
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
//ssl.deleteNodeAtPosition(5);
ssl.searchAnElement(78);
ssl.getData();
}
public void  searchAnElement(int key) {
ListNode current=head;
int count=1;

while(current!=null) {
	if(current.data==key) {
		System.out.println(key+" is present at "+count+" position");
		return;
	}
	current=current.next;
	count++;
}
System.out.println(key+" is not found");
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