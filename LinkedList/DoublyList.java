package DoublyLinkedList;
class Node{
	Node next;
	Node prev;
	int data;
	public Node(int data) {
		this.data = data;
	}
}
public class DoublyList {
 static Node head;
 static Node tail;
 public void InsertAtFirst(int val) {
	 Node newnode = new Node(val);
	 if(head==null) {
		 head=newnode;
		 System.out.println("Head is Newnode");
		 return;
	 }
	 newnode.next=head;
	 head.prev=newnode;
	 head=newnode;
	 System.out.println("Connected At Start Successfully");
 }
 public void InsertAtLast(int val) {
	 Node newnode = new Node(val);
	 if(head==null) {
		 head=newnode;
		 System.out.println("Head is Newnode");
		 return;
	 }
	 Node temp=head;
	 while(temp.next!=null) {
		 temp = temp.next;
	 }
	 temp.next=newnode;
	 newnode.prev=temp;
	 tail=newnode;
	 return;
 }
 public void InsertAtGivenNode(int val,int pos) {
	 Node newnode = new Node(val);
	 if(head==null) {
		 head=newnode;
		 System.out.println("Head is Newnode");
		 return;
	 }
	 Node temp=head;
	 Node curr=head;
	 while(temp.next!=null) {
		 curr=temp.next;
		 if(temp.data!=pos) {
			 break;
		 }
		 temp=temp.next;
	 }
	 newnode.next=curr;
	 curr.prev=newnode;
	 newnode.prev=temp;
	 temp.next=newnode;
	 System.out.println("Attached Successfully");
 }
 public void DeleteAtFirst() {
	 if(head==null) {
		 System.out.println("Empty Hai");
		 return;
	 }
	 head=head.next;
	 head.prev=null;
 }
 public void DeleteAtLast() {
	 if(head==null) {
		 System.out.println("Empty Hai");
		 return;
	 }
	 tail=tail.prev;
	 tail.next=null;
 }
 public void DeleteAtGivenNode(int pos) {
	 if(head==null) {
		 System.out.println("Empty Hai");
		 return;
	 }
	 Node temp=head;
	 Node curr=head;
	 while(temp.next!=null) {
		 if(temp.data==pos) {
			 temp.prev.next=temp.next;
		 }
		 temp=temp.next;
	 }
 }
 public void Display() {
	 Node temp=head;
	 while(temp!=null) {
		 System.out.print(temp.data+"-->");
		 temp=temp.next;
	 }
	 System.out.print("NULL");
 }
 public static void main(String[] args) {
	 DoublyList dl = new DoublyList();
	 dl.InsertAtFirst(10);
	 dl.InsertAtFirst(11);
	 dl.InsertAtFirst(12);
	 dl.InsertAtGivenNode(14, 10);
	 dl.InsertAtLast(15);
	 dl.DeleteAtFirst();
	 dl.DeleteAtLast();
	 dl.DeleteAtGivenNode(11);
	 dl.Display();
}
}
