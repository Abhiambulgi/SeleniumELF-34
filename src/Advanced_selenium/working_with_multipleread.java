package Advanced_selenium;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class working_with_multipleread {
	public static Object[][] data(String sheet1) throws EncryptedDocumentException, IOException {
		File file=new File("./Testdata/register.xlsx");
		FileInputStream fis=new FileInputStream(file);
		Workbook workbook=WorkbookFactory.create(fis);
		Sheet sheet=workbook.getSheet(sheet1);
		int RowCount=sheet.getPhysicalNumberOfRows();
		int CellCount=sheet.getRow(0).getPhysicalNumberOfCells();
		Object[][] data=new Object[RowCount-1][CellCount];
		for(int i=1; i<RowCount; i++){
			for(int j=0; j<CellCount; j++){
				data[i-1][j]=sheet.getRow(i).getCell(j).toString();
			}
		}
		/*for(int i=0; i<RowCount-1; i++){
			for(int j=0; j<CellCount; j++){
				System.out.println(data[i][j]);*/
	return data;
}
	}

