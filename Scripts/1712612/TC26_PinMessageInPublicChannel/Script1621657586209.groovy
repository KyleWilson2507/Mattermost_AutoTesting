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

//WebUI.click(findTestObject('Object Repository/1712612_Mattermost Object/Page_Town Square - Test 1712612 Mattermost/button_nghi_tran_CENTER_button_y84p141g8fff_63d7c5'))
//
//WebUI.click(findTestObject('Object Repository/1712612_Mattermost Object/Page_Town Square - Test 1712612 Mattermost/button_Pin to Channel'))
//
//WebUI.click(findTestObject('Page_Town Square - Test 1712612 Mattermost/div_Pinned'), FailureHandling.STOP_ON_FAILURE)
//
//WebUI.click(findTestObject('Object Repository/1712612_Mattermost Object/Page_Town Square - Test 1712612 Mattermost/button_nghi_tran_CENTER_button_y84p141g8fff_63d7c5'))
//
//WebUI.click(findTestObject('Object Repository/1712612_Mattermost Object/Page_Town Square - Test 1712612 Mattermost/button_Unpin from Channel'))

WebUI.setText(findTestObject('Page_Town Square - noname Mattermost/textarea_Write to Town Square_post_textbox'), 'pin message public channel')

WebUI.sendKeys(findTestObject('Page_Town Square - noname Mattermost/textarea_Write to Town Square_post_textbox'), Keys.chord(
		Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Page_Town Square - noname Mattermost/p_a'))

WebUI.click(findTestObject('null'))

WebUI.click(findTestObject('null'))