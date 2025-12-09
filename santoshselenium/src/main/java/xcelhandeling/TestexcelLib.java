package xcelhandeling;

import utils.ExcelLib;

public class TestexcelLib {

	public static void main(String[] args) {
		ExcelLib	excel=new ExcelLib(System.getProperty("user.dir")+"\\testData\\\\testdata.xlsx");
	int 	count=excel.getRowCount(1);
	
	System.out.println(count);
	
	
	for(int i=0;i<count;i++) {
		
		String row=excel.getCellData(1,i,0);
		String col =excel.getCellData(1,i,1);
		System.out.println(row+" "+col); 
	}

	}

}
