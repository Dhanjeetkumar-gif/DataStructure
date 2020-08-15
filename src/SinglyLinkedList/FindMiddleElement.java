package SinglyLinkedList;

public class FindMiddleElement{
	private ListNode head;
	public static FindMiddleElement ssl;
private static  class ListNode{
	private int data;
	private ListNode next;
	public ListNode(int data) {
		this.data=data;
		this.next=null;
	}
}
public static void main(String[] args) {
	 ssl=new FindMiddleElement();
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
int x=ssl.findMiddleElement();
System.out.println(x);
ssl.getData();
}
public int  findMiddleElement() {
ListNode middle=head;
ListNode dmiddle=head;
if(head!=null) {
while(dmiddle!=null&&dmiddle.next!=null) {
	middle=middle.next;
	dmiddle=dmiddle.next.next;
}
return middle.data;

}
return 0;
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