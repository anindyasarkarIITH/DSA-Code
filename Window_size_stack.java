package bucky;
import java.util.*;
import java.util.Stack;
public class Heapify {
		public int WS(int[] input,int size){
			int i=0;
			int result=Integer.MIN_VALUE;
			ArrayList<Integer> arl=new ArrayList<Integer>();
			Stack<Integer> stk=new Stack<Integer>();
			for(i=0;i<=input.length-size;i++){
				//System.out.println(i);
				int k=0;
				while(k<size){
					stk.push(input[i+k]);
					k+=1;
				}
				arl.add(Min(stk));
			
			while(!stk.isEmpty()){
				stk.pop();
			}
			
			}
			for(int n=0;n<arl.size();n++){
				System.out.print(arl.get(n)+"  ");
			}
			for(int v=0;v<arl.size();v++){
				//System.out.println(result);
				if(result<=arl.get(v)){
					result=arl.get(v);
				}
			}
			
			return result;
		}
		public int Min(Stack<Integer> stk){
			int min=Integer.MAX_VALUE;
			while(!stk.isEmpty()){
				int temp=stk.pop();
				if(temp<=min){
					min=temp;
				}
			}
			return min;
		}
		
		public static void main(String[] args){
			Heapify hp=new Heapify();
			int[] input={10,20,30,50,10,70,30};
			int size=3;
			int ret=hp.WS(input, size);
			System.out.println();
			System.out.println(ret);
		}
}
