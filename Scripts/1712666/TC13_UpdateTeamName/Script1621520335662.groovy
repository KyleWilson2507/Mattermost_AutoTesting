import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.exception.StepErrorException
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

WebUI.click(findTestObject('Object Repository/Page_Town Square - abc Mattermost/div_phuc (2)'))

WebUI.click(findTestObject('Object Repository/Page_Town Square - abc Mattermost/span_Team Settings'))

WebUI.click(findTestObject('Object Repository/Page_Town Square - abc Mattermost/span_Edit'))

WebUI.doubleClick(findTestObject('Object Repository/Page_Town Square - abc Mattermost/input_Team Name_teamName'))

WebUI.setText(findTestObject('Object Repository/Page_Town Square - abc Mattermost/input_Team Name_teamName'), var_teamname)

WebUI.click(findTestObject('Object Repository/Page_Town Square - abc Mattermost/span_Save'))

String newTeamName = WebUI.getText(findTestObject('Object Repository/Page_Town Square - abc1 Mattermost/div_abc1'))

//if (newTeamName != var_teamname.toString()) {
//	throw new StepErrorException('Fail updated team name')
//}

switch(newTeamName)
{
	case(var_teamname.toString()):
	break;
	default:
	throw new StepErrorException('Fail updated team name')
}

WebUI.closeBrowser()
