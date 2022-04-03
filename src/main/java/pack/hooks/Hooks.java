package pack.hooks;

import com.mypackage_3.MyClass_3;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks extends MyClass_3 {
 @Before 
   public void initialization() {
	setUp();
   }
	      //Hooks facilitates us batter tasting process and reduce to code redundancy.
  @After
	public void tearDown(){	 
	driver.quit();
	
  }

   }
