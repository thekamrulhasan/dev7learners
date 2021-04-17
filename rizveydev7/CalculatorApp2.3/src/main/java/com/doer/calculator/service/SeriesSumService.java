package com.doer.calculator.service;

import com.doer.calculator.common.Calculator;

public class SeriesSumService extends Calculator{
	
	@Override
	public int calculate(int initialValue,int finalValue,int intervalValue) { 
		 int sum=0;
		 int n;
		 n=((finalValue-initialValue)/intervalValue)+1;  ///Mathematical formula for finding n'th terms value
		 
		 if(initialValue < finalValue) {
			 sum=n*initialValue+(n*(n-1)*intervalValue)/2; ///Mathematical formula for finding Sum of series
		 }else {
			 System.out.println("Invalid Input, status: initial value is larger than final");  
		 }
	       
	       return sum;
	}

}
