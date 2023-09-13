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

Mobile.verifyElementVisible(findTestObject('Login Page/Login Page/txt - Bank App Demo'), 0)

Mobile.verifyElementVisible(findTestObject('Login Page/Login Page/btn - help'), 0)

Mobile.verifyElementVisible(findTestObject('Login Page/Login Page/btn - menu kebab'), 0)

//Mobile.verifyElementVisible(findTestObject('Login Page/Login Page/inpt - Username'), 0)
//Mobile.verifyElementVisible(findTestObject('Login Page/Login Page/inpt - Password'), 0)
Mobile.verifyElementVisible(findTestObject('Login Page/Login Page/CheckBox - Remember Credentials'), 0)

Mobile.verifyElementVisible(findTestObject('Login Page/Login Page/btn - LOGIN'), 0)

Mobile.verifyElementVisible(findTestObject('Login Page/Login Page/txt - Dont have a profile'), 0)

Mobile.verifyElementVisible(findTestObject('Login Page/Login Page/btn - CREATE A PROFILE'), 0)

Mobile.tap(findTestObject('Login Page/Login Page/btn - LOGIN'), 0)

Mobile.waitForElementPresent(findTestObject('Login Page/Dashboard with no acc/txt- Dashboard'), 0)

Mobile.verifyElementVisible(findTestObject('Login Page/Dashboard with no acc/txt- Dashboard'), 0)

