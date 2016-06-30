package bucky;

public class Heapify {
		public void MH(int[] input){
			int n=input.length;
			for(int i=n/2;i>=0;i--){
			 input=Heapify(input,i);
			}
			for(int i=0;i<input.length;i++){
			System.out.print(input[i]+ "   ");
			}
		}
		public int[] Heapify(int[] input,int i){
			int temp=0;
			if((2*i)+1 >=input.length  && ((2*i)+2)>= input.length){
				return input;
			}
			else{
				if(((2*i)+2)<input.length){
				if(input[(2*i)+2]>=input[(2*i)+1] && input[(2*i)+2] >=input[i] ){
					temp=input[i];
					input[i]=input[(2*i)+2];
					input[(2*i)+2]=temp;
					i=(2*i)+2;
					return Heapify(input,i);
					
				}
				else if(input[(2*i)+1]>=input[(2*i)+2] && input[(2*i)+2]>=input[i] && ((2*i)+1)<=input.length){
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
					if(input[i]<=input[(2*i)+1]){
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
			int[] input={3,5,9,6,8,20,10,12,18,9};
			Heapify hp=new Heapify();
			hp.MH(input);
		}
}

