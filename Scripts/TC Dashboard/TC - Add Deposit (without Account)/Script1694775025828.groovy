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

WebUI.callTestCase(findTestCase('Reusable Test/TC - Launch app from existing'), [:], FailureHandling.STOP_ON_FAILURE)

Mobile.waitForElementPresent(findTestObject('Login Page/Login Page/btn - LOGIN'), 0)

WebUI.callTestCase(findTestCase('Reusable Test/TC - Re-Login'), [:], FailureHandling.STOP_ON_FAILURE)

Mobile.waitForElementPresent(findTestObject('Login Page/Dashboard/btn - menu burger'), 0)

Mobile.tap(findTestObject('Login Page/Dashboard/btn - menu burger'), 0)

Mobile.waitForElementPresent(findTestObject('Login Page/Menu Burger/btn - Make a Deposit'), 0)

WebUI.callTestCase(findTestCase('Reusable Test/TC - Verify Menu Burger'), [:], FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Login Page/Menu Burger/btn - Make a Deposit'), 0)

Mobile.waitForElementPresent(findTestObject('Login Page/Add Deposit Page/error state/txt - Deposit Error'), 0)

def errorstate = Mobile.getText(findTestObject('Login Page/Add Deposit Page/error state/txt - Deposit Error'), 0)

println('state :' + errorstate)

Mobile.verifyElementVisible(findTestObject('Login Page/Add Deposit Page/error state/txt - message invalid'), 0)

def errormessage = Mobile.getText(findTestObject('Login Page/Add Deposit Page/error state/txt - message invalid'), 0)

println('error message: ' + errormessage)

Mobile.verifyElementVisible(findTestObject('Login Page/Add Deposit Page/error state/btn - CANCEL'), 0)

Mobile.verifyElementVisible(findTestObject('Login Page/Add Deposit Page/error state/btn - ADD ACCOUNT'), 0)

Mobile.tap(findTestObject('Login Page/Add Deposit Page/error state/btn - CANCEL'), 0)

Mobile.closeApplication()

