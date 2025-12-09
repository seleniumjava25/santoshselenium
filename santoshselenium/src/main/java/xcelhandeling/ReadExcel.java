package xcelhandeling;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

	public static void main(String[] args) {
		try {
		//1use file class to licate the source from where the excel is located 
			File 	src=new File(System.getProperty("user.dir")+"\\testData\\\\testdata.xlsx");
			//File 	src=new File("C:\\Users\\14043\\eclipse-workspace\\santoshselenium\\testData\\testdata.xlsx");
	//2use fileinputstream class and pass the source as an argumnet to stream the data from it 
	FileInputStream fis=new FileInputStream(src);
	
	
    //3create an object of xssfwookbook and pass fis as anrgument 
		
	XSSFWorkbook	workbook=new XSSFWorkbook(fis);
	
	String row =workbook.getSheetAt(0).getRow(0).getCell(0).toString();
	System.out.println(row );
	
	
	String Row =workbook.getSheetAt(0).getRow(0).getCell(1).toString();
	System.out.println(Row );
	
System.out.println(row+" "+Row);
System.out.println("printing all thye data using loop");
        
        int count =workbook.getSheetAt(0).getLastRowNum()+1;
        
        System.out.println(count);
        
        for(int i=0;i<count;i++) {
        	String row1 =workbook.getSheetAt(0).getRow(i).getCell(0).toString();
        	
        	String Row1 =workbook.getSheetAt(0).getRow(i).getCell(1).toString();
        	System.out.println(row1+" "+row1);
        	
        
        }
     
        
        
		
        
		}catch(Exception e) {
			throw new RuntimeException(e);
		}	
	}

}
