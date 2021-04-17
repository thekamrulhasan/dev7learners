package com.doer.calculator.main;

import java.util.Scanner;


import com.doer.calculator.common.Calculator;
import com.doer.calculator.inputTaken.InputTakenDivision;
import com.doer.calculator.inputTaken.InputTakenEvenSum;
import com.doer.calculator.inputTaken.InputTakenMultiplication;
import com.doer.calculator.inputTaken.InputTakenOddSum;
import com.doer.calculator.inputTaken.InputTakenSeriesSum;
import com.doer.calculator.inputTaken.InputTakenSubtract;
import com.doer.calculator.inputTaken.InputTakenSum;
import com.doer.calculator.service.SumService;

public class CalculatorApp extends Calculator {
	
	int num;
	
	
	public int serviceChoose() {
		  System.out.println("Enter a value from the following list to get your service"+"\r\n");
		   System.out.println("1 = Service Of EvenSum");
	       System.out.println("2 = Service Of OddSum");
	       System.out.println("3 = Service Of SeriesSum");
	       System.out.println("4 = Service Of Sum");
	       System.out.println("5 = Service Of Subtraction");
	       System.out.println("6 = Service Of Division");
	       System.out.println("7 = Service Of Multiplication");
	       System.out.println("0 = Stop Program");
	       Scanner sc=new Scanner(System.in);
	       return this.num=sc.nextInt();
	}
	
	
	@Override
	public void serviceTaken() {
	
		 int stnum = new CalculatorApp().serviceChoose();
		 if(stnum==0) {
	        	System.exit(stnum); 
	         }
         
         switch(stnum) {
         case 1:
      	    InputTakenEvenSum iteSum=new InputTakenEvenSum();
      	    iteSum.callEvenService();
	        new CalculatorApp().serviceTaken();
      	   break;
         case 2:
        	InputTakenOddSum itoSum=new InputTakenOddSum();
       	    itoSum.callOddService();
 	        new CalculatorApp().serviceTaken();
      	   break;
         case 3:
            InputTakenSeriesSum itsSum=new InputTakenSeriesSum();
            itsSum.callSeriesService();
  	        new CalculatorApp().serviceTaken();
      	   break;
      	   
         case 4:

             InputTakenSum itSum=new InputTakenSum();
             itSum.callSumService();
   	        new CalculatorApp().serviceTaken();
       	   break;
       	   
       	   
         case 5:

             InputTakenSubtract itSub=new InputTakenSubtract();
             itSub.callSubtractService();
   	        new CalculatorApp().serviceTaken();
       	   break;
       	   
       	   
         case 6:

             InputTakenDivision itDiv=new InputTakenDivision();
             itDiv.callDivisionService();
   	        new CalculatorApp().serviceTaken();
       	   break;
       	   
       	   
         case 7:

             InputTakenMultiplication itMulti=new  InputTakenMultiplication ();
             itMulti.callMultiplicationService();
   	        new CalculatorApp().serviceTaken();
       	   break;
        
         default:
      	   System.out.println("Invalid Input!"); 
      	 new CalculatorApp().serviceTaken();
      	   
         
         }
         
         
        
		
	}
	
	public static void main(String[]args) {
		new CalculatorApp().serviceTaken();
	}

}
