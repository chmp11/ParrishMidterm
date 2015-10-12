package com.cisc181.core;
import java.util.UUID;

public class Enrollment {
	private UUID SectionID;
	private UUID StudentID;
	private UUID EnrollmentID;
	private double Grade;
	public UUID getSectionID(){
		return SectionID;
	}
	public UUID getStudentID(){
		return StudentID;
	}
	public UUID getEnrollmentID(){
		return EnrollmentID;
	}
	public double getGrade(double Grade){
		return Grade;
	}
	public void setSecionID(UUID SectionID){
		this.SectionID=SectionID;
	}
	public void setStudentID(UUID StudentID){
		this.StudentID=StudentID;
	}
	public void setEnrollmentID(UUID EnrollmentID){
		this.EnrollmentID=EnrollmentID;
	}
	public void setGrade(double Grade){
		this.Grade=Grade;
	}
	private Enrollment(){}
	public Enrollment (UUID SectionID,UUID StudentID){
		this.EnrollmentID=EnrollmentID;
		this.Grade=Grade;
	}
}
