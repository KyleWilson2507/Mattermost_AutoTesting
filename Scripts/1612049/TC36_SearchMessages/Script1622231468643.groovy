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
import java.lang.Thread as Thread

WebUI.openBrowser('')

WebUI.navigateToUrl('https://mattermostwebapp.herokuapp.com/')

WebUI.callTestCase(findTestCase('1612049/CommonTC/CTC_Login'), [('username') : 'jooie', ('password') : '6z6Vi2R3i06jbzaqW0pQ8Q=='], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('1612049/Posts_Area/Posts_Area_Header/Search_Box/btn_SearchMessageButton'))

for (index = 1; index <= 5; index++) {
    WebUI.setText(findTestObject('1612049/Posts_Area/Posts_Area_Header/Search_Box/input_SearchMessageBox'), findTestData('1612049/Data TC36 SearchMessages').getValue(
            1, index))

    WebUI.sendKeys(findTestObject('1612049/Posts_Area/Posts_Area_Header/Search_Box/input_SearchMessageBox'), Keys.chord(Keys.ENTER))

    WebUI.verifyElementPresent(findTestObject('1612049/Right_Popup/SearchResults_Popup/div_Search Results'), 5)

    WebUI.click(findTestObject('1612049/Posts_Area/Posts_Area_Header/Search_Box/btn_DeleteSearchText'))

    Thread.sleep(2000)
}

WebUI.closeBrowser()

