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

Mobile.startApplication('C:\\Users\\SafanYaqoob\\Katalon Studio\\25_Tcases\\androidapp\\Latest-UAT-Build.apk', true)

Mobile.tap(findTestObject('null'), 0)

Mobile.tap(findTestObject('Object Repository/userinformation-editing/android.widget.TextView - Profile'), 0)

Mobile.tap(findTestObject('Object Repository/userinformation-editing/android.widget.ImageView'), 0)

Mobile.tap(findTestObject('Object Repository/userinformation-editing/android.widget.TextView - Edit'), 0)

Mobile.tap(findTestObject('userinformation-editing/android.widget.EditText - 506757379'), 0)

Mobile.setText(findTestObject('Object Repository/userinformation-editing/android.widget.EditText - 506757379 (1)'), '5067573379', 
    0)

Mobile.tap(findTestObject('Object Repository/userinformation-editing/android.widget.EditText - jijina.ktechcarrot.ae'), 
    0)

Mobile.setText(findTestObject('Object Repository/userinformation-editing/android.widget.EditText - jijina.ktechcarrot.ae'), 
    'jijina.k@techcarrot.ae', 0)

Mobile.tap(findTestObject('Object Repository/userinformation-editing/android.widget.TextView -'), 0)

Mobile.tap(findTestObject('Object Repository/userinformation-editing/android.widget.TextView - 971'), 0)

Mobile.tap(findTestObject('null'), 0)

Mobile.tap(findTestObject('Object Repository/userinformation-editing/android.widget.Button - Confirm'), 0)

Mobile.tap(findTestObject('userinformation-editing/android.widget.TextView - (1)'), 0)

Mobile.tap(findTestObject('userinformation-editing/android.widget.TextView - Male'), 0)

Mobile.tap(findTestObject('Object Repository/userinformation-editing/android.widget.TextView - (2)'), 0)

Mobile.tap(findTestObject('Object Repository/userinformation-editing/android.view.ViewGroup'), 0)

Mobile.tap(findTestObject('Object Repository/userinformation-editing/android.widget.EditText - Enter Profession'), 0)

Mobile.setText(findTestObject('Object Repository/userinformation-editing/android.widget.EditText - Enter Profession'), 'QA', 
    0)

Mobile.hideKeyboard()

Mobile.closeApplication()

