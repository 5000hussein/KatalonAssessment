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

Mobile.tap(findTestObject('PO/homePage/CountryDropdwon'), 0)

Mobile.tap(findTestObject('PO/homePage/AndorraOption'), 0)

Mobile.verifyElementVisible(findTestObject('PO/homePage/AndorraOptionSelected'), 0)

Mobile.sendKeys(findTestObject('PO/homePage/EnterNameField'), FullName)

Mobile.tap(findTestObject('PO/homePage/RadioButton - Male'), 0)

Mobile.verifyElementChecked(findTestObject('PO/homePage/RadioButton - Male - Checked'), 0)

Mobile.tap(findTestObject('Object Repository/PO/homePage/LetsShopButton'), 0)

Mobile.verifyElementAttributeValue(findTestObject('Object Repository/PO/productsListPage/AirJordan4RetroPLP'), 'text', 'Air Jordan 4 Retro', 
    0)

Mobile.tap(findTestObject('Object Repository/PO/productsListPage/AddToCartAirJor4'), 0)

Mobile.tap(findTestObject('Object Repository/PO/productsListPage/ViewCartButton'), 0)

Mobile.verifyElementAttributeValue(findTestObject('Object Repository/PO/cartPage/AirJordan4RetroCart'), 'text', 'Air Jordan 4 Retro', 
    0)

