package TestNG;

import org.testng.annotations.Test;

public class GroupingExamples {
    
	@Test(groups={"apple"})
	public void apple1() {

		System.out.println("apple testing 1");

	}

	@Test(groups={"apple"})
	public void apple2() {

		System.out.println("apple testing 2");
	}


	@Test(groups={"moto"})
	public void moto1() {

		System.out.println("moto testing 1");
	}


	@Test(groups={"moto"})
	public void moto2() {

		System.out.println("moto testing 2");

	}

	@Test(groups={"viovo"})
	public void viovo1() {

		System.out.println("viovo testing 1");
	}

	@Test(groups={"viovo"})
	public void viovo2() {

		System.out.println("viovo testing 2");

	}

	@Test(groups={"lenvo"})
	public void lenvo1() {

		System.out.println("lenvo testing 1");

	}
	

	@Test(groups={"lenvo"})
	public void lenvo2() {
		System.out.println("lenvo testing 2");

	}


}
