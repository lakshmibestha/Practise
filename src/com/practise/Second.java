package com.practise;

public class Second extends First  {

	int bonus=10000;
	public static void main(String args[])
	{
		Second s=new Second();
		System.out.println("salary of employee:" +s.salary);
		System.out.println("bonus:" +s.bonus);
		s.read();
	}
}
