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

Mobile.startApplication('C:\\Users\\SafanYaqoob\\Katalon Studio\\25_Tcases\\androidapp\\Sobha-UAT-POA 1.apk', true)

Mobile.tap(findTestObject('Object Repository/4227_change pass_error_otp/com.horcrux.svg.PathView'), 0)

Mobile.delay(2)

Mobile.tap(findTestObject('Object Repository/4227_change pass_error_otp/android.widget.TextView - Profile'), 0)

Mobile.tap(findTestObject('Object Repository/4227_change pass_error_otp/android.view.ViewGroup'), 0)

Mobile.tap(findTestObject('Object Repository/4227_change pass_error_otp/android.view.ViewGroup (1)'), 0)

Mobile.tap(findTestObject('Object Repository/4227_change pass_error_otp/android.view.ViewGroup (2)'), 0)

Mobile.closeApplication()

