package com.cjc.service;

import java.util.List;

import com.cjc.model.Student;

public interface HomeService 
{
	public Student saveData(Student s);
	public List<Student> login(String uname, String pass);
	public List<Student> displayAllData();
	public void delete(int idd);
	public Student edit(int idd);
	public Student update(Student s);

}
