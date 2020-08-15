package SinglyLinkedList;

//import SinglyLinkedList.AddElementToSLL.ListNode;

public class AddElementToBegining {
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
	AddElementToBegining ssl=new AddElementToBegining();
ssl.head=new ListNode(90);
ListNode sec=new ListNode(12);
ListNode third=new ListNode(103);
ListNode fourth=new ListNode(140);

ssl.head.next=sec;
sec.next=third;
third.next=fourth;
ssl.insertAtBegining(78);
ssl.getData();

}
public  void  insertAtBegining(int value) {
	ListNode newNode=new ListNode(value);
	newNode.next=head;
	head=newNode;
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

}