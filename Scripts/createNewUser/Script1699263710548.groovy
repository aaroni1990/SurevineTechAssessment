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

//Navigates to the CMS
WebUI.callTestCase(findTestCase('Navigate to CMS'), [:], FailureHandling.STOP_ON_FAILURE)
//Logs into the CMS
WebUI.callTestCase(findTestCase('Log in to CMS'), [:], FailureHandling.STOP_ON_FAILURE)
//Navigates to the Users Tab
WebUI.click(findTestObject('Object Repository/Add_Remove_New_User/Page_Posts  Aaron Surevine Tech Challenge  _aeecaf/div_Users'))
//Selects to add new user
WebUI.click(findTestObject('Object Repository/Add_Remove_New_User/Page_Users  Aaron Surevine Tech Challenge  _260ad5/a_Add New'))
//Enters their login
WebUI.setText(findTestObject('Object Repository/Add_Remove_New_User/Page_Add New User  Aaron Surevine Tech Chal_e70777/input_(required)_user_login'), 
    'test user')
//enter their email
WebUI.setText(findTestObject('Object Repository/Add_Remove_New_User/Page_Add New User  Aaron Surevine Tech Chal_e70777/input_(required)_email'), 
    'aaroni1990.ai@gmail.com')
//enters first name
WebUI.setText(findTestObject('Object Repository/Add_Remove_New_User/Page_Add New User  Aaron Surevine Tech Chal_e70777/input_First Name_first_name'), 
    'Test')
//enter surname
WebUI.setText(findTestObject('Object Repository/Add_Remove_New_User/Page_Add New User  Aaron Surevine Tech Chal_e70777/input_Last Name_last_name'), 
    'User')
//enters password
WebUI.setText(findTestObject('Object Repository/Add_Remove_New_User/Page_Add New User  Aaron Surevine Tech Chal_e70777/input_Generate password_pass1'), 
    'TestPassword123!')
//creates the user
WebUI.click(findTestObject('Object Repository/Add_Remove_New_User/Page_Add New User  Aaron Surevine Tech Chal_e70777/input_Role_createuser'))
//selects the user
WebUI.click(findTestObject('Object Repository/Add_Remove_New_User/Page_Users  Aaron Surevine Tech Challenge  _260ad5/input_Select test user_users'))
//changes role to contributor
WebUI.selectOptionByValue(findTestObject('Object Repository/Add_Remove_New_User/Page_Users  Aaron Surevine Tech Challenge  _260ad5/select_Change role toSubscriberContributorA_bea05a'), 
    'contributor', true)
//confirms change
WebUI.click(findTestObject('Object Repository/Add_Remove_New_User/Page_Users  Aaron Surevine Tech Challenge  _260ad5/input_Change role to_changeit2'))
//verifies change has been 
WebUI.verifyElementText(findTestObject('Object Repository/Add_Remove_New_User/Page_Users  Aaron Surevine Tech Challenge  _260ad5/td_Contributor'), 
    'Contributor')
//selects user
WebUI.click(findTestObject('Object Repository/Add_Remove_New_User/Page_Users  Aaron Surevine Tech Challenge  _260ad5/input_Select test user_users'))
//changes role to editor
WebUI.selectOptionByValue(findTestObject('Object Repository/Add_Remove_New_User/Page_Users  Aaron Surevine Tech Challenge  _260ad5/select_Change role toSubscriberContributorA_bea05a'), 
    'editor', true)
//confirms change
WebUI.click(findTestObject('Object Repository/Add_Remove_New_User/Page_Users  Aaron Surevine Tech Challenge  _260ad5/input_Change role to_changeit2'))
//verifies change has been made
WebUI.verifyElementText(findTestObject('Object Repository/Add_Remove_New_User/Page_Users  Aaron Surevine Tech Challenge  _260ad5/td_Editor'), 
    'Editor')
//selects user
WebUI.click(findTestObject('Object Repository/Add_Remove_New_User/Page_Users  Aaron Surevine Tech Challenge  _260ad5/input_Select test user_users'))
//deletes users
WebUI.click(findTestObject('Object Repository/Add_Remove_New_User/Page_Users  Aaron Surevine Tech Challenge  _260ad5/a_Delete'))
//confirms deletion
WebUI.click(findTestObject('Object Repository/Add_Remove_New_User/Page_Users  Aaron Surevine Tech Challenge  _260ad5/input_ID 2 test user_submit'))
//verifies user has been deleted.
WebUI.verifyTextNotPresent('Test User', false)

