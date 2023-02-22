package dataDriverTest;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class CustomeData 
{
	XSSFWorkbook wb;
	@DataProvider(name="MyData")
	  public Object[][] testData()
	  {
		Object[][] arr= {{"Admin","admin123"},{"Ankita","test123"},{"Akshay","test123"}};
	  return arr;
		
	  }
	@DataProvider(name="filedata")
	public Object[][] fileData()
	{
		 File f1=new File("./"+"\\testData\\Data.xlsx");
		  FileInputStream fs;
		  
		  //workbook-->sheet--> row-->cell-->value
		  
		try {
			fs=new FileInputStream(f1);
			wb = new XSSFWorkbook(fs);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		  
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
				  
			  }
			
		  }
		return arr;  
		
	}
	
	
	
	
	
	
	
	
	

}
