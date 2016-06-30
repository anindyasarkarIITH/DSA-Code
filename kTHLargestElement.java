//once min heap of size k is made it takes o(logk) to find kth largest element of given
//incoming input stream
package bucky;
import java.util.Scanner;
public class Heapify {
		public void MH(int[] input){
			int n=input.length;
			int element=0;
			int[] arr=new int[3];
			for(int i=n/2;i>=0;i--){
			 input=Heapify(input,i);
			}
			for(int i=0;i<arr.length;i++){
				arr[i]=input[i];
			}
			Scanner in = new Scanner(System.in);
			for(int i=0;i<10;i++){
				System.out.println("enter next element: " );
				element=in.nextInt();
			if(element<arr[0]){
				System.out.println(arr[0]);
			}
			else{
				arr[0]=element;
				input=Heapify(arr,0);
				System.out.println(arr[0]);
			}
			}
		}
		public int[] Heapify(int[] input,int i){
			int temp=0;
			if((2*i)+1 >=input.length  && ((2*i)+2)>= input.length){
				return input;
			}
			else{
				if(((2*i)+2)<input.length){
				if(input[(2*i)+2]<=input[(2*i)+1] && input[(2*i)+2] <=input[i] ){
					temp=input[i];
					input[i]=input[(2*i)+2];
					input[(2*i)+2]=temp;
					i=(2*i)+2;
					return Heapify(input,i);
				}
				else if(input[(2*i)+1]<=input[(2*i)+2] && input[(2*i)+1]<=input[i] && ((2*i)+1)<=input.length){
					temp=input[i];
					input[i]=input[(2*i)+1];
					input[(2*i)+1]=temp;
					i=(2*i)+1;
					return Heapify(input,i);
				}
				else{
					return input;
				}
				}
				else{
					if(input[i]>=input[(2*i)+1]){
						temp=input[i];
						input[i]=input[(2*i)+1];
						input[(2*i)+1]=temp;
						i=(2*i)+1;
						return Heapify(input,i);
					}
					else{
						return input;
					}
				}
			}
		}
		public static void main(String[] args){
			int[] input={20,10,12};
			Heapify hp=new Heapify();
			hp.MH(input);
		}
}

