package annotationExamples;

import org.testng.annotations.Test;

public class BasicAnnotation2 {
	int i=20, j=15,k;
  @Test(priority = 1)
  public void add() {
	  k=i+j;
	  System.out.println("addition:"+k);
  }
  @Test(priority = 2)
  public void sub() {
	  k=i-j;
	  System.out.println("subtraction:"+k);
  }
  @Test(priority = 3)
  public void mul() {
	  k=i*j;
	  System.out.println("multiply:"+k);
  }
  @Test(priority = 4)
  public void div() {
	  k=i/j;
	  System.out.println("divide:"+k);
  }
}
