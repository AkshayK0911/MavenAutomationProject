package dataDriverTest;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;


import org.apache.poi.xssf.usermodel.*;
import org.testng.annotations.Test;

public class ExcelDataReadMechanism {
  @Test
  public void fileRead() throws IOException
  {
	  File f1=new File("./"+"\\testData\\Data.xlsx");
	  FileInputStream fs=new FileInputStream(f1);
	  
	  //workbook-->sheet--> row-->cell-->value
	  XSSFWorkbook wb=new XSSFWorkbook(fs);
	  
	  //All records
	  
	  int rows=wb.getSheet("userdata").getPhysicalNumberOfRows();
	  System.out.println("Total Rows: "+rows);
	  
	  
	  //All coloumn
	  int cells=wb.getSheet("userdata").getRow(0).getPhysicalNumberOfCells();
	  System.out.println("Total coloumns: "+cells);
	  
	  Object arr[][]=new Object[rows][cells];
	  
	  for(int i=0;i<arr.length;i++)
	  {
		  for(int j=0;j<arr[i].length;j++)
		  {
			  arr[i][j]=wb.getSheet("userdata").getRow(i).getCell(j).getStringCellValue();
			  System.out.print(arr[i][j]+"\t");
		  }
		  System.out.println();
	  }
	  
	  
	  
	  
	  
	  
	  
	  //Single Record
//	  XSSFSheet sheet1= wb.getSheet("userdata");
//	  XSSFRow row1=sheet1.getRow(1);
//	  XSSFCell cell1=row1.getCell(0);
//	  
//	  String value=cell1.getStringCellValue();
//	  
//	  String value=wb.getSheet("userdata").getRow(0).getCell(0).getStringCellValue();
//	  System.out.println(value);
	  
  }
}
