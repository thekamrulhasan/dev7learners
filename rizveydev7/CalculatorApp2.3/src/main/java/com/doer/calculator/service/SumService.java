package com.doer.calculator.service;

import java.util.Scanner;

import com.doer.calculator.common.Calculator;

public class SumService extends Calculator {
	
	int sum=0;
	@Override
	public int calculate() {
		
        int n,sum=0,i=0;                
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter how many numbers you want to sum:");
        n=sc.nextInt();
        int a[]=new int[n]; 
        System.out.println("Enter the "+n+" numbers");
        while(i<n)
         {      
        System.out.println("Enter  number  "+(i+1)+":");
        a[i]=sc.nextInt();
        sum+=a[i];    
        i++;     
          }
       System.out.println("sum is ="+sum); 
		
		
		
		return sum+calculate(sum);
	}

}
