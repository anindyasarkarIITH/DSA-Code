package bucky;
import java.util.*;
public class LinkList {
	public void Method(int v){
	LinkedList lt=new LinkedList<Integer>();
	LinkedList result=new LinkedList<Integer>();
	for(int i=1;i<=v;i++){
		lt.add(i);
	}
	int sz=lt.size();
	while(lt.size()>=2){
		result.add((int)lt.removeFirst());
		result.add((int)lt.removeLast());
	}
	if(sz%2!=0){
	result.add((int)lt.removeFirst());
	}
	for(int i=0;i<result.size();i++){
		System.out.println(result.get(i));
	}
}
	public static void main(String[] args){
		LinkList ll=new LinkList();
		ll.Method(3);
	}
}
