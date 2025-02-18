import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
import org.apache.poi.xssf.usermodel.XSSFWorkbook as XSSFWorkbook
import org.apache.poi.xssf.usermodel.XSSFSheet as XSSFSheet
import org.apache.poi.xssf.usermodel.XSSFRow as XSSFRow
import org.apache.poi.ss.usermodel.CellType as CellType
import java.io.File as File
import java.io.FileInputStream as FileInputStream
import java.io.FileOutputStream as FileOutputStream

WebUI.delay(3)

WebUI.click(findTestObject('Avishkaar Object Repository/Timesheet Management/Home_Page/Timesheet'))

WebUI.click(findTestObject('Avishkaar Object Repository/Timesheet Management/Timesheet_Details_Entry_Page/Timesheet_List_View/New_Button'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.delay(5)

WebUI.setText(findTestObject('Avishkaar Object Repository/Timesheet Management/Date_Range_Popup_Page/Date'), Date_Range)

WebUI.click(findTestObject('Avishkaar Object Repository/Timesheet Management/Date_Range_Popup_Page/Ok_Button'))

WebUI.click(findTestObject('Avishkaar Object Repository/Timesheet Management/Timesheet_Details_Entry_Page/Timesheet_Buttons/COE_Project'))

WebUI.setText(findTestObject('Avishkaar Object Repository/Timesheet Management/Timesheet_Details_Entry_Page/Monday/Monday_Date'), 
    Monday_Date)

WebUI.click(findTestObject('Avishkaar Object Repository/Timesheet Management/Timesheet_Details_Entry_Page/Monday/Monday_Category'))

WebUI.delay(3)

WebUI.click(findTestObject('Avishkaar Object Repository/Timesheet Management/Timesheet_Details_Entry_Page/Monday/Monday_Category_Picklist'))

WebUI.click(findTestObject('Avishkaar Object Repository/Timesheet Management/Timesheet_Details_Entry_Page/Monday/Monday_Sub_Category'))

WebUI.click(findTestObject('Avishkaar Object Repository/Timesheet Management/Timesheet_Details_Entry_Page/Monday/Monday_Sub_Category_Picklist'))

WebUI.setText(findTestObject('Avishkaar Object Repository/Timesheet Management/Timesheet_Details_Entry_Page/Monday/Monday_Hours'), 
    Hours)

WebUI.setText(findTestObject('Avishkaar Object Repository/Timesheet Management/Timesheet_Details_Entry_Page/Monday/Monday_Description'), 
    Monday_Description)

WebUI.click(findTestObject('Avishkaar Object Repository/Timesheet Management/Timesheet_Details_Entry_Page/Monday/Monday_Add'))

WebUI.clearText(findTestObject('Avishkaar Object Repository/Timesheet/Timesheet Submission/Timesheet_Details_Entry_Page/Tuesday/Tuesday_Date'))

WebUI.setText(findTestObject('Avishkaar Object Repository/Timesheet Management/Timesheet_Details_Entry_Page/Tuesday/Tuesday_Date'), 
    Tuesday_Date)

WebUI.click(findTestObject('Avishkaar Object Repository/Timesheet Management/Timesheet_Details_Entry_Page/Timesheet_Buttons/Category'))

WebUI.click(findTestObject('Avishkaar Object Repository/Timesheet Management/Timesheet_Details_Entry_Page/Tuesday/Tuesday_Category'))

WebUI.click(findTestObject('Avishkaar Object Repository/Timesheet Management/Timesheet_Details_Entry_Page/Tuesday/Tuesday_Category_Picklist'))

WebUI.click(findTestObject('Avishkaar Object Repository/Timesheet Management/Timesheet_Details_Entry_Page/Tuesday/Tuesday_Sub_Category'))

WebUI.click(findTestObject('Avishkaar Object Repository/Timesheet Management/Timesheet_Details_Entry_Page/Tuesday/Tuesday_Sub_Category_Picklist'))

WebUI.setText(findTestObject('Avishkaar Object Repository/Timesheet Management/Timesheet_Details_Entry_Page/Tuesday/Tuesday_Hours'), 
    Hours)

WebUI.setText(findTestObject('Avishkaar Object Repository/Timesheet Management/Timesheet_Details_Entry_Page/Tuesday/Tuesday_Description'), 
    Tuesday_Description)

WebUI.click(findTestObject('Avishkaar Object Repository/Timesheet Management/Timesheet_Details_Entry_Page/Tuesday/Tuesday_Add'))

WebUI.clearText(findTestObject('Avishkaar Object Repository/Timesheet Management/Timesheet_Details_Entry_Page/Wednesday/Wednesday_Date'))

WebUI.setText(findTestObject('Avishkaar Object Repository/Timesheet Management/Timesheet_Details_Entry_Page/Wednesday/Wednesday_Date'), 
    Wednesday_Date)

WebUI.click(findTestObject('Avishkaar Object Repository/Timesheet Management/Timesheet_Details_Entry_Page/Timesheet_Buttons/Category'))

WebUI.click(findTestObject('Avishkaar Object Repository/Timesheet Management/Timesheet_Details_Entry_Page/Wednesday/Wednesday_Category'))

WebUI.click(findTestObject('Avishkaar Object Repository/Timesheet Management/Timesheet_Details_Entry_Page/Wednesday/Wednesday_Category_Picklist'))

WebUI.click(findTestObject('Avishkaar Object Repository/Timesheet Management/Timesheet_Details_Entry_Page/Wednesday/Wednesday_Sub_Category'))

WebUI.click(findTestObject('Avishkaar Object Repository/Timesheet Management/Timesheet_Details_Entry_Page/Wednesday/Wednesday_Sub_Category_Picklist'))

WebUI.setText(findTestObject('Avishkaar Object Repository/Timesheet Management/Timesheet_Details_Entry_Page/Wednesday/Wednesday_Hours'), 
    Hours)

WebUI.setText(findTestObject('Avishkaar Object Repository/Timesheet Management/Timesheet_Details_Entry_Page/Wednesday/Wednesday_Description'), 
    Wednesday_Description)

WebUI.click(findTestObject('Avishkaar Object Repository/Timesheet Management/Timesheet_Details_Entry_Page/Wednesday/Wednesday_Add'))

WebUI.clearText(findTestObject('Avishkaar Object Repository/Timesheet Management/Timesheet_Details_Entry_Page/Thursday/Thursday_Date'))

WebUI.setText(findTestObject('Avishkaar Object Repository/Timesheet Management/Timesheet_Details_Entry_Page/Thursday/Thursday_Date'), 
    Thursday_Date)

WebUI.click(findTestObject('Avishkaar Object Repository/Timesheet Management/Timesheet_Details_Entry_Page/Timesheet_Buttons/Category'))

WebUI.click(findTestObject('Avishkaar Object Repository/Timesheet Management/Timesheet_Details_Entry_Page/Thursday/Thursday_Category'))

WebUI.click(findTestObject('Avishkaar Object Repository/Timesheet Management/Timesheet_Details_Entry_Page/Thursday/Thursday_Category_Picklist'))

WebUI.click(findTestObject('Avishkaar Object Repository/Timesheet Management/Timesheet_Details_Entry_Page/Thursday/Thursday_Sub_Category'))

WebUI.click(findTestObject('Avishkaar Object Repository/Timesheet Management/Timesheet_Details_Entry_Page/Thursday/Thursday_Sub_Category_Picklist'))

WebUI.setText(findTestObject('Avishkaar Object Repository/Timesheet Management/Timesheet_Details_Entry_Page/Thursday/Thursday_Hours'), 
    Hours)

WebUI.setText(findTestObject('Avishkaar Object Repository/Timesheet Management/Timesheet_Details_Entry_Page/Thursday/Thursday_Description'), 
    Thursday_Description)

WebUI.click(findTestObject('Avishkaar Object Repository/Timesheet Management/Timesheet_Details_Entry_Page/Thursday/Thursday_Add'))

WebUI.clearText(findTestObject('Avishkaar Object Repository/Timesheet Management/Timesheet_Details_Entry_Page/Friday/Friday_Date'))

WebUI.setText(findTestObject('Avishkaar Object Repository/Timesheet Management/Timesheet_Details_Entry_Page/Friday/Friday_Date'), 
    Friday_Date)

WebUI.click(findTestObject('Avishkaar Object Repository/Timesheet Management/Timesheet_Details_Entry_Page/Timesheet_Buttons/Category'))

WebUI.click(findTestObject('Avishkaar Object Repository/Timesheet Management/Timesheet_Details_Entry_Page/Friday/Friday_Category'))

WebUI.click(findTestObject('Avishkaar Object Repository/Timesheet Management/Timesheet_Details_Entry_Page/Friday/Friday_Category_Picklist'))

WebUI.click(findTestObject('Avishkaar Object Repository/Timesheet Management/Timesheet_Details_Entry_Page/Friday/Friday_Sub_Category'))

WebUI.click(findTestObject('Avishkaar Object Repository/Timesheet Management/Timesheet_Details_Entry_Page/Friday/Friday_Sub_Category_Picklist'))

WebUI.setText(findTestObject('Avishkaar Object Repository/Timesheet Management/Timesheet_Details_Entry_Page/Friday/Friday_Hours'), 
    Hours)

WebUI.setText(findTestObject('Avishkaar Object Repository/Timesheet Management/Timesheet_Details_Entry_Page/Friday/Friday_Description'), 
    Friday_Description)

WebUI.click(findTestObject('Avishkaar Object Repository/Timesheet Management/Timesheet_Details_Entry_Page/Timesheet_Buttons/Submit_Button'))

WebUI.click(findTestObject('Avishkaar Object Repository/Timesheet Management/Timesheet_Details_Entry_Page/Timesheet_Buttons/Proceed'))

WebUI.delay(2)

System.out.println('Timesheet is submitted Successfully.')

// Perform Timesheet-related actions
WebUI.click(findTestObject('Avishkaar Object Repository/Timesheet Management/Home_Page/Timesheet'))

WebUI.click(findTestObject('Avishkaar Object Repository/Timesheet Management/Timesheet_Details_Entry_Page/Timesheet_List_View/List_View_Drop_Down_Button'))

WebUI.click(findTestObject('Avishkaar Object Repository/Timesheet Management/Timesheet_Details_Entry_Page/Timesheet_List_View/My_Timesheet_List_View'))

WebUI.click(findTestObject('Avishkaar Object Repository/Timesheet Management/Timesheet_Details_Entry_Page/Timesheet_List_View/Timesheet_Link'))

WebUI.verifyElementText(findTestObject('Avishkaar Object Repository/Timesheet Management/Timesheet_Details_Entry_Page/Timesheet_List_View/Timesheet_Status'), 
    'Submitted')

// Fetch Timesheet ID
String Timesheet_ID = WebUI.getText(findTestObject('Avishkaar Object Repository/Timesheet Management/Timesheet_Details_Entry_Page/Timesheet_List_View/Timesheet_Id_Details_Page'))

// Define the new Excel file path
String excelFilePath = 'D:/Automation/Katalon Studios/Katalon Output File.xlsx'

File excelFile = new File(excelFilePath)

// Create a new workbook and a sheet
println('Creating a new Excel file.')

XSSFWorkbook workbook = new XSSFWorkbook()

XSSFSheet sheet = workbook.createSheet('Sheet1' // Create a sheet named "Sheet1"
    )

// Add sample data to the sheet
println('Adding data to the new sheet.')

sheet.createRow(0).createCell(0, CellType.STRING).setCellValue('Timesheet ID')

sheet.getRow(0).createCell(1, CellType.STRING).setCellValue(Timesheet_ID)

// Write the workbook to the file system
FileOutputStream outputFile = new FileOutputStream(excelFile)

workbook.write(outputFile)

// Close resources
outputFile.close()

workbook.close()

println('New Excel file created successfully at: ' + excelFile.getAbsolutePath())

