package com.practise;

public class Employee  {

	int id;
	String name;
	Address address;

	public Employee(int id, String name, Address address) {
	
		this.id = id;
		this.name = name;
		this.address = address;
	}
void display()
{
	System.out.println(id+ ""+name);
	System.out.println(address.city+ "" +address.state+ "" +address.country);
}
public static void main(String args[])
{
Address address1= new Address("atp","AP","INDIA");
 Employee emp=new Employee(1,"lucky",address1);
 Employee emp1=new Employee(2,"jaffa",address1);
 emp.display();
}
}
