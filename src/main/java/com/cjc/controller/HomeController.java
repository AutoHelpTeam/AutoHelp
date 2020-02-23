package com.cjc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.cjc.model.Student;
import com.cjc.service.HomeService;

@Controller
public class HomeController {
	@Autowired HomeService hs;
	@RequestMapping("/")
	public String preLogin()
	{
		return "login";
	}
	
	
	@RequestMapping("/register")
	public String preRegister()
	{
		return "register";
		
	}
	
	@RequestMapping("/add")
	public String add()
	{
		return "register";
		
	}
	@RequestMapping("/regi")
	public String register(@ModelAttribute("stu") Student s, Model m)
	{	
		System.out.println("in register");
		Student l=hs.saveData(s);
		if(l!=null)
		{
			List<Student> list=hs.displayAllData();
			m.addAttribute("data",list);
			return "success";
		}
		else{
			return "register";
		}
		
	}
	
	@RequestMapping("/login")
	public String login(@RequestParam("username") String user, @RequestParam("password") String pass, Model m)
	{
		Student s=new Student();
		s.setUsername(user);
		s.setPassword(pass);
		if(user.isEmpty()&&pass.isEmpty())
		{
			return "login";
		}
		else
		{
			if(user.equals("admin")&&pass.equals("admin"))
			{
				List<Student> list=hs.displayAllData();
				m.addAttribute("data", list);
				return "success";
			}
			else
			{
				List<Student> list=hs.login(user, pass);
				m.addAttribute("data", list);
				return "success";
			}
		}
     }
	
	@RequestMapping("/delete")
	public String delete(@ModelAttribute Student s, Model m)
	{
		int idd=s.getId();
		hs.delete(idd);
		List<Student> list=hs.displayAllData();
		m.addAttribute("data", list);
		return "success";
		
	}
	
	@RequestMapping("/edit")
	public String edit(@ModelAttribute Student s, Model m)
	{
		int idd=s.getId();
		Student stu=hs.edit(idd);
		m.addAttribute("data", stu);
		return "edit";
	}
	
	@RequestMapping("/update")
	public String update(@ModelAttribute Student s, Model m) 
	{
		int idd=s.getId();
		hs.update(s);
		List<Student> list=hs.displayAllData();
		m.addAttribute("data", list);
		return "success";
		
	}
}
