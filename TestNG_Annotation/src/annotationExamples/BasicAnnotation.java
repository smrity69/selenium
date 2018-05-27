package annotationExamples;

import org.testng.annotations.Test;

public class BasicAnnotation {
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
  @Test
  public void Amu1() {
	  k=i*j;
	  System.out.println("multiply:"+k);
  }
  @Test
  public void amu1() {
	  k=i/j;
	  System.out.println("divide:"+k);
  }
}
