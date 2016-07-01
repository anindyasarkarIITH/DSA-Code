
package bucky;
import java.util.*;
public class Heapify {
		public void Rope(ArrayList<Integer> input){
			int n=input.size();
			int count=0;
			ArrayList<Integer> al=new ArrayList();
			ArrayList<Integer> store=new ArrayList();
			int temp=0;
			for(int i=n/2;i>=0;i--){
			 input=Heapify(input,i);
			}
			for(int i=0;i<n-1;i++){
				if(input.size()>=3 && input.get(1)<=input.get(2)){
				input.set(0, input.get(1)+input.get(0));
				store.add(input.get(0));
				input.remove(1);
				input=Heapify(input,0);
			}
				else if(input.size()>=3 && input.get(2)<=input.get(1)){
					input.set(0, input.get(2)+input.get(0));
					store.add(input.get(0));
					input.remove(2);
					input=Heapify(input,0);
				}
				else{
					input.set(0, input.get(1)+input.get(0));
					store.add(input.get(0));
				}
			}
			int result=0;
			System.out.println("  ");
			for(int i=0;i<store.size();i++){
				System.out.println("At " +(i+1)+" th connection the length becomes :"+store.get(i));
				result +=store.get(i);
			}
			System.out.println("The total connection length: "+result);
			}
		public ArrayList<Integer> Heapify(ArrayList<Integer> input,int i){
			int temp=0;
			if((2*i)+1 >=input.size()  && ((2*i)+2)>= input.size()){
				return input;
			}
			else{
				if(((2*i)+2)<input.size()){
				if(input.get((2*i)+2) <=input.get((2*i)+1) &&  input.get((2*i)+2) <= input.get(i) ){
					temp=input.get(i);
					input.set(i, input.get((2*i)+2));//=input.get((2*i)+2);
					input.set((2*i)+2,temp);
					i=(2*i)+2;
					return Heapify(input,i);
				}
				else if(input.get((2*i)+1)<=input.get((2*i)+2) && input.get((2*i)+1)<=input.get(i) && ((2*i)+1)<=input.size()){
					temp=input.get(i);
					input.set(i, input.get((2*i)+1));
					input.set((2*i)+1,temp);
					i=(2*i)+1;
					return Heapify(input,i);
				}
				else{
					return input;
				}
				}
				else{
					if(input.get(i)>=input.get((2*i)+1)){
						temp=input.get(i);
						input.set(i, input.get((2*i)+1));
						input.set((2*i)+1,temp);
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
			int[] input={4,6,2,3};
			ArrayList<Integer> inpt=new ArrayList();
			inpt.add(4);inpt.add(6);inpt.add(2);inpt.add(3);
			Heapify hp=new Heapify();
			hp.Rope(inpt);
		}
}

