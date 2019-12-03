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

WebUI.callTestCase(findTestCase('Representante/SeleccionarCorreo_Integrado'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.switchToWindowTitle('Control Correspondencia - 20191058')

WebUI.click(findTestObject('Representante/ContinuarFlujo/i_'))

WebUI.click(findTestObject('Representante/ContinuarFlujo/span_28'))

WebUI.click(findTestObject('Representante/ContinuarFlujo/i__1'))

WebUI.setText(findTestObject('Representante/ContinuarFlujo/input_Instrucciones_instrucciones-input'), 'INFORMACIÓN ')

WebUI.setText(findTestObject('Representante/ContinuarFlujo/textarea_V'), 'Actualizar')

WebUI.click(findTestObject('Representante/ContinuarFlujo/button_Completar tarea de aprobacin_Toggle25'))

WebUI.setText(findTestObject('Representante/ContinuarFlujo/input_Ejecutivo Responsable_ms-BasePicker-i_de3217'), 'Laura Vanessa García Agudelo')

WebUI.click(findTestObject('Representante/ContinuarFlujo/div_Laura Vanessa Garca Agudelo'))

WebUI.click(findTestObject('Representante/ContinuarFlujo/div_Correlativo20191058Duracin28 minuto(s)E_99e586'))

WebUI.click(findTestObject('Representante/ContinuarFlujo/label_Aprobar'))

WebUI.delay(5)

WebUI.click(findTestObject('Representante/div_Guardar'))

