package annotationExamples;

import org.testng.annotations.Test;

public class Registration2 {
  @Test
  public void SetUp() {
	  System.out.println("This code is for setup:");
  }
  @Test
  public void Regi() {
	  System.out.println("This code is for Regi:  jgg");
  }
  @Test
  public void togIn() {
	  System.out.println(" This code is for LogIn:       ygf");
  }
  
  @Test
  public void LogOut() {
	  System.out.println("This code is for LogOut:");
  }
}
