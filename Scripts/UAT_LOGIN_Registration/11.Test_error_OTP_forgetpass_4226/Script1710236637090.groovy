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

Mobile.tap(findTestObject('Object Repository/ERRORPOP_wrongOTP/Forget_PASS_OTP_ERROR/android.widget.EditText'), 0)

Mobile.setText(findTestObject('Object Repository/ERRORPOP_wrongOTP/Forget_PASS_OTP_ERROR/android.widget.EditText'), 'safansaff969@gmail.com', 
    0)

Mobile.tap(findTestObject('Object Repository/ERRORPOP_wrongOTP/Forget_PASS_OTP_ERROR/android.widget.TextView - Forgot Password'), 
    0)

Mobile.tap(findTestObject('Object Repository/ERRORPOP_wrongOTP/Forget_PASS_OTP_ERROR/android.widget.EditText (1)'), 0)

Mobile.setText(findTestObject('Object Repository/ERRORPOP_wrongOTP/Forget_PASS_OTP_ERROR/android.widget.EditText (1)'), 
    'safansaff969@gmail.com', 0)

Mobile.tap(findTestObject('Object Repository/ERRORPOP_wrongOTP/Forget_PASS_OTP_ERROR/android.view.ViewGroup'), 0)

Mobile.tap(findTestObject('Object Repository/ERRORPOP_wrongOTP/Forget_PASS_OTP_ERROR/android.widget.EditText (2)'), 0)

Mobile.setText(findTestObject('Object Repository/ERRORPOP_wrongOTP/Forget_PASS_OTP_ERROR/android.widget.EditText (2)'), 
    '2', 0)

Mobile.setText(findTestObject('Object Repository/ERRORPOP_wrongOTP/Forget_PASS_OTP_ERROR/android.widget.EditText (3)'), 
    '3', 0)

Mobile.setText(findTestObject('Object Repository/ERRORPOP_wrongOTP/Forget_PASS_OTP_ERROR/android.widget.EditText (4)'), 
    '9', 0)

Mobile.setText(findTestObject('Object Repository/ERRORPOP_wrongOTP/Forget_PASS_OTP_ERROR/android.widget.EditText (5)'), 
    '7', 0)

Mobile.setText(findTestObject('Object Repository/ERRORPOP_wrongOTP/Forget_PASS_OTP_ERROR/android.widget.EditText (6)'), 
    '1', 0)

Mobile.setText(findTestObject('Object Repository/ERRORPOP_wrongOTP/Forget_PASS_OTP_ERROR/android.widget.EditText (7)'), 
    '0', 0)

Mobile.tap(findTestObject('Object Repository/ERRORPOP_wrongOTP/Forget_PASS_OTP_ERROR/android.view.ViewGroup (1)'), 0)

Mobile.delay(8)

Mobile.closeApplication()

