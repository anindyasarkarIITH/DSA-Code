@overlapping merging set problem geeksforgeeks


package bucky;
import java.util.*;
import java.util.Arrays;
import java.util.Stack;
public class Heapify {
	public void Overlapp(int[][] input){
		Stack<Integer> stk=new Stack<Integer>();
		Stack<Integer> sub=new Stack<Integer>();
		Arrays.sort(input, new Comparator<int[]>() {
		    public int compare(int[] a, int[] b) {
		        return Integer.compare(a[0], b[0]);
		    }
		});
		stk.push(input[0][0]);
		stk.push(input[0][1]);
		int i=0;
		while(i<input.length-1){
			if(stk.peek()>=input[i+1][0] && stk.peek()<=input[i+1][1] ){
				stk.pop();
				stk.push(input[i+1][1]);
				i+=1;
			}
			else if( stk.peek()>=input[i+1][1]){
				i+=1;
			}
			else{
				stk.push(input[i+1][0]);
				stk.push(input[i+1][1]);
				i+=1;
			}
		}
		if(stk.peek()<input[input.length-1][1]){
		stk.push(input[input.length-1][1]);
		}
		while(!stk.isEmpty()){
			System.out.println(stk.peek());
			sub.push(stk.pop());
		}
	}
		public static void main(String[] args){
			Heapify hp=new Heapify();
			int[][] input={ {1,100}, {2,8}, {4,6}, {7,10}};
			hp.Overlapp(input);
		}
}
