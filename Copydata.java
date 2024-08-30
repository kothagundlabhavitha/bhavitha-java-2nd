package com.exam;

public class Copydata {
	public static void main(String[] args) {
		
	
	//	for copying one array to anthoer array
	int a[]= {1,2,3,4,5,6,8,9,9};
	int b[]= new int[a.length];
	for(int i=0;i<a.length;i++) {
	b[i]= a[i];
		System.out.print(+b[i]);
	}
	// for print of all positive numbers
	int c[]= {-2,-3,-4,-5,-5,2,3,4,5,6,7};
	for(int j=0;j<c.length-1;j++) {
	if(c[j]>=0) {
		System.out.print(" "+c[j]);
	}}
    //for sum of private nums and negative nums


	
	int sum=0;
	   
	   int d[]= {1,2,-3,4,-5};
	  // for(int c=0;c<b.length-1;c++) 
	  for(int e=0;e<d.length;e++) 
	//  if(b[c]>0) {
	   
	   if(d[e]<0) {
	   
	  sum=sum+d[e];
	  
	  // System.out.print("   "+sum);
	  }
	   
	  System.out.print(sum);
	 
	}}
	
