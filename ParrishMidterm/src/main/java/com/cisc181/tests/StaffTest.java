package com.cisc181.tests;

import static org.junit.Assert.*;

import org.junit.Test;
import java.util.ArrayList;
import java.util.Date;

import com.cisc181.core.Staff;
import com.cisc181.eNums.*;
import com.cisc181.core.*;


public class StaffTest {

	
	@Test
	public void testSalary() {
		Date date=new Date();
		Date date2=new Date();
		eTitle e = eTitle.PROFESSOR;
		Staff a= new Staff("Jane", "Sarah", "Jones", date, "adress", "1234567890", "email", "hours", 2, 100000.00, date2, e);
		ArrayList<Staff> staffList=new ArrayList<Staff>();
		staffList.add(a);
		Staff b=new Staff("Darla", "Alice", "Smith", date, "adress", "1234567890", "email", "hours", 3, 200000.00, date2, eTitle.DOCTOR);
		staffList.add(b);
		Staff c=new Staff("James", "Philip", "Prince", date, "adress", "1234567890", "email", "hours", 3, 150000.00, date2, eTitle.DOCTOR);
		staffList.add(c);
		Staff d=new Staff("Mary", "Kacie", "Matthews", date, "adress", "1234567890", "email", "hours", 3, 90000.00, date2, eTitle.INSTRUCTOR);
		staffList.add(d);
		Staff f=new Staff("Ryan", "Christopher", "Taylor", date, "adress", "1234567890", "email", "hours", 3, 700000.00, date2, eTitle.PROFESSOR);
		staffList.add(f);
		double average=(a.getSalary()+b.getSalary()+c.getSalary()+d.getSalary()+f.getSalary())/5;
		assertTrue(average==248000.00);
			
	}
	@Test
	public void testException(){
		Date date=new Date();
		Date date2=new Date();
		Staff test= new Staff("Jane", "Sarah", "Jones", date, "adress", "123456789", "email", "hours", 2, 100000.00, date2, eTitle.DOCTOR);
		boolean thrown=false;
		try{
			test.setPhone("123456789");
		}
		catch(PersonException e){
			thrown=true;
		}
		assertTrue(thrown);
	}

}
