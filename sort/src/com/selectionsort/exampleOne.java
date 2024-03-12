package com.selectionsort;

import java.util.Arrays;

public class exampleOne {

	public static void main(String[] args) {
		
		int[] ary= {14,10,56,1,5};//10,14,56,1,5
		exampleOne.selectionSort(ary);
		
	}
	public static void selectionSort(int[] ary) {
		int temp=0;
		for(int i=0;i<=ary.length-1;i++) {
			int minIndx=i;
			for(int j=i+1;j<=ary.length-1;j++) {
				if(ary[j]<ary[minIndx] ) {//10<14
					minIndx=j;//minIndx=1
				}
				
				
			}
			temp=ary[minIndx];//temp=10;
			ary[minIndx]=ary[i];//10=14
			ary[i]=temp;//14=10
		}
		
		
		System.out.println(Arrays.toString(ary));
		
	}
}
