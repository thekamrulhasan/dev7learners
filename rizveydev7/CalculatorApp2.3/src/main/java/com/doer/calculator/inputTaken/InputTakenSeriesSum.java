package com.doer.calculator.inputTaken;

import java.util.Scanner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.doer.calculator.common.CalculatorModel;
import com.doer.calculator.service.SeriesSumService;


public class InputTakenSeriesSum {
	int result;
	Logger logger=LogManager.getLogger(InputTakenSeriesSum.class);
	
	
	public void callSeriesService(){
		
		  CalculatorModel cmodel=new CalculatorModel();
		
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Initial value :");
        int ini = sc.nextInt();   //initial value
        cmodel.setInitialValue(ini);
        
        System.out.println("Enter final value :");
        int fin=sc.nextInt();     //final value
        cmodel.setFinalValue(fin);
        
        System.out.println("Enter interval value :");
        int in=sc.nextInt();    //interval value
        cmodel.setIntervalValue(in);
        
        SeriesSumService ssum=new SeriesSumService();
//        System.out.println("Sum Of Series Numbers between "+ini+" And "+fin+" Where Value Of Interval Is "+in+" : "+sss.calculation(ini, fin, in));
        
        
        
        result=ssum.calculate(cmodel.getInitialValue(),cmodel.getFinalValue(),cmodel.getIntervalValue());

		logger.info("Sum Of Series Numbers between "+ini+" And "+fin+" Where Value Of Interval Is "+in+" : "+result+"\r\n");
		
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
