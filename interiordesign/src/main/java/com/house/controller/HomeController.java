package com.house.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController 
{

	@RequestMapping("/")
	public String index()
	{
	return "index";
	}

	/*@RequestMapping("/Login")
	public String Login()
	{
	return "Login";
	}
	@RequestMapping("/Register")
	  public String Register()
	  {
	  return "Register";
	  }
	*/
  @RequestMapping("/Admin")
    public String Admin()
   {
   return "Admin";
  }

  @RequestMapping("/Aboutus")
public String AboutUs()
{
return "Aboutus";
}	
	
	
}