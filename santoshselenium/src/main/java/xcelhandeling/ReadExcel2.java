package xcelhandeling;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel2 {

	public static void main(String[] args) {
		try {
		//1use file class to licate the source from where the excel is located 
			File 	src=new File(System.getProperty("user.dir")+"\\testData\\\\testdata.xlsx");
			//File 	src=new File("C:\\Users\\14043\\eclipse-workspace\\santoshselenium\\testData\\testdata.xlsx");
	//2use fileinputstream class and pass the source as an argumnet to stream the data from it 
	FileInputStream fis=new FileInputStream(src);
	
	
    //3create an object of xssfwookbook and pass fis as anrgument 
		
	XSSFWorkbook	workbook=new XSSFWorkbook(fis);
	
int	count=workbook.getSheet("usercred").getLastRowNum();
	System.out.println("tatal active rows are "+count);


        
     
          
        for(int i=0;i<count;i++) {
        	String row1 =workbook.getSheet("usercred").getRow(i).getCell(0).toString();
        	
        	String Row1 =workbook.getSheet("usercred").getRow(i).getCell(1).toString();
        	System.out.println(row1+" "+row1);
        	
        
        }
     
        
        
		
        
		}catch(Exception e) {
			throw new RuntimeException(e);
		}	
	}

}
