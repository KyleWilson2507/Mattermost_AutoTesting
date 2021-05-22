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

for (def rowNum = 1; rowNum <= findTestData('Data Files/1712612/Data TC17 CreatePublicChannels').getRowNumbers(); rowNum++) {
	
	WebUI.click(findTestObject('Object Repository/1712612_Mattermost Object/Page_Town Square - Test 1712612 Mattermost/span_Create a private channel'))
	
	WebUI.verifyElementChecked(findTestObject('Object Repository/1712612_Mattermost Object/Page_Town Square - Test 1712612 Mattermost/input_Type Private'))
	
	String newChannelName = findTestData('Data Files/1712612/Data TC17 CreatePublicChannels').getValue(1, rowNum)

    WebUI.setText(findTestObject('Object Repository/1712612_Mattermost Object/Page_Town Square - Test 1712612 Mattermost/input_Name_newChannelName'), 
        newChannelName)
	
	WebUI.click(findTestObject('Object Repository/1712612_Mattermost Object/Page_Town Square - Test 1712612 Mattermost/button_Create Channel'))

	
	if (newChannelName.length() < 2) {
		'Failed to create a team with name too short'
		WebUI.verifyTextPresent('Display name must have at least 2 characters.', false, FailureHandling.STOP_ON_FAILURE)
	} else {
		if (WebUI.verifyElementPresent(findTestObject('Object Repository/1712612_Mattermost Object/Page_Town Square - Test 1712612 Mattermost/button_Create Channel_1'),
			0, FailureHandling.OPTIONAL)) {
			'Create new team with non-latin name'
		} else if (WebUI.verifyTextPresent('A channel with that name already exists on the same team', false, FailureHandling.STOP_ON_FAILURE))
			{
				'Failed to create a team with Name has already existed'
			} else {
					'Successful create a new team with'
					WebUI.verifyElementNotPresent(findTestObject('Object Repository/1712612_Mattermost Object/Page_Town Square - Test 1712612 Mattermost/button_Create Channel'),
						0, FailureHandling.OPTIONAL)
				
			}
		
	}
    
    WebUI.refresh()
}

WebUI.closeBrowser()

