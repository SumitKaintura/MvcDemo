package com.ecomm.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;



@Controller
public class PageController 
{
    @RequestMapping(value="/login")
	public String showLoginPage()
     {
	return "Login";
	}
    
   @RequestMapping("/add")
    public ModelAndView add(HttpServletRequest request,HttpServletResponse response)
    {
    	int i=Integer.parseInt(request.getParameter("t1"));
    	int j=Integer.parseInt(request.getParameter("t2"));
    	int k=i+j;
    	ModelAndView mv = new ModelAndView();
    	mv.setViewName("Result");
    	mv.addObject("result",k);
    	return mv;
    	
    }
	/*@RequestMapping("/add")
	public String add()
	{
		
		return "Result";
	}*/
}
