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

WebUI.navigateToUrl('http://mattermostwebapp.herokuapp.com/')

WebUI.setText(findTestObject('1412263_Page_Mattermost/input_All team communication in one place, _dcc84b'), 'huykhoi263')

WebUI.setEncryptedText(findTestObject('1412263_Page_Mattermost/input_All team communication in one place, _a3edc6'), 'o1rBehR+FzY2ClyWuSUtzg==')

WebUI.click(findTestObject('1412263_Page_Mattermost/button_Sign in'))

WebUI.click(findTestObject('1412263_Page_Town Square - CNC_Nhom3 Mattermost/path'))

WebUI.click(findTestObject('1412263_Page_Town Square - CNC_Nhom3 Mattermost/span_System Console'))

WebUI.click(findTestObject('1412263_Page_System Console - Mattermost/a_Password'))

WebUI.setText(findTestObject('1412263_Page_System Console - Mattermost/input_Minimum Password Length_passwordMinim_e95e98'), 
    '6')

WebUI.click(findTestObject('1412263_Page_System Console - Mattermost/button_Save'))

WebUI.closeBrowser()

