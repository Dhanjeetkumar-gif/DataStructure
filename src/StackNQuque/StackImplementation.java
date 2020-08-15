package StackNQuque;

import java.util.EmptyStackException;

public class StackImplementation {
	static Node top;
	static int len;
	static class Node{
  	  Node next;
  	  int data;
  	  public Node(int data) {
  		  this.data=data;
  		  this.next=null;
  	  }
  	  
    }
	public StackImplementation(){
		len=0;
		top=null;
	}
	public int length() {
		return len;
	}
	public static boolean isEmpty() {
		return len==0;
	}
	public static void main(String[] args) {
		StackImplementation ob=new StackImplementation();
		ob.push(12);
		ob.push(19);
		ob.push(89);
		System.out.println(peek());
		pop();
		System.out.println(peek());
	}
	public static void push(int value) {
		Node newNode=new Node(value);
		
			newNode.next=top;
			top=newNode;
			len++;
	}
	public static int pop() {
		if(isEmpty()) {
			throw new EmptyStackException();
		}
		int result=top.data;
			top=top.next;
			len--;
			return result;
	}
	public static int peek() {
		if(isEmpty()) {
			throw new EmptyStackException();
		}
		return top.data;
	}

}
