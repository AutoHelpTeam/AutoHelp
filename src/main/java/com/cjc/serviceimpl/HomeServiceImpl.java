package com.cjc.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjc.model.Student;
import com.cjc.repository.HomeRepository;
import com.cjc.service.HomeService;

@Service
public class HomeServiceImpl implements HomeService {
	@Autowired HomeRepository hr;

	@Override
	public Student  saveData(Student s) {
		
		return  hr.save(s);
	}

	@Override
	public List<Student> login(String user, String pass) 
	{
		return  hr.findAllByUsernameAndPassword(user, pass);
	}

	@Override
	public List<Student> displayAllData() {
		
		return (List<Student>) hr.findAll();
	}

	@Override
	public void delete(int idd) 
	{
		hr.deleteById(idd);
		
	}

	@Override
	public Student edit(int idd) {
		return hr.findById(idd).get();
		
	}

	@Override
	public Student update(Student s) {
		
		return hr.save(s);
	}

		
	
	

}
