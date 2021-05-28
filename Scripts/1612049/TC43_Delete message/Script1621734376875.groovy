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

WebUI.callTestCase(findTestCase('1612049/CommonTC/CTC_Login'), [('username') : 'jooie', ('password') : '6z6Vi2R3i06jbzaqW0pQ8Q=='], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Page_Town Square - noname Mattermost/textarea_Write to Town Square_post_textbox'), 'delete message')

WebUI.sendKeys(findTestObject('Page_Town Square - noname Mattermost/textarea_Write to Town Square_post_textbox'), Keys.chord(
		Keys.ENTER))

//WebUI.mouseOver(findTestObject('1612049/DirectMessage_Workspace/div_Message To Be Deleted'))

WebUI.click(findTestObject('Object Repository/Page_Town Square - noname Mattermost/p_a'))

//WebUI.click(findTestObject('1612049/DirectMessage_Workspace/btn_More Actions_btnMore'))

WebUI.click(findTestObject('Object Repository/1612049/DirectMessage_Workspace/btn_More Action Of Pin TC - Copy'))

//WebUI.click(findTestObject('1612049/DirectMessage_Workspace/btn_Delete Message'))

WebUI.click(findTestObject('Object Repository/1612049/DirectMessage_Workspace/btn_Delete Message - Copy'))

WebUI.click(findTestObject('Object Repository/1612049/DirectMessage_Workspace/btn_Delete Message_AreYouSure'))