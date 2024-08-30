package com.exam;

import java.util.Scanner;

public class Search {
	public static void main(String[] args) {
		
		  Scanner sc=new Scanner(System.in);
		  int a=sc.nextInt();
		  
		  int b[]= {1,2,3,4,5};
		  for(int c=0;c<b.length;c++)
		  if(a==b[c]) {
		   
		   System.out.println("element is found");
		   break;
		  }
	}
}
