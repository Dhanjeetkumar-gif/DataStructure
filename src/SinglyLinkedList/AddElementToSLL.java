package SinglyLinkedList;
// Add Elements to the Singly linked list.
public class AddElementToSLL {
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
	ListNode head=new ListNode(10);
	ListNode sec=new ListNode(12);
	ListNode third=new ListNode(103);
	ListNode fourth=new ListNode(140);
	
	head.next=sec;
	sec.next=third;
	third.next=fourth;
	AddElementToSLL ob=new AddElementToSLL();
	ob.getData(head);
    
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

}
