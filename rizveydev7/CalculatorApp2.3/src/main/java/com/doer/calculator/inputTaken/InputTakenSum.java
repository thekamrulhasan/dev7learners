package com.doer.calculator.inputTaken;

import java.util.Scanner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.doer.calculator.common.CalculatorModel;
import com.doer.calculator.service.SumService;


public class InputTakenSum {
	int result;
	Logger logger=LogManager.getLogger(InputTakenEvenSum.class);
	 public void callSumService(){
			

     
	       
	        
	        
	        
	        SumService sum=new SumService();

	        
	        
	        
	        result=sum.calculate();

			logger.info("Sum Of  Numbers is: "+result+"\r\n");
			
			System.out.println("Do you want to farther operation over the result? y/n ");
			
			Scanner sc1=new Scanner(System.in);
			String st=sc1.next();
			
			TakenCommonService commonService=new TakenCommonService();
			
			if(st.equals("y")) {
				commonService.calculation(result);
			}else if(st.equals("n")) {
				System.out.println("Your result has beeen saved ");
			}
			

	    }

}
