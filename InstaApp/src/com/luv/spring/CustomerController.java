package com.luv.spring;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("customer")
public class CustomerController {

	@RequestMapping("/register")
	public String register(Model model)
	{  
		Customer cust=new Customer();
		model.addAttribute("customer",cust);
		return "register";
	}
	
	@RequestMapping("/postRegister")
	public String submitRegister(@ModelAttribute("customer") Customer theCustomer)
	{   
		 return "post-customer";
	}
	
}
