package annotationExamples;

import org.testng.annotations.Test;

public class Registration {
  @Test(groups="use")
  public void SetUp() {
	  System.out.println("This code is for setup:");
  }
  @Test(groups="use")
  public void Regi() {
	  System.out.println("This code is for Regi:");
  }
  @Test(groups="dontuse")
  public void LogIn() {
	  System.out.println("This code is for LogIn:");
  }
  
  @Test(groups="dontuse")
  public void LogOut() {
	  System.out.println("This code is for LogOut:");
  }
}
