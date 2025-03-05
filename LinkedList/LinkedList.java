package SinglyLinkedList;
class Node{
	Node next;
	int data;
	public Node( int data) {
		this.data = data;
	}
}
public class LinkedList {
	static Node head;
	public void InsertAtFirst(int val) {
		Node newnode = new Node(val);
		if(head==null) {
			head=newnode;
			System.out.println("Head is newnode");
			return;
		}
		newnode.next=head;
		head=newnode;
		System.out.println("Newnode inserted successfully");
	}
	public void InsertAtLast(int val) {
		Node newnode = new Node(val);
		Node temp=head;
		if(head==null) {
			head=newnode;
			System.out.println("Head is newnode");
			return;
		}
		while(temp.next!=null) {
			temp=temp.next;
		}
		temp.next=newnode;
		System.out.println(val+"is attached at end successfully");
	}
	public void InsertAtGivenNode(int val,int pos) {
		Node newnode = new Node(val);
		if(head==null) {
			head=newnode;
			System.out.println("Head is newnode");
			return;
		}
		Node temp=head;
		while(temp.next!=null && temp.data!=pos) {
			temp=temp.next;
		}
		newnode.next=temp.next;
		temp.next=newnode;
		System.out.println(val+"is attached successfully");
	}
	public void DeleteAtFirst() {
		if(head==null) {
			System.out.println("List Is Empty");
			return;
		}
		head=head.next;
		System.out.println("Delete Done");
	}
	public void DeleteAtLast() {
		if(head==null) {
			System.out.println("List Is Empty");
			return;
		}
		Node temp=head;
		Node prev=head;
		while(temp.next!=null) {
			prev=temp;
			temp=temp.next;
		}
		prev.next=null;
		System.out.println("Last Node Deleted");
	}
	public void DeleteAtGivenNode(int pos) {
		if(head==null) {
			System.out.println("List Is Empty");
			return;
		}
		Node temp=head;
		Node prev=head;
		while(temp.next!=null && temp.data!=pos) {
			prev=temp;
			temp=temp.next;
		}
		prev=temp.next;
		prev.next=null;
	}
	public void Display() {
		Node curr=head;
		while(curr!=null) {
			System.out.print(curr.data+"-->");
			curr=curr.next;
		}
		System.out.print("NULL");
		return;
	}
	public static void main(String[] args) {
		LinkedList ll = new LinkedList();
		ll.InsertAtFirst(12);
		ll.InsertAtFirst(13);
		ll.InsertAtFirst(14);
		ll.InsertAtLast(43);
		ll.InsertAtGivenNode(45, 14);
		ll.DeleteAtFirst();
		ll.DeleteAtLast();
		ll.Display();
	}
}
