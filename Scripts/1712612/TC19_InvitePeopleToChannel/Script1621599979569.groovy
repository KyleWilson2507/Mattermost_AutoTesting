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

WebUI.click(findTestObject('1612049/Left_Sidebar/Public_Channels/btn_AddPublicChannel'))

WebUI.setText(findTestObject('1612049/Left_Sidebar/Public_Channels/NewPublicChannel_Dialog/input_NewPublicChannelName'), 
    'InvitingChannel')

WebUI.click(findTestObject('1612049/Left_Sidebar/Public_Channels/NewPublicChannel_Dialog/btn_SubmitNewPublicChannel'))

for (i = 1; i <= 3; i += 1) {
    WebUI.click(findTestObject('Object Repository/1712612_Mattermost Object/Page_Invite people to channel - Test 171261_c46106/button_Invite others to this channel'))

    WebUI.setText(findTestObject('1712612_Mattermost Object/Page_Invite people to channel - Test 171261_c46106/input_SearchUser'), 
        findTestData('1712612/Data TC19 InviteMemberToChannel').getValue(1, i))

    WebUI.sendKeys(findTestObject('1712612_Mattermost Object/Page_Invite people to channel - Test 171261_c46106/input_SearchUser'), 
        Keys.chord(Keys.ENTER))

    WebUI.click(findTestObject('1712612_Mattermost Object/Page_Invite people to channel - Test 171261_c46106/button_Add'))

    Thread.sleep(2000)
}

WebUI.closeBrowser()

