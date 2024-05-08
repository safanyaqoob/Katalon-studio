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

WebUI.callTestCase(findTestCase('UAT_LOGIN_Registration/1.Test_tour_screen_4214'), [:], FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/1.login_scenario/login_android.view.View'), 0)

Mobile.tap(findTestObject('Object Repository/Registration/2,Create an Account'), 0)

Mobile.tap(findTestObject('Object Repository/error_msg_unfield_/android.widget.EditText'), 0)

Mobile.setText(findTestObject('Object Repository/error_msg_unfield_/android.widget.EditText'), 'safan', 0)

Mobile.tap(findTestObject('Object Repository/error_msg_unfield_/android.widget.EditText (1)'), 0)

Mobile.setText(findTestObject('Object Repository/error_msg_unfield_/android.widget.EditText (1)'), 'yaqoob', 0)

Mobile.tap(findTestObject('Object Repository/error_msg_unfield_/android.view.ViewGroup (1)'), 0)

Mobile.tap(findTestObject('Object Repository/Registration/register_drops/DROP_DOWN_nationality'), 0)

Mobile.tap(findTestObject('Object Repository/Registration/new_registration18.03/android.widget.TextView - India'), 0)

Mobile.tap(findTestObject('Object Repository/Registration/new_registration18.03/android.widget.EditText (4)'), 0)

Mobile.setText(findTestObject('Object Repository/Registration/new_registration18.03/android.widget.EditText (4)'), 'saf557218@gmail.com', 
    0)

Mobile.tap(findTestObject('Object Repository/terms and privecy/checkbox_dropdown/countrycodefullbox-not working'), 0)

Mobile.tap(findTestObject('Object Repository/Registration/register_drops/drop_down_countrycode'), 0)

Mobile.tap(findTestObject('Object Repository/Registration/android.widget.TextView - 971'), 0)

Mobile.tap(findTestObject('Object Repository/Registration/new_registration18.03/android.widget.EditText (5)'), 0)

Mobile.setText(findTestObject('Object Repository/Registration/new_registration18.03/android.widget.EditText (5)'), '581859904', 
    0)

Mobile.tap(findTestObject('Object Repository/terms and private/not_robot_chevckbox1'), 0)

Mobile.delay(4)

Mobile.tap(findTestObject('Object Repository/terms and private/not_robot_checkbox2'), 0)

Mobile.tap(findTestObject('Object Repository/terms and private/terms_checkbox_2'), 0)

Mobile.tap(findTestObject('Object Repository/Registration/new_registration18.03/android.view.ViewGroup (4)'), 0)

Mobile.tap(findTestObject('Object Repository/ERRORPOP_wrongOTP/android.widget.EditText (1)'), 0)

Mobile.setText(findTestObject('Object Repository/ERRORPOP_wrongOTP/android.widget.EditText (1)'), '5', 0)

Mobile.setText(findTestObject('Object Repository/ERRORPOP_wrongOTP/android.widget.EditText (2)'), '6', 0)

Mobile.setText(findTestObject('Object Repository/ERRORPOP_wrongOTP/android.widget.EditText (3)'), '7', 0)

Mobile.setText(findTestObject('Object Repository/ERRORPOP_wrongOTP/android.widget.EditText (4)'), '8', 0)

Mobile.setText(findTestObject('Object Repository/ERRORPOP_wrongOTP/android.widget.EditText (5)'), '4', 0)

Mobile.setText(findTestObject('Object Repository/ERRORPOP_wrongOTP/android.widget.EditText (6)'), '5', 0)

Mobile.tap(findTestObject('Object Repository/ERRORPOP_wrongOTP/android.view.ViewGroup (4)'), 0)

Mobile.closeApplication()

