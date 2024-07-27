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

WebUI.click(findTestObject('Checkout/Items/button_Add to cart_backpack'))

WebUI.click(findTestObject('Checkout/Items/button_Add to cart_Bike_light'))

WebUI.click(findTestObject('Checkout/Items/button_Add to cart_Bolt_T-Shirt'))

WebUI.click(findTestObject('Checkout/Items/button_Add to cart_Fleece_jacket'))

WebUI.click(findTestObject('Checkout/Items/button_Add to cart_Onesie'))

WebUI.click(findTestObject('Checkout/Items/button_Add to cart_T-Shirt_Red'))

WebUI.click(findTestObject('Object Repository/Checkout/Success Checkout/a_1'))

WebUI.click(findTestObject('Object Repository/Checkout/Success Checkout/button_Checkout'))

WebUI.setText(findTestObject('Object Repository/Checkout/Success Checkout/input_Checkout Your Information_firstName'), 'ridho')

WebUI.setText(findTestObject('Object Repository/Checkout/Success Checkout/input_Checkout Your Information_lastName'), 'herprabowo')

WebUI.setText(findTestObject('Object Repository/Checkout/Success Checkout/input_Checkout Your Information_postalCode'), 
    '13005')

WebUI.click(findTestObject('Object Repository/Checkout/Success Checkout/input_Cancel_continue'))

WebUI.click(findTestObject('Object Repository/Checkout/Success Checkout/button_Finish'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Checkout/Success Checkout/h2_Thank you for your order'), 0)

WebUI.click(findTestObject('Object Repository/Checkout/Success Checkout/button_Back Home'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Checkout/Success Checkout/div_Swag Labs'), 0)
