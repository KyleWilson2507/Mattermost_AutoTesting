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
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.testobject.TestObjectProperty
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

import groovy.json.JsonSlurper
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

def loginResponse = WS.sendRequest(findTestObject('Object Repository/1712666_API_Mattermost/CommonAPI/Common_LoginAPI'))	

Map parsed = loginResponse.getHeaderFields()

String tokenAPI = parsed.Token

String token = "Bearer " + tokenAPI.substring(1, tokenAPI.length() - 1)

RequestObject changeNameRequest = findTestObject('1712666_API_Mattermost/ChangeNameAPI')

def HTTPHeader = new ArrayList()

TestObjectProperty authorizationTest = new TestObjectProperty('Authorization', ConditionType.EQUALS, token);

HTTPHeader.add(authorizationTest)

changeNameRequest.setHttpHeaderProperties(HTTPHeader)

def response = WS.sendRequest(changeNameRequest)

WS.verifyElementPropertyValue(response, "first_name", "test first name");

WS.verifyElementPropertyValue(response, "last_name", "test last name");