problem no 59 of linklist chapter (from karumanchi book)

package bucky;
import java.util.*;
public class LinkList {
	public void Method(LinkedList lv,int k){
	LinkedList lt=new LinkedList<Integer>();
	LinkedList result=new LinkedList<Integer>();
	
	for(int i=0;i<lv.size();i++){
		if((int)lv.get(i)<k){
			result.add(lv.get(i));
			lv.remove(i);
		}
	}
	for (int j=0;j<lv.size();j++){
		result.add(lv.get(j));
	}
	for(int i=0;i<result.size();i++){
		System.out.println(result.get(i));
	}
}
	public static void main(String[] args){
		LinkList ll=new LinkList();
		LinkedList lt=new LinkedList<Integer>();
		lt.add(1);lt.add(4);lt.add(3);lt.add(6);lt.add(5);lt.add(2);
		
		ll.Method(lt,3);
	}
}
