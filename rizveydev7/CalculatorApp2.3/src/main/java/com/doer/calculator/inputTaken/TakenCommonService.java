package com.doer.calculator.inputTaken;

import java.util.Scanner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class TakenCommonService {
	
	
	Logger logger=LogManager.getLogger(TakenCommonService.class);
	 public void calculation(int result) {
		 System.out.println("1 = Addition , 2 = Subtraction , 3 = Division , 4 = Multiplication , 0 = Termination ");
		 Scanner sc=new Scanner(System.in);
		 int inputValue=sc.nextInt();
		 
         switch(inputValue) {
         case 1:
        	 System.out.println("Enter value that you want to add");
        	 int v1=sc.nextInt();
        	 result+=v1;
        	 System.out.println("->"+result);
        	 calculation(result);
        	 
      	   break;
      	   
         case 2:
        	 System.out.println("Enter value that you want to subtract");
        	 int v2=sc.nextInt();
        	 result-=v2;
        	 System.out.println("->"+result);
        	 calculation(result);
        	 
      	   break;
    
         case 3:
        	 System.out.println("Enter the value of divisor");
        	 int v3=sc.nextInt();
        	 result/=v3;
        	 System.out.println("->"+result);
        	 calculation(result); 
        	 
      	   break;
      	   
         case 4:
        	 System.out.println("Enter the value for multiplying ");
        	 int v4=sc.nextInt();
        	 result*=v4;
        	 System.out.println("->"+result);
        	 calculation(result);
        	 
      	   break; 
      	   
      	   
      
         case 0:
//        	 System.out.println("Final Result: "+result);
        	 logger.info("Final Result: "+result);
        	 
      	   break;
       	   
         default:
        	 System.out.println("Invalid Input");
        	 break;
         
         }
		 
		 
	 }

}
