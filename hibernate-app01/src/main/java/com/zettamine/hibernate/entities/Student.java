package com.zettamine.hibernate.entities;

public class Student {
	private Integer studentId;
	private String studentName;
	private String studentEmail;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Integer getStudentId() {
		return studentId;
	}
	public Student(Integer studentId, String studentName, String studentEmail) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentEmail = studentEmail;
	}
	public void setStudentId(Integer studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		System.out.println("get name called");
		return studentName;
	}
	public void setStudentName(String studentName) {
		System.out.println("set name called");
		this.studentName = studentName;
	}
	public String getStudentEmail() {
		System.out.println("get email called");
		return studentEmail;
	}
	public void setStudentEmail(String studentEmail) {
		System.out.println("set email called");
		this.studentEmail = studentEmail;
	}
	@Override
	public String toString() {
		return String.format("Student [%-3d | %-10s | %-18s ]",studentId, studentName, studentEmail);
	}
	
	
	

}
