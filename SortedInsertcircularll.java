package bucky;
import java.util.*;
public class LinkList {
	int count=1;int ist=0;
	ListNode store;ListNode last;
	public static class ListNode{
		public int data;
		public ListNode next;
		public ListNode previous;
		public ListNode(int data){ 
			this.data = data;
			this.next=null;
			this.previous=null;
		}	
	}
	public ListNode SortedIns(ListNode head,ListNode insert){
		ListNode temp=head;
		if(head.previous.data<insert.data){
			ListNode last=head.previous;
			last.next=insert;
			insert.previous=last;
			head.previous=insert;
			insert.next=head;
		}else if(head.data>insert.data){
			ListNode last=head.previous;
			last.next=insert;
			insert.previous=last;
			head.previous=insert;
			insert.next=head;
			temp=insert;
		}
		else{
		 while(head.data< insert.data){
			 head=head.next;
		 }
		ListNode current=head.previous;
		current.next=insert;
		insert.next=head;
		head.previous=insert;
		insert.previous=current;
		}
		return temp;
	}
	public void display(ListNode head){
		ListNode current = head;
		while (current.next!=head){
			System.out.print(current.data+"....");
			current = current.next;
		}
		System.out.print(current.data);
	}		
	public static void main(String[] args){
		ListNode head=new ListNode(1);
		ListNode fir=new ListNode(2);
		ListNode sec=new ListNode(3);
		ListNode added=new ListNode(4);
		ListNode fou=new ListNode(5);
		ListNode fiv=new ListNode(6);
		ListNode six=new ListNode(8);
		ListNode ladd=new ListNode(0);
		head.next=fir;fir.next=sec;sec.next=fou;
		fir.previous=head;sec.previous=fir;fou.previous=sec;
		fou.next=fiv;fiv.next=head;
		fiv.previous=fou;head.previous=fiv;
		LinkList ll=new LinkList();
		ListNode res=ll.SortedIns(head,added);
		ll.display(res);
		System.out.println(" ");
		ListNode resu=ll.SortedIns(head,six);
		ll.display(resu);
		ListNode resul=ll.SortedIns(head,ladd);
		System.out.println(" ");
		ll.display(resul);
}
			}
