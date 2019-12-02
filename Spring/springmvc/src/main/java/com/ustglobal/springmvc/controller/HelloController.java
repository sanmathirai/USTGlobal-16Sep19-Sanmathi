package com.ustglobal.springmvc.controller;

import java.util.Date;
import java.text.SimpleDateFormat;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Required;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.ustglobal.springmvc.beans.Employee;

@Controller
public class HelloController {
	@InitBinder
	public void initBinder(WebDataBinder binder) {
		SimpleDateFormat format = new SimpleDateFormat("yyyy-m-dd");
		CustomDateEditor editor = new CustomDateEditor(format, true);
		binder.registerCustomEditor(Date.class, editor);
	}

	@RequestMapping(path="/hello")
	//Reading query string
	public String hello(
			@RequestParam("name") String name , 
			@RequestParam("id")  int id , 
			ModelMap map) {
		map.addAttribute("msg", "hello world");
		map.addAttribute("name", name);
		map.addAttribute("id", id);
		return "index";
	}
	//path param
	@RequestMapping(path="/hi/{name}/{id}")
	public String hi(
			@PathVariable("name") String name , 
			@PathVariable("id")  int id , 
			HttpServletRequest request) {
		request.setAttribute("msg" , "hello UST Global");
		request.setAttribute("name", name);
		request.setAttribute("id", id);
		return "index";
	}

	@RequestMapping(path = "/form")
	public String formPage() {
		return "form";
	}
	@RequestMapping(path = "/form" , method = RequestMethod.POST)
	public String form( Employee employee, Model map) {
		map.addAttribute("id" , employee.getId());
		map.addAttribute("name" , employee.getName());
		map.addAttribute("password" , employee.getpassword());
		map.addAttribute("gender" , employee.getGender());
		map.addAttribute("date" , employee.getDate());
		return "formOutput";
	}

	@RequestMapping(path ="/create-cookie")
	public String createCookie(Model map,HttpServletResponse response) {
		Cookie cookie = new Cookie("name", "Mary");
		response.addCookie(cookie);
		return "createcookie";

	}

	@RequestMapping(path ="/read-cookie")
	public String readCookie(Model map, @CookieValue(name = "name",required = false) String name) {
		map.addAttribute("name" , name);
		return "readcookie";
	}
	@RequestMapping(path = "/redirect")
	public String redirect() {
		return "redirect:https://www.google.com";
	}
	@RequestMapping(path = "/forward")
	public String forward() {
		return "forward:hi/Sanmathi/1";
		
	}

}
