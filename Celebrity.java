@GeeksforGeeks celebrity problem in stack chapter


package bucky;
import java.util.*;
import java.util.Stack;
public class Heapify {
	public void Party(int[][] input){
		Stack<Integer> stk=new Stack<Integer>();
		int flag=0;
		for(int i=input.length-1;i>=0;i--){
			stk.push(i);
		}
		while(stk.size()>1){
			int a = stk.pop();
			int b= stk.pop();
			if((input[a][b]==1 || input[b][a]==1) && (input[a][b] * input[b][a]==0)){
				if(input[a][b]==1){
					stk.push(b);
				}
				else{
					stk.push(a);
				}
			}	
		}
		if(stk.size()==1){
			System.out.println(stk.peek());
			int i=0;
			while (i<input.length-1){
				if(input[i][stk.peek()] ==1){
					i+=1;
				}
				else if(i==stk.peek()){
					int j=0;
					while(j<input.length){
						if(input[i][j]==0){
							j+=1;
						}
						else{
							flag=1;
							break;
						}
					}
					i+=1;
				}
				else{
					flag=1;
					break;
				}	
			}
			if (flag==0){
			System.out.println("The person has ID  "+stk.peek());
			}
			else{
				System.out.println("There is no such person exist");
			}
		}
		else {
			System.out.println("There is no such person exist");
		}
	}
		public static void main(String[] args){
			Heapify hp=new Heapify();
			int[][] input={{0,0,1,0},{0,0,1,0},{0,0,1,0},{0,0,1,0}};
			hp.Party(input);
		}
}
