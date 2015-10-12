package com.cisc181.tests;

import static org.junit.Assert.*;

import org.junit.Test;
import java.util.ArrayList;
import java.util.Date;
import java.util.UUID;

import org.junit.BeforeClass;
import com.cisc181.core.*;
import com.cisc181.eNums.*;

public class StudentTest {
	@BeforeClass public static void Before(){
	ArrayList<Student> testList=new ArrayList<Student>();
	Date DOB=new Date();
	Student a= new Student("Jay","John","OMalley", DOB, eMajor.CHEM,"adress","1234567890","udel.edu");
	Student b= new Student("Sam","C","Smith", DOB, eMajor.COMPSI,"adress","1234567890","udel.edu");
	Student c= new Student("Jack","L","Winston", DOB, eMajor.NURSING,"adress","1234567890","udel.edu");
	Student d= new Student("Liam","F","Jones", DOB, eMajor.BUSINESS,"adress","1234567890","udel.edu");
	Student e= new Student("Sean","R","Butler", DOB, eMajor.PHYSICS,"adress","1234567890","udel.edu");
	Student f= new Student("Colm","W","Walsh", DOB, eMajor.CHEM,"adress","1234567890","udel.edu");
	Student g= new Student("Ben","H","Merchant", DOB, eMajor.PHYSICS,"adress","1234567890","udel.edu");
	Student h= new Student("Andrew","P","Staal", DOB, eMajor.COMPSI,"adress","1234567890","udel.edu");
	Student i= new Student("Tyler","E","Givens", DOB, eMajor.NURSING,"adress","1234567890","udel.edu");
	Student j= new Student("Alex","A","Manning", DOB, eMajor.BUSINESS,"adress","1234567890","udel.edu");
	testList.add(a);
	testList.add(b);
	testList.add(c);
	testList.add(d);
	testList.add(e);
	testList.add(f);
	testList.add(g);
	testList.add(h);
	testList.add(i);
	testList.add(j);
	ArrayList<Course> courses=new ArrayList<Course>();
	UUID course1=UUID.randomUUID();
	Course one = new Course(course1,"CISC106",4);
	courses.add(one);
	UUID course2=UUID.randomUUID();
	Course two = new Course(course2,"CHEM111",4);
	courses.add(two);
	UUID course3=UUID.randomUUID();
	Course three = new Course(course3,"PHYS207",4);
	courses.add(three);
	ArrayList<Semester> sems=new ArrayList<Semester>();
	UUID semes1=UUID.randomUUID();
	Date date1=new Date();
	Date date2=new Date();
	Semester sem1= new Semester(semes1,date1,date2);
	UUID semes2=UUID.randomUUID();
	Date date3=new Date();
	Date date4=new Date();
	Semester sem2= new Semester(semes2,date3,date4);
	sems.add(sem1);
	sems.add(sem2);
	ArrayList<Section> secs=new ArrayList<Section>();
	UUID sec1=UUID.randomUUID();
	Section sect1=new Section(course1,semes1,sec1,107);
	UUID sec2=UUID.randomUUID();
	Section sect2=new Section(course1,semes2,sec2,101);
	UUID sec3=UUID.randomUUID();
	Section sect3=new Section(course2,semes1,sec3,103);
	UUID sec4=UUID.randomUUID();
	Section sect4=new Section(course2,semes2,sec4,102);
	UUID sec5=UUID.randomUUID();
	Section sect5=new Section(course3,semes1,sec5,105);
	UUID sec6=UUID.randomUUID();
	Section sect6=new Section(course3,semes2,sec6,109);
	secs.add(sect1);
	secs.add(sect2);
	secs.add(sect3);
	secs.add(sect4);
	secs.add(sect5);
	secs.add(sect6);
	UUID studentID=UUID.randomUUID();
	}
	
	
	
	
	@Test
	public void testGPA() {
		a.Enrollment(sect1,studentID);
		a.Enrollment(sect2,studentID);
		a.Enrollment(sect3,studentID);
		a.Enrollment(sect4,studentID);
		a.Enrollment(sect5,studentID);
		a.Enrollment(sect6,studentID);
		b.Enrollment(sect1,studentID);
		b.Enrollment(sect2,studentID);
		b.Enrollment(sect3,studentID);
		b.Enrollment(sect4,studentID);
		b.Enrollment(sect5,studentID);
		b.Enrollment(sect6,studentID);
		c.Enrollment(sect1,studentID);
		c.Enrollment(sect2,studentID);
		c.Enrollment(sect3,studentID);
		c.Enrollment(sect4,studentID);
		c.Enrollment(sect5,studentID);
		c.Enrollment(sect6,studentID);
		d.Enrollment(sect1,studentID);
		d.Enrollment(sect2,studentID);
		d.Enrollment(sect3,studentID);
		d.Enrollment(sect4,studentID);
		d.Enrollment(sect5,studentID);
		d.Enrollment(sect6,studentID);
		e.Enrollment(sect1,studentID);
		e.Enrollment(sect2,studentID);
		e.Enrollment(sect3,studentID);
		e.Enrollment(sect4,studentID);
		e.Enrollment(sect5,studentID);
		e.Enrollment(sect6,studentID);
		f.Enrollment(sect1,studentID);
		f.Enrollment(sect2,studentID);
		f.Enrollment(sect3,studentID);
		f.Enrollment(sect4,studentID);
		f.Enrollment(sect5,studentID);
		f.Enrollment(sect6,studentID);
		g.Enrollment(sect1,studentID);
		g.Enrollment(sect2,studentID);
		g.Enrollment(sect3,studentID);
		g.Enrollment(sect4,studentID);
		g.Enrollment(sect5,studentID);
		g.Enrollment(sect6,studentID);
		h.Enrollment(sect1,studentID);
		h.Enrollment(sect2,studentID);
		h.Enrollment(sect3,studentID);
		h.Enrollment(sect4,studentID);
		h.Enrollment(sect5,studentID);
		h.Enrollment(sect6,studentID);
		i.Enrollment(sect1,studentID);
		i.Enrollment(sect2,studentID);
		i.Enrollment(sect3,studentID);
		i.Enrollment(sect4,studentID);
		i.Enrollment(sect5,studentID);
		i.Enrollment(sect6,studentID);
		
		
		fail("Not yet implemented");
	}
	@Test
	public void testavgGrade(){
		fail("Not yet implemented");
	}
	@Test
	public void testMajorchange(){
		a.setMajor(eMajor.BUSINESS);
		assertTrue(a.getMajor()==eMajor.BUSINESS);
	}
	
}
