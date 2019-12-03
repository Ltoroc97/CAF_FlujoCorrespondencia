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

WebUI.callTestCase(findTestCase('IniciarSesion_AplicacionCAF/IngresarPaginaPrincipal_CAF'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Recepcion/Boton Crear Nuevo Elemento'))

WebUI.click(findTestObject('Object Repository/Recepcion/Crear Flujo/input_Procedencia_procedencia-input'))

WebUI.setText(findTestObject('Object Repository/Recepcion/Crear Flujo/input_Procedencia_procedencia-input'), 'ECUADOR')

WebUI.setText(findTestObject('Object Repository/Recepcion/Crear Flujo/input_Tipo Documento_tipoDocumento-input'), 'ORIGINAL')

WebUI.click(findTestObject('Object Repository/Recepcion/Crear Flujo/i_'))

WebUI.click(findTestObject('Object Repository/Recepcion/Crear Flujo/span_20'))

WebUI.setText(findTestObject('Object Repository/Recepcion/Crear Flujo/input_Nmero Oficio_numeroOficio'), '12')

WebUI.setText(findTestObject('Object Repository/Recepcion/Crear Flujo/input_Relacionado Con_relacionadoCon-input'), 'PRESTAMO PUBLICO')

WebUI.setText(findTestObject('Object Repository/Recepcion/Crear Flujo/input_Nombre de Crdito_nombreCredito'), 'PRUEBA')

WebUI.click(findTestObject('Recepcion/Crear Flujo/span_BANCO DE LA REPUBLICA'))

WebUI.click(findTestObject('Recepcion/Crear Flujo/input_Cargo del Remitente (1)_cargoRemitenteA'))

WebUI.setText(findTestObject('Object Repository/Recepcion/Crear Flujo/input_Nombre del Remitente (1)_nombreRemitenteA'), 
    'Andres')

WebUI.setText(findTestObject('Object Repository/Recepcion/Crear Flujo/input_Cargo del Remitente (1)_cargoRemitenteA'), 'DIRECTOR')

WebUI.setText(findTestObject('Object Repository/Recepcion/Crear Flujo/input_Nombre del Remitente (2)_nombreRemitenteB'), 
    'DG')

WebUI.setText(findTestObject('Object Repository/Recepcion/Crear Flujo/input_Cargo del Remitente (2)_cargoRemitenteB'), 'HOLA')

WebUI.setText(findTestObject('Object Repository/Recepcion/Crear Flujo/input_Dirigido a_ms-BasePicker-input input-144_1'), 
    'Laura Vanessa García Agudelo')

WebUI.sendKeys(findTestObject('Object Repository/Recepcion/Crear Flujo/input_Dirigido a_ms-BasePicker-input input-144_1'), 
    Keys.chord(Keys.ENTER))

WebUI.setText(findTestObject('Object Repository/Recepcion/Crear Flujo/textarea_F'), 'verificar campos')

WebUI.setText(findTestObject('Object Repository/Recepcion/Crear Flujo/input_Adjuntos_adjuntos-input'), 'FACTURAS')

WebUI.delay(5)

WebUI.click(findTestObject('Recepcion/Crear Flujo/div_Guardar'))

