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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.mcdonalds.com.my/')

WebUI.click(findTestObject('Object Repository/Page_McDonalds Malaysia/a_Our Food'))

WebUI.click(findTestObject('Object Repository/Page_McDonalds Malaysia  Menu/img_Breakfast_w-full lgpx-2 food-slider__it_f3e738'))

WebUI.click(findTestObject('Object Repository/Page_Sausage McMuffin  Im lovin it McDonald_8aa189/img__w-full lgpx-2 food-slider__item-image'))

WebUI.click(findTestObject('Object Repository/Page_Big Breakfast  Im lovin it McDonalds Malaysia/img__w-full lgpx-2 food-slider__item-image'))

WebUI.click(findTestObject('Object Repository/Page_Hash Browns  Im lovin it McDonalds Malaysia/a_Promotions'))

WebUI.click(findTestObject('Object Repository/Page_McDonalds Malaysia  Promotions/img_Be Rewarded this Raya with McD App Spen_f4cdd5'))

WebUI.click(findTestObject('Object Repository/Page_McDonalds Malaysia  Try the NEW Ayam T_1e3106/a_Drive-Thru'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_McDonalds Malaysia  Locate Us/select_All Johor Kedah Kelantan Kuala Lumpu_383a45'), 
    'Melaka', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_McDonalds Malaysia  Locate Us/select_All Categories 24 Hours Birthday Par_25a78b'), 
    '8', true)

WebUI.closeBrowser()

