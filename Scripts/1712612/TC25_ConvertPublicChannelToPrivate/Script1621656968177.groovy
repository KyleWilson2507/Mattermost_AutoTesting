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

WebUI.callTestCase(findTestCase('1712612/CommonTC/TC_OpenPage'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('1712612/CommonTC/TC_Login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.navigateToUrl('https://mattermostwebapp.herokuapp.com/test-1712612/channels/town-square')

WebUI.click(findTestObject('Object Repository/1712612_Mattermost Object/Page_Town Square - Test 1712612 Mattermost/a_new channel'))

WebUI.click(findTestObject('Object Repository/1712612_Mattermost Object/Page_new channel - Test 1712612 Mattermost/button_new channel'))

WebUI.click(findTestObject('Object Repository/1712612_Mattermost Object/Page_new channel - Test 1712612 Mattermost/button_Convert to Private Channel'))

WebUI.click(findTestObject('Object Repository/1712612_Mattermost Object/Page_new channel - Test 1712612 Mattermost/button_Yes, convert to private channel'))

WebUI.click(findTestObject('Object Repository/1712612_Mattermost Object/Page_new channel - Test 1712612 Mattermost/button_new channel'))

WebUI.click(findTestObject('Object Repository/1712612_Mattermost Object/Page_new channel - Test 1712612 Mattermost/button_View Info'))

WebUI.verifyElementVisible(findTestObject('Object Repository/1712612_Mattermost Object/Page_new channel - Test 1712612 Mattermost/svg'))

