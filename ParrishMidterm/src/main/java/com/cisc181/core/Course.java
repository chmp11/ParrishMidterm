package com.cisc181.core;

import java.util.UUID;
import com.cisc181.eNums.*;

public class Course {
	private UUID CourseID;
	private String CourseName;
	private int GradePoints;
	private eMajor Major;
	
	public UUID getCourseID(){
		return CourseID;
	}
	public String getCourseName(){
		return CourseName;
	}
	public int getGradePoints(){
		return GradePoints;
	}
	public eMajor getMajor(){
		return Major;
	}
	public void setCourseID(UUID CourseID){
		this.CourseID=CourseID;
	}
	public void setCourseName(String CourseName){
		this.CourseName=CourseName;
	}
	public void setGradePoints(int GradePoints){
		this.GradePoints=GradePoints;
	}
	public void setMajor(eMajor Major){
		this.Major=Major;
	}
	
	public Course(UUID CourseID,String CourseName,int GradePoints){
	}
}
