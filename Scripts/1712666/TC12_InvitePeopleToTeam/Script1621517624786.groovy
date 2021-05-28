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

WebUI.navigateToUrl('https://mattermostwebapp.herokuapp.com/')

WebUI.callTestCase(findTestCase('1712666/CommonTC/CTC_Login'), [('var_username'): 'phuc', ('var_password'): 'CSt51UwWECc='])

WebUI.click(findTestObject('Object Repository/Page_Town Square - abc Mattermost/div_phuc (1)'))

WebUI.click(findTestObject('Object Repository/Page_Town Square - abc Mattermost/span_Invite People'))

WebUI.click(findTestObject('Object Repository/Page_Town Square - abc Mattermost/div_Add members'))

WebUI.setText(findTestObject('Object Repository/Page_Town Square - abc Mattermost/input_Add members_react-select-2-input'), 
    var_username)

WebUI.click(findTestObject('Page_Town Square - abc Mattermost/div_option_0'))

WebUI.click(findTestObject('Object Repository/Page_Town Square - abc Mattermost/span_Invite Members'))

if (WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Town Square - abc Mattermost/span_Done'), 5)) {
	WebUI.click(findTestObject('Object Repository/Page_Town Square - abc Mattermost/span_Done'))
}


