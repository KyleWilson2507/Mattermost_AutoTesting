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

def loginResponse = WS.sendRequest(findTestObject('Object Repository/1412263_API_Mattermost/API_Login'))	

Map parsed = loginResponse.getHeaderFields()

String tokenAPI = parsed.Token

String token = "Bearer " + tokenAPI.substring(1, tokenAPI.length() - 1)

RequestObject sendMessageRequest = findTestObject('Object Repository/1412263_API_Mattermost/API_SendMessage_2')

def HTTPHeader = new ArrayList()

TestObjectProperty authorizationTest = new TestObjectProperty('Authorization', ConditionType.EQUALS, token);

HTTPHeader.add(authorizationTest)

sendMessageRequest.setHttpHeaderProperties(HTTPHeader)

def response = WS.sendRequest(sendMessageRequest)

WS.verifyElementPropertyValue(response, "channel_id", "3bba45je8pyjtp8s4cgk6iei3c");

WS.verifyElementPropertyValue(response, "message", "Coco Jambo");
