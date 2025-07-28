package com.adamsoft.jenkinsmaven;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.Assert;
public class TestAdditionFunctionality 
{
	
	
	Calculator Obj;
	int Result;
	
	@BeforeGroups("RegressionTest")
	public void InitGroup()
	{
		System.out.println("Im in Before Group");
		Obj=new Calculator();
	}
	
	@BeforeClass
	public void Init()
	{
		System.out.println("Im in Before class");
		Obj=new Calculator();
	}

	@BeforeMethod
	public void ReinitialiseResultVar()
	{
		System.out.println("I am in Before Method");
		Result=0;
	}

	@Test(priority=1)
	public void TestAdditionWithPositiveNumbers()
	{
		System.out.println("I am in 1 st TestCase");
		Result=Obj.addition(10,20);
		Assert.assertEquals(Result, 30,"Addition does not work with positive numbers");
	}

	@AfterClass
	public void Teardown()
	{
		System.out.println("I am in After Class");
		Obj=null;
	}
}
