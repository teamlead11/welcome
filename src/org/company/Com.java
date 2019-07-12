package org.company;

import java.util.ArrayList;
import java.util.List;

public class Com extends Employee{
public static void main(String[] args) {
	List<Employee> list=new ArrayList<Employee>();
	Com c=new Com();
	c.setId(100);
	c.setName("nivetha");
	c.setEmail("hdyfy");
	Com c1=new Com();
	c1.setId(1100);
	c1.setName("niivetha");
	c1.setEmail("hddyfy");
	list.add(c);
	list.add(c1);
	for (Employee e : list) {
		System.out.println(e.getEmail());
		System.out.println(e.getId());
		System.out.println(e.getName());
	}
	
	
}
}
