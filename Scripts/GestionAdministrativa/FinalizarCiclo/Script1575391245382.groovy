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

WebUI.callTestCase(findTestCase('Representante/InicioSesion_AccesoCorreo'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Gestion Administrativa/span_20200002 PRUEBA - APROBACIN GESTIN ADMINISTRATIVA'))

WebUI.click(findTestObject('Object Repository/Gestion Administrativa/a_CORRESPONDENCIA'))

WebUI.switchToWindowTitle('Control Correspondencia - 20200002')

WebUI.click(findTestObject('Object Repository/Gestion Administrativa/i_'))

WebUI.setText(findTestObject('Object Repository/Gestion Administrativa/input_Trmite Interno_tramiteInterno-input'), 'ARCHIVO')

WebUI.setText(findTestObject('Object Repository/Gestion Administrativa/input_Archivado en_archivadoEn-input'), 'BANCOS')

WebUI.setText(findTestObject('Object Repository/Gestion Administrativa/div_finalizar'), 'Finalizar')

WebUI.click(findTestObject('Gestion Administrativa/button_Completar tarea de aprobacin_Toggle28'))

WebUI.click(findTestObject('Gestion Administrativa/label_Aprobar'))

WebUI.delay(5)

WebUI.click(findTestObject('Gestion Administrativa/button_Guardar'))

WebUI.click(findTestObject('Gestion Administrativa/div_Guardar'))

