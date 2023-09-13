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

Mobile.verifyElementVisible(findTestObject('Login Page/Dashboard/btn - menu burger'), 0)

Mobile.verifyElementVisible(findTestObject('Login Page/Account Page/txt - Accounts'), 0)

Mobile.verifyElementVisible(findTestObject('Login Page/Login Page/btn - menu kebab'), 0)

Mobile.verifyElementVisible(findTestObject('Login Page/Login Page/btn - help'), 0)

Mobile.verifyElementVisible(findTestObject('Login Page/Account Page/txt - Select an Account to view Transactions'), 0)

Mobile.verifyElementVisible(findTestObject('Login Page/Account Page/txt - Swipe on an Account to remove or view details'), 
    0)

Mobile.verifyElementVisible(findTestObject('Login Page/Account Page/txt - Account name'), 0)

Mobile.verifyElementVisible(findTestObject('Login Page/Account Page/txt - Account balance'), 0)

Mobile.verifyElementVisible(findTestObject('Login Page/Account Page/txt - Account number'), 0)

Mobile.verifyElementVisible(findTestObject('Login Page/Account Page/list - accounts'), 0)

Mobile.verifyElementVisible(findTestObject('Login Page/Account Page/img - money logo'), 0)

Mobile.verifyElementVisible(findTestObject('Login Page/Account Page/btn - add acc'), 0)

