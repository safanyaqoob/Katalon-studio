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

Mobile.tap(findTestObject('Object Repository/Registration/register_drops/DROP_DOWN_nationality'), 0)

Mobile.delay(4)

Mobile.tap(findTestObject('Object Repository/Registration/register_drops/DROP_DOWN_nationality'), 0)

Mobile.tap(findTestObject('Object Repository/DDT_registration_multi_user/android.widget.EditText - Search'), 0)

Mobile.setText(findTestObject('Object Repository/DDT_registration_multi_user/android.widget.EditText - Search'), 'Emirati', 
    0)

Mobile.tap(findTestObject('Object Repository/gmail_otp_/android.widget.TextView - first_tap_Emirati'), 0)

Mobile.tap(findTestObject('Object Repository/Registration/new_registration18.03/android.widget.TextView -second_tap_Emirati'), 
    0)

Mobile.tap(findTestObject('Object Repository/DDT_registration_multi_user/android.widget.EditText (3)'), 0)

Mobile.setText(findTestObject('Object Repository/Registration/new_registration18.03/android.widget.EditText (4)'), 'safanyaqoob81@gmail.com', 
    0)

Mobile.tap(findTestObject('Object Repository/simple/code_country_fullbox'), 0)

Mobile.delay(4)

Mobile.tap(findTestObject('Object Repository/simple/code_country_fullbox'), 0)

Mobile.tap(findTestObject('Object Repository/DDT_registration_multi_user/android.widget.EditText - Search'), 0)

Mobile.setText(findTestObject('Object Repository/DDT_registration_multi_user/android.widget.EditText - Search'), '+971', 
    0)

Mobile.tap(findTestObject('Object Repository/gmail_otp_/android.view.View_first_971'), 0)

Mobile.tap(findTestObject('Object Repository/gmail_otp_/android.view.ViewGrop_second_tap_971'), 0)

Mobile.tap(findTestObject('Object Repository/DDT_registration_multi_user/android.widget.EditText (4)'), 0)

Mobile.setText(findTestObject('Object Repository/DDT_registration_multi_user/android.widget.EditText (4)'), '581859904', 
    0)

Mobile.hideKeyboard()

Mobile.scrollToText('i am not a robot')

Mobile.tap(findTestObject('Object Repository/terms and privecy/checkbox_dropdown/scrolling_to text/android.view.ViewGroup (1)'), 
    0)

Mobile.delay(3)

Mobile.tap(findTestObject('Object Repository/terms and private/terms_1'), 0)

Mobile.tap(findTestObject('Object Repository/terms and private/sign_up_main'), 0)

Mobile.tap(findTestObject('Object Repository/ERRORPOP_wrongOTP/android.widget.EditText (1)'), 0)

Mobile.setText(findTestObject('Object Repository/ERRORPOP_wrongOTP/android.widget.EditText (1)'), '3', 0)

Mobile.setText(findTestObject('Object Repository/ERRORPOP_wrongOTP/android.widget.EditText (2)'), '9', 0)

Mobile.setText(findTestObject('Object Repository/ERRORPOP_wrongOTP/android.widget.EditText (3)'), '1', 0)

Mobile.setText(findTestObject('Object Repository/ERRORPOP_wrongOTP/android.widget.EditText (4)'), '6', 0)

Mobile.setText(findTestObject('Object Repository/ERRORPOP_wrongOTP/android.widget.EditText (5)'), '0', 0)

Mobile.setText(findTestObject('Object Repository/ERRORPOP_wrongOTP/android.widget.EditText (6)'), '4', 0)

Mobile.delay(5)

Mobile.closeApplication()

