package com.practice;

import java.lang.reflect.Method;

class Student
{
	public String getName()
	{
		return null;
	}
	public int getRoll()
	{
		return 10;
	}
	}

class DemoForName {

	public static void main(String[] args) throws Exception 
	{ 
	 int count=0;
	 Class c= Class.forName("com.practice.Student");
	 Method[] m=c.getDeclaredMethods();
	 for(Method m1:m)
	 {
		 count++;
		 System.out.println(m1.getName());
	 }
	System.out.println("Number of Methods :"+count);
	}
}
