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

WebUI.click(findTestObject('EjecutivoResponsable2/span_20191058 PRUEBA - APROBACIN EJECUTIVO _d45029'))

WebUI.click(findTestObject('EjecutivoResponsable2/a_CORRESPONDENCIA'))

WebUI.switchToWindowTitle('Control Correspondencia - 20191058')

WebUI.setText(findTestObject('EjecutivoResponsable2/div_httpstasksintergrupocomlogin_pagephpreturnmain_pagephp'), 'link portal')

WebUI.click(findTestObject('EjecutivoResponsable2/label_GESTIN ADMINISTRATIVA'))

WebUI.click(findTestObject('EjecutivoResponsable2/button_Completar tarea de aprobacin_Toggle35'))

WebUI.click(findTestObject('EjecutivoResponsable2/label_Aprobar'))

WebUI.delay(5)

WebUI.click(findTestObject('EjecutivoResponsable2/div_Guardar'))

