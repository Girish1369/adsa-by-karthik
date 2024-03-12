package com.bubblesort;

import java.util.Arrays;

public class example1 {

	public static void main(String[] args) {
		int[] ary= {9,0,15,2,25};
		
		int count=0;
		int temp;
		
		for(int i=0;i<=ary.length-1;i++) {
			boolean flag=false;
			for(int j=0;j<=ary.length-2;j++) {
				count++;
				if(ary[j]>ary[j+1]){
					flag=true;
					temp=ary[j];
					ary[j]=ary[j+1];
					ary[j+1]=temp;
					
				}
				
			}
			if(!flag) {break;}
		}
	   System.out.println(Arrays.toString(ary)+" --- "+"count="+count);
		
		
	}
	
	

}
