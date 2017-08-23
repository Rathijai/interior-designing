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
	
//@Autowired
	
/*ProductDAO pdao;

	
@SuppressWarnings("unchecked")
	
@RequestMapping(value = "/loginsuccess")
	
public String login_session_attributes(HttpSession session,Model model) 
	
{
		
System.out.println("Hai..Am");
		
String userid = SecurityContextHolder.getContext().getAuthentication().getName();
		
		
Collection<GrantedAuthority> authorities = (Collection<GrantedAuthority>) SecurityContextHolder.getContext().getAuthentication().getAuthorities();

		String page="";
		
		
String role="ROLE_USER";
		
for (GrantedAuthority authority:authorities) 
		
{
		 
System.out.println(authority.getAuthority());
		   
  if (authority.getAuthority().equals(role)) 
		    
 {
		    	 
		    	
 session.setAttribute("UserLoggedIn", "true");
		    	
 session.setAttribute("Username", userid);
		    	
 page="FullProduct";
		    	
 ArrayList list=(ArrayList)pdao.showProduct();
		    	
 Gson gson = new Gson();
		    	 
String jsonInString=gson.toJson(list);
		    	
 model.addAttribute("list",jsonInString);
		    	 
ArrayList<Cart> cartitem=new ArrayList<Cart>();
		    	
 session.setAttribute("mycart", cartitem);
		    	 
		    	
 break;
		    
 }
		    
 else 
		    
 {
		    	
 session.setAttribute("LoggedIn", "true");
		    	
 session.setAttribute("Administrator", "true");
		    	
 page="Admin";
		    	
 break;
		    
}
		
}
		
return page;
	
}*/

			


//-----------------------------------------------------------------------------

	/*@RequestMapping("/Admin")
	
public String showAdmin() 
	
{
			
System.out.println("Admin");	
				
return "Admin";

	}	*/




























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
	System.out.println("100");
      rdao.addUser(reg);
      System.out.println("10");
			
     ModelAndView model=new ModelAndView("index","Register", new Register());
			
           return model;
	
}
	
}
	
	


	

