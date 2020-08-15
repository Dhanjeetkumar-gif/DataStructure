package SinglyLinkedList;

public class NthNodeFromEnd{
	private ListNode head;
	public static NthNodeFromEnd ssl;
private static  class ListNode{
	private int data;
	private ListNode next;
	public ListNode(int data) {
		this.data=data;
		this.next=null;
	}
}
public static void main(String[] args) {
	 ssl=new NthNodeFromEnd();
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
//ListNode n=ssl.reverseLL(ssl.head);
int n1=ssl.NthNodeElement(2);
System.out.println(n1);
int n2=ssl.nthNodeElement(2);
System.out.println(n2);
ssl.getData(ssl.head);
}
public int NthNodeElement(int n) {
int size=ssl.length();
int nth_node=size-n+1;
int count=1;
ListNode current=head;
while(count<nth_node) {
	current=current.next;
	count++;
}
return current.data;
}
public int nthNodeElement(int n) {
if(head==null) {
	return head.data;
}
int count=0;
ListNode prefPtr=head;
ListNode mainPtr=head;
while(count<n) {
	prefPtr=prefPtr.next;
	count++;
}
while(prefPtr!=null) {
	prefPtr=prefPtr.next;
	mainPtr=mainPtr.next;
}
return mainPtr.data;
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