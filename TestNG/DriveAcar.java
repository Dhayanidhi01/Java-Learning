package TestNG;

import org.testng.annotations.Test;

public class DriveAcar {

	@Test(priority = 0)
	public void starAcar() {

		System.out.println("First start a car");
	}
	@Test(priority = 1)
	public void firstgear() {

		System.out.println("First Gear");
	}
	@Test(priority = 2)
	public void secondgear() {

		System.out.println("Second Gear");
	}
	@Test(priority = 3)
	public void thirdgear() {

		System.out.println("Third Gear");
	}
	@Test(priority = 4)
	public void fourthgear() {

		System.out.println("Fourth Gear");
	}
}
