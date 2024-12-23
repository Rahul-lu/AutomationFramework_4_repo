package genericutility;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.LocalDateTime;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
/**
 * @author Rahul
 */
public class ExcelUtility {
	/**
	 * This method takes SheetName,rowIndex,coloumn index as an argument and returns values present in the cell
	 * @param sheetname
	 * @param rowIndex
	 * @param colIndex
	 * @return
	 * @throws EncryptedDocumentException
	 * @throws IOException
	 */
public String getStringDataFromExcel(String sheetname,int rowIndex,int colIndex) throws EncryptedDocumentException, IOException {
	FileInputStream fis=new FileInputStream("./src/test/resources/TestData/TestScriptData.xlsx");
	Workbook workbook= WorkbookFactory.create(fis);
	return workbook.getSheet(sheetname).getRow(rowIndex).getCell(colIndex).getStringCellValue();
}
public boolean getBooleanDataFromExcel(String sheetname,int rowIndex,int colIndex) throws EncryptedDocumentException, IOException {
	FileInputStream fis=new FileInputStream("./src/test/resources/TestData/TestScriptData.xlsx");
	Workbook workbook= WorkbookFactory.create(fis);
	return workbook.getSheet(sheetname).getRow(rowIndex).getCell(colIndex).getBooleanCellValue();
}
    public double  getNumberDataFromExcel(String sheetname,int rowIndex,int colIndex) throws EncryptedDocumentException, IOException {
    FileInputStream fis=new FileInputStream("./src/test/resources/TestData/TestScriptData.xlsx");
    Workbook workbook= WorkbookFactory.create(fis);
   return workbook.getSheet(sheetname).getRow(rowIndex).getCell(colIndex).getNumericCellValue();
}
public LocalDateTime getDateFromExcel(String sheetname,int rowIndex,int colIndex) throws EncryptedDocumentException, IOException {
	FileInputStream fis=new FileInputStream("./src/test/resources/TestData/TestScriptData.xlsx");
	Workbook workbook= WorkbookFactory.create(fis);
	return workbook.getSheet(sheetname).getRow(rowIndex).getCell(colIndex).getLocalDateTimeCellValue();
}
}
