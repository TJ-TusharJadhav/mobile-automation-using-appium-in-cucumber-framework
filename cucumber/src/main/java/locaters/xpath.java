package locaters;
import Testbase.Testbase;
public class xpath extends Testbase{
    //login page
	public  String login_Email="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.widget.ImageView[2]";
	public  String login_password ="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.widget.EditText";
	public String login_button= "//android.widget.Button[@content-desc=\"LOGIN\"]";
	//Dashboard & main menu 
	public String teammember = "//android.widget.ImageView[@content-desc=\"Team members\"]";
	public String workschedule ="//android.widget.ImageView[@content-desc=\"Work schedules\"]";
	public String projects= "//android.widget.ImageView[@content-desc=\"Projects\"]";
	public String mytimesheet= "//android.widget.ImageView[@content-desc=\"My timesheet\"]";
	public String approvals= "//android.widget.ImageView[@content-desc=\"Approvals\"]";
	public String payrolls= "//android.widget.ImageView[@content-desc=\"Payrolls\"]";
	public String leavemanagment= "//android.widget.ImageView[@content-desc=\"Leave management\"]";
	public String payrollmanagment= "//android.widget.ImageView[@content-desc=\"Payroll management\"]";
	public String organizationsetting= "//android.widget.ImageView[@content-desc=\"Organization settings\"]";
	public String mydetails= "//android.widget.ImageView[@content-desc=\"My details\"]";
	public String reimbursement= "//android.widget.ImageView[@content-desc=\"Reimbursement\"]";
	public String payslips= "//android.widget.ImageView[@content-desc=\"Payslips\"]";
	public String reports= "//android.widget.ImageView[@content-desc=\"Reports\"]";
	public String main_support="//android.widget.ImageView[@content-desc=\"Support\"]";
	public String logout="//android.widget.ImageView[@content-desc=\"Log Out\"]";
	
	
	//Team member > Add team member form
	public String add_team_member_button = "//android.widget.Button[@content-desc=\"ADD TEAM MEMBER\"]";
	public String firstname = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.view.View[2]/android.widget.EditText[1]";
	public String lastname = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.view.View[2]/android.widget.EditText[2]";
	public String email = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.view.View[2]/android.widget.EditText[3]";
	public String phone = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.view.View[2]/android.widget.EditText[4]";
	public String address = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.view.View/android.widget.EditText[3]";
	public String country = "//android.view.View[@content-desc=\"Country\"]";
	public String searchbar_in_country = "//android.view.View[@content-desc=\"Country\"]/android.widget.EditText";
	public String selected_country = "//android.view.View[@content-desc=\"India\"]";
	public String state = "//android.view.View[@content-desc=\"State\"]";
	public String searchbar_in_state = "//android.view.View[@content-desc=\"State\"]/android.widget.EditText";
	public String selected_state = "//android.view.View[@content-desc=\"Maharashtra\"]";
	public String city = "//android.view.View[@content-desc=\"City\"]";
	public String searchbar_in_city = "//android.view.View[@content-desc=\"City\"]/android.widget.EditText";
	public String selected_city = "//android.view.View[@content-desc=\"Nashik\"]";
	public String pincode = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.view.View/android.widget.EditText[2]" ;
	public String timezone = "//android.view.View[@content-desc=\"Timezone\n"
			+ "America/New_York\"]";
	public String selected_timezone ="//android.view.View[@content-desc=\"Asia/Kolkata\"]";
	public String joining_date = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.view.View/android.widget.EditText[2]";
	public String reporter = "//android.widget.ImageView[@content-desc=\"Tushar Jadhav\"]";
	public String selected_reporter = "//android.view.View[@content-desc=\"salman khan\"]";
	public String add_team_member_meassge= "//android.view.View[@content-desc=\"Tushar Jadhav has been successfully added.\"]";
	
	//Team member > role assignment 
	public String more_button_1="(//android.view.View[@content-desc=\"More\"])[1]";
	public String more_button_2="(//android.view.View[@content-desc=\"More\"])[1]";
	public String more_button_3="(//android.view.View[@content-desc=\"More\"])[1]";
	public String more_button_4="//android.view.View[@content-desc=\"More\"]";
	public String company_admin="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.widget.CheckBox[1]" ;
	public String maneger=      "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.widget.CheckBox[2]";
	public String HR=           "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.widget.CheckBox[3]" ;
	public String Employee=     "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.widget.CheckBox[4]" ;
	
	//bank details
	public String account_holder_name= "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.widget.EditText[1]";
	public String account_number= "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.widget.EditText[2]";
	public String IFSC_code = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.widget.EditText[3]";
	public String account_type_current_account= "//android.view.View[@content-desc=\"Current account\"]/android.widget.RadioButton";
	public String account_type_saving_account= "//android.view.View[@content-desc=\"Savings account\"]/android.widget.RadioButton";
	//payroll rate
	public String basic_pay = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.widget.EditText";
	public String yearly ="//android.widget.ImageView[@content-desc=\"Yearly\"]";
	public String monthly = "//android.view.View[@content-desc=\"Monthly\"]";
	
	//compensation overview
	public String next_button = "//android.widget.Button[@content-desc=\"NEXT\"]";
	
	//Tax configuration > professional tax
	public String check_box="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.widget.CheckBox";
	public String select_first_address="//android.widget.RadioButton[@content-desc=\"1, Nashik, Maharashtra, India, 123654\"]";
	public String employee_compensation_rate="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.widget.EditText";
	
	//Tax configuration > PF(Provident fund)
	public String PF_preference="//android.widget.ImageView[@content-desc=\"PF preference\"]";
	public String opted_in="//android.view.View[@content-desc=\"Opted in\"]";
	public String opted_out="//android.view.View[@content-desc=\"Opted out\"]";
	public String PF_UAN="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.widget.EditText";
	public String appplicable_salary="//android.widget.RadioButton[@content-desc=\"12% of Applicable Salary\"]";
	public String minimum_contribution_required="//android.widget.RadioButton[@content-desc=\"Minimum contribution required\"]";
	public String cap_to="//android.widget.RadioButton[@content-desc=\"Cap to ₹15,000\"]";
	public String match_employee_contribution="";
	
	//ESIC
	public String select_checkbox= "hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.widget.CheckBox";
	public String enter_ESI_no="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.widget.EditText[1]";
	
	//past payroll in financial year
	public String previous_employer_salary="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.widget.EditText[1]";
	public String previous_employer_TDS_deducted="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.widget.EditText[2]";
	//Assign leave
	public String backbutton_on_assign_leave="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.Button[1]";
	
	
	
	//work schedule 
	
	public String add_workschedule= "//android.widget.Button[@content-desc=\"ADD WORK SCHEDULE\"]";
	public String workschedule_name="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.widget.EditText";
	public String start_date="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.widget.ImageView[1]";
	public String hours="//android.widget.ImageView[@content-desc=\"0m\n"
			+ "8h\"]";
	public String select_hours="//android.view.View[@content-desc=\"5h\"]";
	public String min="//android.widget.ImageView[@content-desc=\"0m\"]";
	public String select_min="//android.view.View[@content-desc=\"30m\"]";
	
	public String sun="//android.view.View[@content-desc=\"Sun\"]";
	public String mon="//android.view.View[@content-desc=\"Mon\"]";
	public String tue="//android.view.View[@content-desc=\"Tue\"]";
	public String wed="//android.view.View[@content-desc=\"Wed\"]";
	public String thu="//android.view.View[@content-desc=\"Thu\"]";
	public String fri="//android.view.View[@content-desc=\"Fri\"]";
	public String sat="//android.view.View[@content-desc=\"Sat\"]";
	
	public String add="//android.widget.Button[@content-desc=\"ADD\"]";
	public String holiday_name="//android.view.View[@content-desc=\"Add holiday\"]/android.widget.EditText";
	public String empty_workschedule_name="//android.view.View[@content-desc=\"Name can't be empty\"]";
	public String empty_workschedule_start_date="//android.view.View[@content-desc=\"Effective start date can't be empty\"]";
	public String empty_holiday_name="//android.view.View[@content-desc=\"Name can't be empty\"]";
	
	//projects
	public String addproject="//android.widget.Button[@content-desc=\"ADD PROJECT\"]";
	public String project_name="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.widget.EditText[1]";
	public String project_description="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.widget.EditText[2]";
	public String empty_project_name="//android.view.View[@content-desc=\"Project name is empty!\"]";
	
	//task
	public String select_project="//android.view.View[@content-desc=\"project 1\"]/android.widget.ImageView[2]";
	public String addtask="//android.widget.Button[@content-desc=\"ADD TASK\"]";
	public String task_name="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.widget.EditText[1]";
	public String task_description="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.widget.EditText[2]";
	public String empty_task_name="//android.view.View[@content-desc=\"Task name is empty!\"]";
	
	//timeline
	public String select_task="(//android.view.View[@content-desc=\"Task 1\"])[1]/android.widget.ImageView[2]";
	public String add_button="//android.widget.ImageView[@content-desc=\"ADD\"]";
	
	//my Timesheet
	public String monthly_filter= "//android.widget.Button[@content-desc=\"Monthly\"]";
	public String weekly_filter= "//android.widget.Button[@content-desc=\"Weekly\"]";
	public String daily_filter= "//android.widget.Button[@content-desc=\"Daily\"]";
	public String card_wish= "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.view.View[4]/android.widget.ImageView[1]";
	public String date_wish= "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.view.View[4]/android.widget.ImageView[2]";
	public String validat_project_wish="";
	public String validat_date_wish="";
	
//	public String jan="//android.view.View[@content-desc=\"1, Monday, January 1, 2024\"]";
//	public String feb="//android.view.View[@content-desc=\"2, Thursday, February 1, 2024\"]";
//	public String mar="//android.view.View[@content-desc=\"3, Friday, March 1, 2024\"]";
//	public String apr="//android.view.View[@content-desc=\"4, Monday, April 1, 2024\"]";
//	public String may="//android.view.View[@content-desc=\"5, Wednesday, May 1, 2024\"]";
//	public String jun="//android.view.View[@content-desc=\"6, Saturday, June 1, 2024\"]";
//	public String jul="//android.view.View[@content-desc=\"7, Monday, July 1, 2024\"]";
//	public String aug="//android.view.View[@content-desc=\"8, Thursday, August 1, 2024\"]";
//	public String sep="//android.view.View[@content-desc=\"9, Sunday, September 1, 2024\"]";
//	public String oct="//android.view.View[@content-desc=\"10, Tuesday, October 1, 2024\"]";
//	public String nov="//android.view.View[@content-desc=\"11, Friday, November 1, 2024\"]";
//	public String dec="//android.view.View[@content-desc=\"12, Sunday, December 1, 2024\"]";
	
	//approvals
	//payrolls
	//leave managment
	public String leavetypes="//android.view.View[@content-desc=\"Leave types\"]";
	public String add_leave_type="//android.widget.Button[@content-desc=\"ADD LEAVE TYPE\"]";
	public String leave_type_name="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.widget.EditText[1]";
	public String leave_type_description="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.widget.EditText[2]";
	public String balance_track="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.widget.CheckBox";
	public String empty_leave_type="//android.view.View[@content-desc=\"Name can't be empty\"]";
	
	//payroll managment
	//organization setting
	//my details
	//reimbursement
	//pay slips
	//reports
	//support
	//log out
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


		

	

	
	
}
