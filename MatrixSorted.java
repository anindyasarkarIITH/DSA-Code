package bucky;
import java.util.*;
public class Heapify {
		public void MS(int[][] input){
			int count=0;
			ArrayList<Integer> al=new ArrayList();
			ArrayList<Integer> store=new ArrayList();
			int temp=0;
			int l=input[0].length;
			int m=input.length;
			int n=m*l;
			for(int i=0;i<m;i++){
				for(int j=0;j<l;j++){
				al.add(input[i][j]);
				}
			}
			for(int i=n/2;i>=0;i--){
			 al=Heapify(al,i);
			}
			while(!al.isEmpty()){
				store.add(al.get(0));
				al.remove(0);
				n=al.size();
				for(int i=n/2;i>=0;i--){
					 al=Heapify(al,i);
					}
			}
			System.out.println("Sorted elements are: ");
			for(int i=0;i<store.size();i++){
				System.out.print(store.get(i)+ "  ");
			}
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
			int[][] test=new int[4][4];
			test[0][0]=10;test[0][1]=20;test[0][2]=30;test[0][3]=40;
			test[1][0]=15;test[1][1]=25;test[1][2]=35;test[1][3]=45;
			test[2][0]=27;test[2][1]=29;test[2][2]=37;test[2][3]=48;
			test[3][0]=32;test[3][1]=33;test[3][2]=39;test[3][3]=50;
			Heapify hp=new Heapify();
			hp.MS(test);
		}
}
