package com.nt.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nt.beans.AppConfig;
import com.nt.beans.WriteDataToExcel;
import com.nt.beans.WriteListOfDataToExcel;

public class ExcelTest {

	public static void main(String[] args) throws Exception {
		System.out.println("main method started...");
		
		  ApplicationContext context=new AnnotationConfigApplicationContext(AppConfig.class);
		  //WriteDataToExcel excel= context.getBean(WriteDataToExcel.class);
		 // excel.writeDataToExcelFile();
		 
		  
		  WriteListOfDataToExcel listOfData=context.getBean(WriteListOfDataToExcel.class);
		  listOfData.listDataToExcel();
		  System.out.println("main method ended...");
	}
}
