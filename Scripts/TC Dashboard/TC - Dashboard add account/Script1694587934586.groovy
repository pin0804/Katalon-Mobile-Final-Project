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

def randomDefinedNumber = CustomKeywords.'kw.utility.randomNumber.RandomNumberCustom'(4)

println('value random custom defined dari keyword: ' + randomDefinedNumber)

def newbalance = balance + randomDefinedNumber

println('you will add account with balance: ' + newbalance)

def randomDefinedNumber2 = CustomKeywords.'kw.utility.randomNumber.RandomNumberCustom'(3)

println('value random custom defined 2 dari keyword: ' + randomDefinedNumber2)

def newaccount = account + randomDefinedNumber2

println('you will add new account with name: ' + newaccount)

WebUI.callTestCase(findTestCase('Reusable Test/TC - Launch app from existing'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Reusable Test/TC - Re-Login'), [:], FailureHandling.STOP_ON_FAILURE)

Mobile.waitForElementPresent(findTestObject('Login Page/Dashboard/txt - Welcome to the Bank App Demo'), 0)

WebUI.callTestCase(findTestCase('Reusable Test/TC - Verify Dashboard'), [:], FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Login Page/Dashboard/btn - menu burger'), 0)

Mobile.waitForElementPresent(findTestObject('Login Page/Menu Burger/btn - Accounts'), 0)

WebUI.callTestCase(findTestCase('Reusable Test/TC - Verify Menu Burger'), [:], FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Login Page/Menu Burger/btn - Accounts'), 0)

Mobile.waitForElementPresent(findTestObject('Login Page/Account Page/txt - Accounts'), 0)

WebUI.callTestCase(findTestCase('Reusable Test/TC - Verify Account Page'), [:], FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Login Page/Account Page/btn - add acc'), 0)

Mobile.waitForElementPresent(findTestObject('Login Page/Add an Account/txt - Add an Account'), 0)

WebUI.callTestCase(findTestCase('Reusable Test/TC - Verify element add an account'), [:], FailureHandling.STOP_ON_FAILURE)

Mobile.setText(findTestObject('Login Page/Add an Account/inpt - Account Name'), newaccount, 0)

Mobile.setText(findTestObject('Login Page/Add an Account/inpt - Initial Balance (Optional)'), newbalance, 0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Login Page/Add an Account/btn - ADD'), 0)

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

Mobile.pressBack()

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

Mobile.pressBack()

