package Demo;
import org.testng.SkipException;
import org.testng.annotations.Test;

public class Newtest2 {
  @Test(priority=1)
  public void reg() {
	  throw new SkipException("not completed");
	 // System.out.println("reg test script");
  }
  @Test(priority=1)
  public void login() {
	  System.out.println("login test script");
  }
  @Test(priority=2)
  public void home() {
	  System.out.println("home test script");
  }
  @Test(priority=4)
  public void logout() {
	  System.out.println("logout test script");
  }
  
}
