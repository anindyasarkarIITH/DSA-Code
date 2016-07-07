@geeksforgeeks  stack problem


package bucky;
import java.util.*;
import java.util.Stack;
public class Heapify {
	public void StockSpan(int[] input){
		int[] span=new int[input.length];
		Stack<Integer> stk=new Stack<Integer>();
		Hashtable<Integer,Integer> ht=new Hashtable<Integer,Integer>();
		span[0]=1;
		stk.push(input[0]);
		ht.put(input[0],0);
		for(int i=1;i<input.length;i++){
			int count=0;
			int val=0;
			int flag=0;
			if(input[i]>=stk.peek()){
				while(!stk.isEmpty()  && input[i] >=stk.peek() ){
					val= stk.pop();
					count+=1;
				}
				if(stk.isEmpty()){
					flag=1;
					span[i]=i+1;
					stk.push(input[i]);
					ht.put(input[i], i);	
			}
			}
			if(count!=0 && flag!=1){
			span[i]=(i-ht.get(stk.peek()));
			stk.push(input[i]);
			ht.put(input[i], i);
		}
			else if(val==0){
				span[i]=1;
				stk.push(input[i]);
				ht.put(input[i], i);
			}
		}
		System.out.println();
		for (int i=0;i<span.length;i++){
			System.out.print(span[i]+"   ");
		}
	}
		public static void main(String[] args){
			Heapify hp=new Heapify();
			int[] input={100, 40, 5, 90, 120, 80};
			hp.StockSpan(input);
		}
}
