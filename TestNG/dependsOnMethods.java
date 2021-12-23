package TestNG;

import org.testng.annotations.Test;

public class dependsOnMethods {
	
	
	@Test(enabled = true)
	
	public void highschool() {
		System.out.println("He is Highschool pass");
	}

	
	@Test(dependsOnMethods = "highschool")
	public void highsecindaryschool() {
		System.out.println("He is Highscondary Pass");
	}
	
	
	@Test(dependsOnMethods = "highsecindaryschool")
	public void engineering() {
		System.out.println("He is engineering pass");
	}
}
