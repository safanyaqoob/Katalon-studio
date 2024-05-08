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

Mobile.tap(findTestObject('Object Repository/1.login_scenario/login_android.view.View'), 0)

Mobile.tap(findTestObject('Object Repository/power_Tenis_court1/android.widget.EditText'), 0)

Mobile.setText(findTestObject('Object Repository/power_Tenis_court1/android.widget.EditText'), 'jijina.k@techcarrot.ae', 
    0)

Mobile.tap(findTestObject('Object Repository/power_Tenis_court1/android.widget.EditText (1)'), 0)

Mobile.setText(findTestObject('Object Repository/power_Tenis_court1/android.widget.EditText (1)'), 'Testing@123', 0)

Mobile.tap(findTestObject('Object Repository/power_Tenis_court1/android.view.ViewGroup (1)'), 0)

Mobile.tap(findTestObject('Object Repository/power_Tenis_court1/android.view.ViewGroup (2)'), 0)

Mobile.tap(findTestObject('Object Repository/power_Tenis_court1/android.widget.TextView - Amenity Bookings'), 0)

Mobile.tap(findTestObject('power_Tenis_court1/android.view.ViewGroup (3)'), 0)

Mobile.tap(findTestObject('power_Tenis_court1/02_8A'), 0)

Mobile.tap(findTestObject('Object Repository/power_Tenis_court1/android.widget.TextView - Proceed'), 0)

Mobile.tap(findTestObject('Object Repository/power_Tenis_court1/android.view.ViewGroup (6)'), 0)

Mobile.tap(findTestObject('Object Repository/power_Tenis_court1/android.view.ViewGroup (7)'), 0)

Mobile.tap(findTestObject('Object Repository/power_Tenis_court1/android.view.ViewGroup (8)'), 0)

Mobile.tap(findTestObject('Object Repository/power_Tenis_court1/android.widget.TextView - OK'), 0)

Mobile.closeApplication()

