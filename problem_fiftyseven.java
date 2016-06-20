package bucky;
import java.util.*;
public class LinkList {
	public void Method(int v,int ro){
	LinkedList lt=new LinkedList<Integer>();
	LinkedList result=new LinkedList<Integer>();
	for(int i=1;i<=v;i++){
		lt.add(i);
	}
	int temp=lt.size();
	for(int i=1;i<=temp-ro;i++){
		result.add(lt.removeFirst());
	}
	while(!lt.isEmpty()){
		result.addFirst(lt.removeLast());
	}
	for(int i=0;i<result.size();i++){
		System.out.println(result.get(i));
	}
}
	public static void main(String[] args){
		LinkList ll=new LinkList();
		ll.Method(5,1);
	}
}
