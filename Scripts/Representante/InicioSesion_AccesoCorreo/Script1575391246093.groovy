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

WebUI.navigateToUrl('https://login.microsoftonline.com/common/oauth2/authorize?client_id=00000002-0000-0ff1-ce00-000000000000&redirect_uri=https%3a%2f%2foutlook.office365.com%2fowa%2f&resource=00000002-0000-0ff1-ce00-000000000000&response_mode=form_post&response_type=code+id_token&scope=openid&msafed=0&client-request-id=90e6bfa9-e6ec-46ab-82c3-1c848ab25309&protectedtoken=true&nonce=637105585405285449.f41578f0-f800-4006-b334-7ecc8f885085&state=DcsxEoAwCAVRouNxMD8GAh5HM9Jaen0p9nVbiGjNlqwgIRvdGlRdBXqkcu4hTc0DHA6wAIPv3oXtmdPDXeFa8t3q-131Bw')

WebUI.setText(findTestObject('Object Repository/Representante/input_to continue to Outlook_loginfmt'), 'Lgarciaa@intergrupo.com')

WebUI.click(findTestObject('Object Repository/Representante/input_to continue to Outlook_idSIButton9'))

WebUI.setEncryptedText(findTestObject('Object Repository/Representante/input_Enter password_passwd'), 'YnyZeNHKKv151x7zcIrwww==')

WebUI.click(findTestObject('Object Repository/Representante/input_to continue to Outlook_idSIButton9'))

WebUI.click(findTestObject('Object Repository/Representante/input_concat(Don  t show this again)_idBtn_Back'))

WebUI.maximizeWindow(FailureHandling.STOP_ON_FAILURE)

