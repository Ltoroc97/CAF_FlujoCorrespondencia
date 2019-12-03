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
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('http://smdepbwsp02v:8004/sites/correspondencia/oecu/Lists/CSL_Correspondencia/DispForm.aspx?ID=156&Source=http%3A%2F%2Fsmdepbwsp02v%3A8004%2Fsites%2Fcorrespondencia%2Foecu%2FLists%2FCSL%5FCorrespondencia%2FAllItems%2Easpx&ContentTypeId=0x0100E245C67AF7604E68B58DA3883D24394D007C8938C3BCEA1B4DAE0EBAF3E97EC954')

WebUI.click(findTestObject('Object Repository/Eliminar Solicitud/span_Eliminar elemento'))

WebUI.acceptAlert()

