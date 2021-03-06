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

WebUI.click(findTestObject('EjecutivoResponsable/span_20200002 PRUEBA - APROBACIN EJECUTIVO RESPONSABLE'))

WebUI.click(findTestObject('EjecutivoResponsable/a_CORRESPONDENCIA'))

WebUI.switchToWindowTitle('Control Correspondencia - 20200002')

WebUI.setText(findTestObject('Object Repository/EjecutivoResponsable/div_sdfsfwewe'), 'https://tasks.intergrupo.com/login_page.php?return=main_page.php')

WebUI.setText(findTestObject('EjecutivoResponsable/input_Reasignado a_ms-BasePicker-input input-119'), 'Laura Vanessa García Agudelo')

WebUI.click(findTestObject('EjecutivoResponsable/div_Laura Vanessa Garca Agudelo'))

WebUI.click(findTestObject('Object Repository/EjecutivoResponsable/label_EVALUACIN CRITERIO TCNICO'))

WebUI.click(findTestObject('EjecutivoResponsable/div_Completar tarea de aprobacin_ms-Toggle-thumb thumb-156'))

WebUI.click(findTestObject('EjecutivoResponsable/label_Aprobar'))

WebUI.delay(3)

WebUI.click(findTestObject('EjecutivoResponsable/div_Guardar'))

WebUI.click(findTestObject('EjecutivoResponsable/button_Guardar'))

