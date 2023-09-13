package kw.utility

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import org.apache.commons.lang.RandomStringUtils

import java.text.SimpleDateFormat
import java.util.Date

import internal.GlobalVariable

public class randomNumber {

	/*
	 * Generate random number with exact 5 char
	 * */
	@Keyword
	def RandomNumber5() {
		org.apache.commons.lang.RandomStringUtils.randomNumeric(5)
	}

	/*
	 * Generate random number with custom char
	 * */
	@Keyword
	def RandomNumberCustom(int number) {
		org.apache.commons.lang.RandomStringUtils.randomNumeric(number)
	}

	/*
	 * Generate random number with CURRENT YEAR-MONTH-DAY_HOUR-MINUTE-SECOND
	 * expected: yyyy-MM-dd_HH-mm-ss
	 * */
	@Keyword
	def RandomNumberCurrentTimeWithSeparator() {
		//define formatting
		def format = new SimpleDateFormat("yyyy-MM-dd_HH-mm-ss")
		//get current date and time
		def currentDate = new Date()
		//Format the date and time
		def randomWithCurrentTime = format.format(currentDate)

	}
}
