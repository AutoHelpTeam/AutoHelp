package com.cjc.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.cjc.model.Student;

public interface HomeRepository extends CrudRepository<Student, Integer>
{
	public List<Student> findAllByUsernameAndPassword(String user, String pass);

}
