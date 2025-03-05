package CircularLinkedList;

class Node{
	Node next;
	int data;
	public Node(int data) {
		this.data = data;
	}
}
public class CircularList {
 static Node last;
 public void InsertAtFirst(int val) {
	 Node newnode = new Node(val);
	 if(last==null) {
		 newnode.next=newnode;
		 last=newnode;
		 return;
	 }
	 Node head=last.next;
	 last.next=newnode;
	 newnode.next=head;
 }
 public void InsertAtLast(int val) {
	 Node newnode = new Node(val);
	 if(last==null) {
		 newnode.next=newnode;
		 last=newnode;
		 return;
	 }
	 Node head=last.next;
	 last.next=newnode;
	 last=newnode;
	 last.next=head;
 }
 public void DeleteAtFirst() {
	 if(last==null) {
			 System.out.println("Empty Hai");
			 return;
	 }
	 Node head=last.next;
	 last.next=head.next;
 }
 public void DeleteAtLast() {
	 if(last==null) {
		 System.out.println("Empty Hai");
		 return;
	 }
	 Node head=last.next;
	 Node curr=last.next;
	 if(head==last) {
		 last=null;
		 return;
	 }
	 while(head.next!=last) {
		 head=head.next;
	 }
	 last=head;
	 last.next=curr;
 }
 public void Display() {
	 Node head=last.next;
	 do {
		 System.out.print(head.data+"-->");
		 head=head.next;
	 }while(head!=last.next);
	 System.out.print("NULL");
 }
 public static void main(String[] args) {
	 CircularList cl = new CircularList();
	 cl.InsertAtFirst(10);
	 cl.InsertAtLast(11);
	 cl.InsertAtLast(12);
	 cl.InsertAtLast(13);
	 cl.InsertAtLast(14);
	 cl.DeleteAtFirst();
	 cl.DeleteAtLast();
	 cl.DeleteAtFirst();
	 cl.Display();
}
 
}
