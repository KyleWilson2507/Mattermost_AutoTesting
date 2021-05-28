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

for (i = 1; i <= 5; i += 1) {
    WebUI.click(findTestObject('Object Repository/1612049/Index_Sidebarr/Page_(1)  Town Square - noname Mattermost/span_'))

    WebUI.setText(findTestObject('1612049/DirectMessage_Workspace/Searchbox/input_Search Box_searchbox'), findTestData('1612049/Data TC35 Write a direct message').getValue(
            1, i))

    if (WebUI.verifyElementPresent(findTestObject('1612049/DirectMessage_Dialog/div_Search Username Result_searchResult'), 
        10, FailureHandling.CONTINUE_ON_FAILURE)) {
        WebUI.sendKeys(findTestObject('1612049/DirectMessage_Workspace/Searchbox/input_Search Box_searchbox'), Keys.chord(
                Keys.ENTER))

        WebUI.click(findTestObject('Object Repository/1612049/DirectMessage_Workspace/Page_(1)  abchuykhoi - noname Mattermost/button_Go'))

        if (WebUI.verifyElementPresent(findTestObject('1612049/inputarea_Direct Message_directMessage'), 5, FailureHandling.CONTINUE_ON_FAILURE)) {
            WebUI.setText(findTestObject('1612049/inputarea_Direct Message_directMessage'), 'Hello, ' + findTestData('1612049/Data TC35 Write a direct message').getValue(
                    1, i))

            WebUI.sendKeys(findTestObject('1612049/inputarea_Direct Message_directMessage'), Keys.chord(Keys.ENTER))
        }
    } else {
        WebUI.click(findTestObject('1612049/Index_Sidebarr/Page_(1)  Town Square - noname Mattermost/span__1'))
    }
    
    Thread.sleep(2000)
}

WebUI.closeBrowser()

