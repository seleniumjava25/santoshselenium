package utils;

import java.io.FileInputStream;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelLib {
	
	 XSSFWorkbook workbook;
	
	public ExcelLib(String excelpath)  {
		try {
		FileInputStream fis=new FileInputStream(excelpath);
		
			workbook = new XSSFWorkbook(fis);
		
		
		}catch(Exception e) {
			
		}
		}
		
		
	
  public int getRowCount(int sheetNum) {
	   
	return workbook.getSheetAt(sheetNum).getLastRowNum()+1;
  }
  
  public int getRowCount(String sheetName) {
	 
	return workbook.getSheet(sheetName).getLastRowNum()+1;
 }
 
  
	
  
  public String getCellData(int sheetNum,int row,int col) {
	  
	  
	  return workbook.getSheetAt(sheetNum).getRow(row).getCell(col).toString();
	  
  }}
