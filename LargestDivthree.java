@Largest integer divisible by three @GeekforGeeks


package bucky;
import java.util.*;
import java.util.Arrays;
import java.util.Stack;
import java.util.Queue;
public class Heapify {
	 public void Divbythree(int[] input){
		 Arrays.sort(input);
		 int digitsum=0;
		 int flag=0;
		 ArrayList<Integer> ar=new ArrayList();
		 Queue<Integer> zero=new LinkedList();
		 Queue<Integer> one=new LinkedList();
		 Queue<Integer> two=new LinkedList();
		 for(int i=0;i<input.length;i++){
			 if(input[i]%3==0){
			 zero.add(input[i]);
			 }
			 else if(input[i]%3==1){
				 one.add(input[i]);
			 }
			 else {
				 two.add(input[i]);
			 }
			 digitsum+=input[i];
		 }
		int rem=digitsum%3;
		if(rem==1 && !one.isEmpty()){
			one.poll();
		}
		else if(rem==1 && one.isEmpty() && two.size()>=2){
			two.poll();
			two.poll();
		}
		else if(rem==2 && !two.isEmpty()){
			two.poll();
		}
		else if(rem==2 && two.isEmpty() && one.size()>=2){
			one.poll();
			one.poll();
		}
		else if(rem==0){
			System.out.println("sum of the given digit is divisible by three");
		}
		else {
			flag=1;
			System.out.println("It is not possible to represent");
		}
		int[] result=new int[one.size()+two.size()+zero.size()];
		if (flag!=1){
			while(!one.isEmpty()){
				ar.add(one.poll());
		}
			while(!zero.isEmpty()){
				ar.add(zero.poll());
			}
			while(!two.isEmpty()){
				ar.add(two.poll());
			}
		}
		for(int i=0;i<ar.size();i++){
			result[i]=ar.get(i);
		}
		Arrays.sort(result);
		for(int i=result.length-1;i>=0;i--){
			System.out.print(result[i]);
		}
	 }
	
		public static void main(String[] args){
			Heapify hp=new Heapify();
			int[] input={8,3,4,7,8,1,0};
			hp.Divbythree(input);
			
			
		}
}
