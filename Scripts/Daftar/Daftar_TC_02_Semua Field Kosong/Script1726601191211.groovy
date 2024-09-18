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

WebUI.openBrowser('')

WebUI.navigateToUrl(GlobalVariable.BaseURL)

WebUI.click(findTestObject('Object Repository/Page_Daftar_Sukses/input_No. Handphone_mobilePhone'))

WebUI.click(findTestObject('Object Repository/Page_Daftar_Sukses/input_Email_email'),)

WebUI.click(findTestObject('Object Repository/Page_Daftar_Sukses/input_Nama Depan_firstName'))

WebUI.click(findTestObject('Object Repository/Page_Daftar_Sukses/input_Nama Belakang_lastName'))

WebUI.click(findTestObject('Object Repository/Page_Daftar_Sukses/input_No. Handphone_mobilePhone'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Daftar_Gagal/Page_Daftar/div_Input wajib diisi'), 'Input wajib diisi')

//WebUI.verifyElementText(findTestObject('Object Repository/Page_Daftar_Gagal/Page_Daftar/div_Input wajib diisi'), 'Input wajib diisi')
//
//WebUI.verifyElementText(findTestObject('Object Repository/Page_Daftar_Gagal/Page_Daftar/div_Input wajib diisi'), 'Input wajib diisi')
//
//WebUI.verifyElementText(findTestObject('Object Repository/Page_Daftar_Gagal/Page_Daftar/div_Input wajib diisi'), 'Input wajib diisi')

//WebUI.closeBrowser()

