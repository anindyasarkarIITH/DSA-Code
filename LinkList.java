package bucky;
import java.util.Stack;
import java.util.*;
public class LinkList {
	public void Method(int v){
	Stack st =new Stack<Integer>();
	Queue que=new LinkedList<Integer>();
	LinkedList lt=new LinkedList<Integer>();
	LinkedList result=new LinkedList<Integer>();
	for(int i=1;i<=10;i++){
		lt.add(i);
	}
	int k=0;
	while(lt.size()>=v){
		int j=0;
	while(j<v){
		st.push((int)lt.removeFirst());
		j+=1;
	}
	while(!st.isEmpty()){
		int temp=(int)st.pop();
		result.add(temp);
		k+=1;
	}
	}
	while(!lt.isEmpty()){
		result.add((int)lt.removeFirst());
	}
	for(int i=0;i<result.size();i++){
		System.out.println(result.get(i));
	}
}
	public static void main(String[] args){
		LinkList ll=new LinkList();
		ll.Method(4);
		
	}
}