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

Mobile.verifyElementVisible(findTestObject('Login Page/Menu Burger/img - bank logo'), 0)

Mobile.verifyElementVisible(findTestObject('Login Page/Menu Burger/txt - name'), 0)

Mobile.verifyElementVisible(findTestObject('Login Page/Menu Burger/txt - username'), 0)

Mobile.verifyElementVisible(findTestObject('Login Page/Menu Burger/btn - Dashboard'), 0)

Mobile.verifyElementVisible(findTestObject('Login Page/Menu Burger/btn - Accounts'), 0)

Mobile.verifyElementVisible(findTestObject('Login Page/Menu Burger/txt - Transaction'), 0)

Mobile.verifyElementVisible(findTestObject('Login Page/Menu Burger/btn - Make a Deposit'), 0)

Mobile.verifyElementVisible(findTestObject('Login Page/Menu Burger/btn - Make a Transfer'), 0)

Mobile.verifyElementVisible(findTestObject('Login Page/Menu Burger/btn - Make a Payment'), 0)

Mobile.verifyElementVisible(findTestObject('Login Page/Menu Burger/txt - Profile'), 0)

Mobile.verifyElementVisible(findTestObject('Login Page/Menu Burger/btn - Settings'), 0)

Mobile.verifyElementVisible(findTestObject('Login Page/Menu Burger/btn - Logout'), 0)

