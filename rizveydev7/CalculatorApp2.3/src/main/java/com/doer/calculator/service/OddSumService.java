package com.doer.calculator.service;

import com.doer.calculator.common.Calculator;

public class OddSumService extends Calculator{
	@Override
	public int calculate(int initialValue,int finalValue) {  
            int sum=0;
		
		if(initialValue < finalValue) {
	        for(int i=initialValue;i<=finalValue;i++){    
	            if(i%2!=0){       
	              sum=sum+i;

	            }
	        }
	        
	       
		}else {
			System.out.println("Invalid Input, status: initial value is larger than final");
		}
		 return sum;  
	}

}
