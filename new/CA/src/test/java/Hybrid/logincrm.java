package Hybrid;

import org.testng.annotations.Test;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class logincrm extends Baseclass {

	@Test(priority=1)
	public void loginApp() throws InterruptedException
	
	{   
		log.info("Testcase-1 execution start");
		logger =report.createTest("login app");
		Loginpage lopin= PageFactory.initElements(driver,Loginpage.class);
		logger.info("stating Apllication");
		 lopin.LoginToCrm();
		 log.info("Successfully Login");
		   logger.pass("login page");
		   log.info("Testcase-1 is successfully executed");
    }
	
  @Test(priority=2)
   public void signupapp() throws InterruptedException
	
	{   
	  log.info("Testcase-2 execution start");
	  logger=report.createTest("signup");
	  pagesignin lopi= PageFactory.initElements(driver,pagesignin.class);
		 lopi.signmanu("suhas.rcr1989@gmail.com","Suhas123@#$");
		 log.info("Successfully Signup");
		 logger.pass("login done");
		  log.info("Testcase-2 is successfully executed");
		             
    }
  
	@Test(priority=3)
	 public void searchupapp() throws InterruptedException
		
		{    
		log.info("Testcase-3 execution start");
		Reporter.log("Bedsheet Done", true);

		 logger=report.createTest("serachbox");

		 Searrchpage lopi4= PageFactory.initElements(driver,Searrchpage.class);
			 lopi4.searcho("bedsheets");
			 log.info("Successfully Searchup");
			 logger.pass("searching done");
			 log.info("Testcase-3 is successfully executed");
			            
	    }
	
	@Test(priority=4)
	 public void Bedapp() throws InterruptedException
		
	 {   
		log.info("Testcase-4 execution start");
		Reporter.log("searching Done", true);

		logger=report.createTest("bedapp");

		Bedrooms lopi5= PageFactory.initElements(driver,Bedrooms.class);
		logger.info("searching for bed");
			 lopi5.LoginBed();
			 log.info("Successfully Bedapp");
			 logger.pass("searching done");
			 log.info("Testcase-4 is successfully executed");
			 			         
	    }
	
	@Test(priority=5)
	 public void Bedappcart() throws InterruptedException
		
	 { 	
		log.info("Testcase-5 execution start");
		Reporter.log("bedapp Done", true);
		logger=report.createTest("booking");
		     BookingPage lopi6= PageFactory.initElements(driver,BookingPage.class);
			 lopi6.bedlogin();
			 log.info("Successfully Bedappcart");
			 logger.pass("booking done");
			 log.info("Testcase-5 is successfully executed");

	    }

    @Test(priority=6)
	 public void assertions() throws InterruptedException
		
		{   
    	log.info("Testcase-6 execution start");
    	Reporter.log("assertions Done", true);
    	     logger=report.createTest("assertion");
		     Asserttest lopi7= PageFactory.initElements(driver,Asserttest.class);
		     logger.info("comparison");
			 lopi7.assersearcho();
			 log.info("Successfully Assertions ");
			 logger.pass("comparison done");
			 log.info("Testcase-6 is successfully executed");
			
	    }
    
	 @Test(priority=7)
	 public void tvappcart() throws InterruptedException
		
		{  
		 log.info("Testcase-7 execution start");
		 logger=report.createTest("livingroom");
		     Livingroom lopi8= PageFactory.initElements(driver,Livingroom.class);
			 lopi8.tvpageoo();
			 log.info("Successfully Tvappcart");
			 logger.pass("searching for TV is pass");
			 log.info("Testcase-7 is successfully executed");
			     
	    }

	 @Test(priority=8)
	 public void studyapp() throws InterruptedException
		
		{ 
		 log.info("Testcase-8 execution start");
		 logger=report.createTest("studypage");
		     studypage lopi9= PageFactory.initElements(driver,studypage.class);
			 lopi9.studypageo();
			 log.info("Successfully Studyapp");
			 logger.pass("searching done for studytable");
			 log.info("Testcase-8 is successfully executed");
     
	    }
	 
	 @Test(priority=9)
	 public void aboutapp() throws InterruptedException
		
		{ 
		 log.info("Testcase-9 execution start");
		 logger=report.createTest("aboutpage");
		     aboutpage lopia= PageFactory.initElements(driver,aboutpage.class);
			 lopia.aboutu();
			 log.info("Successfully Aboutapp");
			 logger.pass("done with aboutpage");
			 log.info("Testcase-9 is successfully executed");
  
	    }
	 
	 @Test(priority=10)
	 public void infoapp()
		
		{ 
		 log.info("Testcase-10 execution start");
		 logger=report.createTest("moreinfo");

		      Moreinfo lopioo= PageFactory.initElements(driver,Moreinfo.class);
		      logger.info("getall the text");
			 lopioo.moruee();
			 log.info("Successfully Infoapp");
			 logger.pass("done and back to eclipse");
			 log.info("Testcase-10 is successfully executed");
			 
	    }

}
