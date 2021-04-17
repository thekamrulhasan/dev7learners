package com.doer.calculator.inputTaken;

import java.util.Scanner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


import com.doer.calculator.common.CalculatorModel;
import com.doer.calculator.service.EvenSumService;



public class InputTakenEvenSum {
	int result;
	Logger logger=LogManager.getLogger(InputTakenEvenSum.class);
	 public void callEvenService(){
			
		    CalculatorModel cmodel=new CalculatorModel();
	        Scanner sc=new Scanner(System.in);
	        System.out.println("Enter Initial value :");
	        int ini = sc.nextInt();     //initial value
	        
	        cmodel.setInitialValue(ini);
	        
	         System.out.println("Enter final value :");
	        int fin=sc.nextInt();   //final value
	        cmodel.setFinalValue(fin);
	        
	        
	        
	        EvenSumService esum=new EvenSumService();
//	        System.out.println("Sum Of Even Numbers between "+ini+" And "+fin+" is: "+ess.calculation(ini,fin));
	        
	        
	        
	        result=esum.calculate(cmodel.getInitialValue(),cmodel.getFinalValue());

			logger.info("Sum Of Even Numbers between "+ini+" And "+fin+" is: "+result+"\r\n");
			
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
