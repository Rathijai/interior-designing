package com.house.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.house.dao.RegisterDao;
import com.house.model.Register;





@Controller
public class RegisterController 

{
	
@Autowired
RegisterDao rdao;
	

@RequestMapping(value="Register", method=RequestMethod.GET)
	
public ModelAndView getlogin(@ModelAttribute("Register")Register register)
	
{
System.out.println("Register");	
			
ModelAndView model=new ModelAndView("Register");
			
return model;
	
}
	
@RequestMapping(value="Register", method=RequestMethod.POST)
	
public ModelAndView Success(Register reg, Model m)
	
{
	
      rdao.addUser(reg);
       ModelAndView model=new ModelAndView("index","Register", new Register());
			
           return model;
	
}
	
}
	
	


	

