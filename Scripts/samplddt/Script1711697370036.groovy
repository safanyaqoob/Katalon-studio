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

Mobile.tap(findTestObject('Object Repository/power_Tenis_court1/android.widget.EditText'), 0)

Mobile.setText(findTestObject('Object Repository/power_Tenis_court1/android.widget.EditText'), 'jijina.k@techcarrot.ae', 
    0)

Mobile.tap(findTestObject('Object Repository/power_Tenis_court1/android.widget.EditText (1)'), 0)

Mobile.setText(findTestObject('Object Repository/power_Tenis_court1/android.widget.EditText (1)'), 'Testing@123', 0)

Mobile.tap(findTestObject('Object Repository/power_Tenis_court1/android.view.ViewGroup (1)'), 0)

Mobile.tap(findTestObject('Object Repository/1.login_scenario/android.view.ViewGroup not_now'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/booking_amenity/Amenity Booking_menu'), 0)

Mobile.tap(findTestObject('Object Repository/booking_amenity/book_button'), 0)

Mobile.tap(findTestObject('power_Tenis_court1/02_9)30am'), 0)

Mobile.tap(findTestObject('Object Repository/new_bookingamenity_21/PROCEED_button'), 0)

Mobile.tap(findTestObject('Object Repository/new_bookingamenity_21/i accept_checkbox'), 0)

Mobile.tap(findTestObject('Object Repository/new_bookingamenity_21/continue button'), 0)

Mobile.tap(findTestObject('Object Repository/booking_amenity/newAmenity_booking21/toggle_saveto_calender'), 0)

Mobile.tap(findTestObject('Object Repository/new_bookingamenity_21/oK_buton'), 0)

Mobile.delay(6)

Mobile.closeApplication()

