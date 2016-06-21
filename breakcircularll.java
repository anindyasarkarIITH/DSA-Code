package bucky;
import java.util.*;
public class LinkList {
	int count=1;int ist=0;
	ListNode store;ListNode last;
	public static class ListNode{
		public int data;
		public ListNode next;
		public ListNode(int data){
			this.data = data;
			this.next=null;
		}	
	}
	public ListNode BC(ListNode head){
		ListNode tempa=head;
		ListNode temp=head;
		while (head.next!=temp){
			head =head.next;
			count+=1;
		}
		last=head;
		if(count%2==0){
			ist=count/2;
		}
		else{
			ist=(count/2) + 1;
		}
		for(int i=1;i<ist;i++){
			temp=temp.next;
		}
		store=temp.next;
		temp.next=tempa;
		return tempa;
	}
	public ListNode BCsub(ListNode head){
		last.next=store;
		return store;
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
		ListNode thi=new ListNode(4);
		ListNode fou=new ListNode(5);
		ListNode fiv=new ListNode(6);
		head.next=fir;fir.next=sec;sec.next=thi;
		thi.next=fou;fou.next=fiv;fiv.next=head;
		LinkList ll=new LinkList();
		ListNode res=ll.BC(head);
		ll.display(res);
		ListNode resu=ll.BCsub(head);
		System.out.println(" ");
		ll.display(resu);
}
			}
