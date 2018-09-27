package com.homeo.prod.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.security.authentication.AnonymousAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainController {

	@RequestMapping(value = { "/welcome**" }, method = RequestMethod.GET)
	public ModelAndView defaultPage(HttpServletRequest request) {
		ModelAndView model = new ModelAndView();
		//use this auth check code for all method
		Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
		if (authentication == null || (authentication != null && !authentication.isAuthenticated()) || (authentication != null && (authentication instanceof AnonymousAuthenticationToken) )) {
			model.addObject("msg", "Please Sign In!");
			model.setViewName("login");
			return model;
		}
		model.addObject("title", "Dashboard");
		model.setViewName("dashboard");
		return model;
	}


	@RequestMapping(value = {"/", "/login"}, method = RequestMethod.GET)
	public ModelAndView login(@RequestParam(value = "error", required = false) String error,
			@RequestParam(value = "logout", required = false) String logout, HttpServletRequest request) {
		ModelAndView model = new ModelAndView();
		if (error != null) {
			model.addObject("error", "Invalid username and password!");
		}
		if (logout != null) {
			model.addObject("msg", "You've been logged out successfully.");
		}
		model.setViewName("login");
		return model;
	}

	@RequestMapping(value = { "/sign-up" },  method = { RequestMethod.GET, RequestMethod.POST })
	public ModelAndView gotoSignUpPage(HttpServletRequest request) {
		ModelAndView model = new ModelAndView();
		model.setViewName("sign-up");
		return model;
	}
	
	@RequestMapping(value = { "/forgot-password" },  method = { RequestMethod.GET, RequestMethod.POST })
	public ModelAndView gotoForgotPasswordPage(HttpServletRequest request) {
		ModelAndView model = new ModelAndView();
		model.setViewName("forgot-password");
		return model;
	}
	
	@RequestMapping(value = { "/addPatient" }, method = RequestMethod.GET)
	public ModelAndView addPatient(HttpServletRequest request) {
		ModelAndView model = new ModelAndView();
		//use this auth check code for all method
		Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
		if (authentication == null || (authentication != null && !authentication.isAuthenticated()) || (authentication != null && (authentication instanceof AnonymousAuthenticationToken) )) {
			model.addObject("msg", "Please Sign In!");
			model.setViewName("login");
			return model;
		}
		model.addObject("patrefnum", request.getParameter("patrefnum"));
		model.addObject("title", "Add Patient");
		model.addObject("menuActiveClass", "class=\"sfActive\"");
		model.setViewName("addPatient");
		return model;
	}
	
	@RequestMapping(value = { "/addMedicine" }, method = RequestMethod.GET)
	public ModelAndView addMedicine(HttpServletRequest request) {
		ModelAndView model = new ModelAndView();
		//use this auth check code for all method
		Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
		if (authentication == null || (authentication != null && !authentication.isAuthenticated()) || (authentication != null && (authentication instanceof AnonymousAuthenticationToken) )) {
			model.addObject("msg", "Please Sign In!");
			model.setViewName("login");
			return model;
		}
		model.addObject("title", "Add Medicine");
		model.addObject("menuActiveClass", "class=\"sfActive\"");
		model.setViewName("addMedicine");
		return model;
	}
	
	@RequestMapping(value = { "/manageMedicine" }, method = RequestMethod.GET)
	public ModelAndView manageMedicine(HttpServletRequest request) {
		ModelAndView model = new ModelAndView();
		//use this auth check code for all method
		Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
		if (authentication == null || (authentication != null && !authentication.isAuthenticated()) || (authentication != null && (authentication instanceof AnonymousAuthenticationToken) )) {
			model.addObject("msg", "Please Sign In!");
			model.setViewName("login");
			return model;
		}
		model.addObject("title", "Manage Medicine");
		model.addObject("menuActiveClass", "class=\"sfActive\"");
		model.setViewName("manageMedicine");
		return model;
	}
	
	@RequestMapping(value = { "/addDiseases" }, method = RequestMethod.GET)
	public ModelAndView addDiseases(HttpServletRequest request) {
		ModelAndView model = new ModelAndView();
		//use this auth check code for all method
		Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
		if (authentication == null || (authentication != null && !authentication.isAuthenticated()) || (authentication != null && (authentication instanceof AnonymousAuthenticationToken) )) {
			model.addObject("msg", "Please Sign In!");
			model.setViewName("login");
			return model;
		}
		model.addObject("title", "Add Diseases");
		model.addObject("menuActiveClass", "class=\"sfActive\"");
		model.setViewName("addDiseases");
		return model;
	}
	
	@RequestMapping(value = { "/manageDiseases" }, method = RequestMethod.GET)
	public ModelAndView manageDiseases(HttpServletRequest request) {
		ModelAndView model = new ModelAndView();
		//use this auth check code for all method
		Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
		if (authentication == null || (authentication != null && !authentication.isAuthenticated()) || (authentication != null && (authentication instanceof AnonymousAuthenticationToken) )) {
			model.addObject("msg", "Please Sign In!");
			model.setViewName("login");
			return model;
		}
		model.addObject("title", "Manage Diseases");
		model.addObject("menuActiveClass", "class=\"sfActive\"");
		model.setViewName("manageDiseases");
		return model;
	}
	
	@RequestMapping(value = { "/addStaticData" }, method = RequestMethod.GET)
	public ModelAndView addStaticData(HttpServletRequest request) {
		ModelAndView model = new ModelAndView();
		//use this auth check code for all method
		Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
		if (authentication == null || (authentication != null && !authentication.isAuthenticated()) || (authentication != null && (authentication instanceof AnonymousAuthenticationToken) )) {
			model.addObject("msg", "Please Sign In!");
			model.setViewName("login");
			return model;
		}
		model.addObject("title", "Add StaticData");
		model.addObject("menuActiveClass", "class=\"sfActive\"");
		model.setViewName("addStaticData");
		return model;
	}
	
	@RequestMapping(value = { "/manageStaticData" }, method = RequestMethod.GET)
	public ModelAndView manageStaticData(HttpServletRequest request) {
		ModelAndView model = new ModelAndView();
		//use this auth check code for all method
		Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
		if (authentication == null || (authentication != null && !authentication.isAuthenticated()) || (authentication != null && (authentication instanceof AnonymousAuthenticationToken) )) {
			model.addObject("msg", "Please Sign In!");
			model.setViewName("login");
			return model;
		}
		model.addObject("title", "Manage StaticData");
		model.addObject("menuActiveClass", "class=\"sfActive\"");
		model.setViewName("manageStaticData");
		return model;
	}
	@RequestMapping(value = { "/managePatient" }, method = RequestMethod.GET)
	public ModelAndView managePatient(HttpServletRequest request) {
		System.out.println("Inside managePatient in MainController");
		ModelAndView model = new ModelAndView();
		//use this auth check code for all method
		Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
		if (authentication == null || (authentication != null && !authentication.isAuthenticated()) || (authentication != null && (authentication instanceof AnonymousAuthenticationToken) )) {
			model.addObject("msg", "Please Sign In!");
			model.setViewName("login");
			return model;
		}
		model.addObject("title", "Manage Patient");
		model.addObject("menuActiveClass", "class=\"sfActive\"");
		model.setViewName("managePatient");
		return model;
	}

}