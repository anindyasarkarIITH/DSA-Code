package bucky;
import java.util.*;
public class Heapify {
		public void MS(int[][] input){
			Hashtable<Integer,Integer> id = new Hashtable();
			int num=input.length * input[0].length;
			int[] count=new int[input.length];
			ArrayList<Integer> temp=new ArrayList();
			for(int i=0;i<input.length;i++){
				id.put(input[i][0],i);
				temp.add(input[i][0]);
			}
			while(num-input.length>0){
			temp=Heapify(temp,0);
			//System.out.println(temp.get(0)+"...  "+temp.get(1)+"...  "+temp.get(2)+"...  "+temp.get(3)+"  ");
			System.out.print(temp.get(0)+"  ");
			int val=id.get(temp.get(0));
			count[val]+=1;
			temp.remove(0);
			//System.out.println(input[val][count[val]]+"         ..."+val+".."+"   "+count[val]);
			id.put(input[val][count[val]],val);
			temp.add(0,input[val][count[val]]);
			num-=1;
			}
			while(!temp.isEmpty()){
				temp=Heapify(temp, 0);
				System.out.print(temp.get(0)+"  ");
				temp.remove(0);
				
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
			test[1][0]=15;test[1][1]=25;test[1][2]=35;test[1][3]=49;
			test[2][0]=27;test[2][1]=29;test[2][2]=37;test[2][3]=48;
			test[3][0]=32;test[3][1]=33;test[3][2]=39;test[3][3]=50;
			Heapify hp=new Heapify();
			hp.MS(test);
		}
}
