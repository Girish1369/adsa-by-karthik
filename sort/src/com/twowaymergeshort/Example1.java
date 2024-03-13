package com.twowaymergeshort;

import java.util.Arrays;

public class Example1 {

	public static void main(String[] args) {
		int[] a= {1,3,5,7};
		int[] b= {2,4,6,8,9};
		int m=a.length;
		int n=b.length;
		int[] c=new int[m+n];
		int i=0,j=0,k=0;
		while(i<m&&j<n) {
			if(a[i]<b[j]) {
				c[k]=a[i];
				i++;
				k++;
				
			}else {
				c[k]=b[j];
				j++;
				k++;
			}
		}
		while(i<m) {
			c[k]=a[i];
			i++;
			k++;
		}
		while(j<n) {
			c[k]=b[j];
			j++;
			k++;
			
		}
		
		System.out.println(Arrays.toString(c));
		

	}

}
