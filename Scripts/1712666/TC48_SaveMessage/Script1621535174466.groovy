import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.exception.StepErrorException as StepErrorException
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

WebUI.callTestCase(findTestCase('1712666/CommonTC/CTC_Login'), [('var_username') : 'phuc', ('var_password') : 'CSt51UwWECc='])

WebUI.setText(findTestObject('Page_Town Square - noname Mattermost/textarea_Write to Town Square_post_textbox'), 'save message')

WebUI.sendKeys(findTestObject('Page_Town Square - noname Mattermost/textarea_Write to Town Square_post_textbox'), Keys.chord(
        Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Page_Town Square - noname Mattermost/p_a'))

WebUI.click(findTestObject('Object Repository/Page_Town Square - noname Mattermost/button_phuc_CENTER_flagIcon_6g89c38yzffg7fh_29b705'))

String savedTag = WebUI.getText(findTestObject('Object Repository/Page_Town Square - noname Mattermost/saved_tag'))

if (savedTag != 'Saved') {
    throw new StepErrorException('Fail saved message')
}

WebUI.closeBrowser()

