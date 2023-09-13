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

Mobile.setText(findTestObject('Login Page/Login Page/inpt - Username'), GlobalVariable.username, 0)

Mobile.setText(findTestObject('Login Page/Login Page/inpt - Password'), GlobalVariable.password, 0)

boolean isChecked = false

def maxAttempts = 3 // Maksimal 3 percobaan untuk mengecek elemen

// Melakukan loop sampai elemen terceklis atau mencapai maksimal percobaan
while (!(isChecked) && (maxAttempts > 0)) {
    // Memeriksa apakah elemen belum dicentang (unchecked)
    if (!(Mobile.verifyElementChecked(findTestObject('Login Page/Login Page/CheckBox - Remember Credentials'), 0, FailureHandling.OPTIONAL))) {
        // Jika belum dicentang, centang elemen
        Mobile.checkElement(findTestObject('Login Page/Login Page/CheckBox - Remember Credentials'), 0, FailureHandling.STOP_ON_FAILURE)

        isChecked = true // Menandai bahwa elemen telah dicentang
    }
    
    maxAttempts-- // Mengurangi jumlah maksimal percobaan
}

Mobile.tap(findTestObject('Login Page/Login Page/btn - LOGIN'), 0, FailureHandling.STOP_ON_FAILURE)

Mobile.waitForElementPresent(findTestObject('Login Page/Dashboard with no acc/txt- Dashboard'), 0)

Mobile.verifyElementVisible(findTestObject('Login Page/Dashboard with no acc/txt- Dashboard'), 0)

Mobile.closeApplication()

