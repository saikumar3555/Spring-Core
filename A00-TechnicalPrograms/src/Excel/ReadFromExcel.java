package Excel;

import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadFromExcel {
	static List<Employee> list=new ArrayList<Employee>();
	public static void main(String[] args) {

		try {
  FileInputStream fis=new FileInputStream(new File("Employee.xlsx"));	
  
    XSSFWorkbook wb=new XSSFWorkbook(fis);
    XSSFSheet sheet=wb.getSheetAt(0);
    
    Iterator<Row> rowIterator =sheet.iterator();
    rowIterator.next();
    
    while(rowIterator.hasNext()) {
    	Employee emp=new Employee();
    	Row row=rowIterator.next();
    	
    	double eid=row.getCell(0).getNumericCellValue();
    	emp.setEid((int)Math.round(eid));
    	
    	String ename=row.getCell(1).getStringCellValue();
    	emp.setEname(ename);
    	
    	String desg=row.getCell(2).getStringCellValue();
    	emp.setDesg(desg);
    	
    	double salary=row.getCell(3).getNumericCellValue();
    	emp.setSalary(salary);
    	list.add(emp);
    
    }
  
		}//try
		catch (Exception e) {
      e.printStackTrace();
		}
				for(Employee emp:list) {
					System.out.println(emp);
				}
				
	
	}//main

}//class
