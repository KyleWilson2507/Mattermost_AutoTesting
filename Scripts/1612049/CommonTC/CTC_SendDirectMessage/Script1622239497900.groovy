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

WebUI.click(findTestObject('1612049/Left_Sidebar/Direct_Messages/btn_AddDirectMessage'))

WebUI.setText(findTestObject('1612049/Left_Sidebar/Direct_Messages/AddDirectMessage_Dialog/input_UsernameForDirectMessage'), 
    'nghi_tran')

if (WebUI.verifyElementPresent(findTestObject('1612049/Left_Sidebar/Direct_Messages/AddDirectMessage_Dialog/div_FirstSearchUsernameResult'), 
    10, FailureHandling.CONTINUE_ON_FAILURE)) {
    WebUI.sendKeys(findTestObject('1612049/Left_Sidebar/Direct_Messages/AddDirectMessage_Dialog/input_UsernameForDirectMessage'), 
        Keys.chord(Keys.ENTER))

    WebUI.click(findTestObject('1612049/Left_Sidebar/Direct_Messages/AddDirectMessage_Dialog/btn_SubmitUsernameForDirectMessage'))

    if (WebUI.verifyElementPresent(findTestObject('null'), 5, FailureHandling.CONTINUE_ON_FAILURE)) {
        WebUI.setText(findTestObject('1612049/Posts_Area/Posts_Create/input_Message'), 'Hello, nghi')

        WebUI.sendKeys(findTestObject('1612049/Posts_Area/Posts_Create/input_Message'), Keys.chord(Keys.ENTER))
    }
} else {
    WebUI.click(findTestObject('1612049/Left_Sidebar/Direct_Messages/AddDirectMessage_Dialog/btn_CloseDialog'))
}

