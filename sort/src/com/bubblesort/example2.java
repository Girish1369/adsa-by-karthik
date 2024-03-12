package com.bubblesort;

public class example2 {
	public static void main(String[] args) {
		int[] ary= {5,2,0,6,8,10};
		int temp;
		for(int i=0;i<=2;i++) {// second highest value thats why took i<=2
			for(int j=0;j<ary.length-1;j++) {
				if(ary[j]>ary[j+1]) {
					temp=ary[j];
					ary[j]=ary[j+1];
					ary[j+1]=temp;
				}
				
			}
		}
		System.out.println(ary[ary.length-2]);
	}
}
