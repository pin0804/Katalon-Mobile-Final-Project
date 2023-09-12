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

WebUI.callTestCase(findTestCase('Reusable Test/TC - Verify Launch App'), [:], FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Login Page/btn - CREATE A PROFILE'), 0, FailureHandling.STOP_ON_FAILURE)

Mobile.waitForElementPresent(findTestObject('Register Page/txt - Create Profile'), 0, FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Reusable Test/TC - Verify Regist Page'), [:], FailureHandling.STOP_ON_FAILURE)

Mobile.setText(findTestObject('Register Page/inpt - First Name'), firstname, 0)

Mobile.setText(findTestObject('Register Page/inpt - Last Name'), lastname, 0)

Mobile.setText(findTestObject('Register Page/inpt - Country'), country, 0)

Mobile.setText(findTestObject('Register Page/inpt - Username'), GlobalVariable.username, 0)

Mobile.setText(findTestObject('Register Page/inpt - Password'), GlobalVariable.password, 0)

Mobile.setText(findTestObject('Register Page/inpt- Confirm Password'), GlobalVariable.password, 0)

if ((((!(firstname.isEmpty()) && !(lastname.isEmpty())) && !(country.isEmpty())) && !(GlobalVariable.username.isEmpty())) && 
!(GlobalVariable.password.isEmpty())) {
    // All inputs are filled, so click the "Create Profile" button
    println('All inputs are filled.' // Some inputs are not filled, perform appropriate action here
        ) // You can add other actions as needed, e.g., displaying an error message
} else {
    println('Some inputs are not filled. Cannot create a profile.')
}

Mobile.tap(findTestObject('Register Page/btn - Create Profile'), 0, FailureHandling.STOP_ON_FAILURE)

Mobile.closeApplication()

