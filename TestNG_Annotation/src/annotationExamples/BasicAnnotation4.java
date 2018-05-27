package annotationExamples;

import org.testng.annotations.Test;

public class BasicAnnotation4 {
	int i=20, j=15,k;
  @Test
  public void add() {
	  k=i+j;
	  System.out.println("addition:"+k);
	  System.out.println("new additiona");
  }
  @Test
  public void sub() {
	  k=i-j;
	  System.out.println("subtraction:"+k);
  }
  @Test(enabled = false)
  public void mul() {
	  k=i*j;
	  System.out.println("multiply:"+k);
  }
  @Test
  public void div() {
	  k=i/j;
	  System.out.println("divide:"+k);
  }
}
