package com.testyantra.springmvcpoc.controller;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.testyantra.springmvcpoc.model.HelloModel;

//@ComponentScans(value = { @ComponentScan })
//@ComponentScan
@Controller
//THis can be used with method as well as Class level
//@RequestMapping("/hello")

public class HelloController { 
	
	@GetMapping({"/hello1","/hello2"})//These Must be used with Method Level
	//@GetMapping("/hello2")
	//@GetMapping(value = "/hello2")
   //@RequestMapping(value = "/hello2", method = RequestMethod.GET)
   //@RequestMapping(method = RequestMethod.GET)
   public String printHello(ModelMap model) {
		
		HelloModel myModel = new HelloModel();
		myModel.setMessage("My Name is Praveen !!!");
		
      model.addAttribute("info", myModel);
      return "hello";
   }
   
	/**
	 * 
	 * @param model
	 * @return
	 */
	@GetMapping("/hello3")
   public ModelAndView newPrintHello(ModelAndView model) { //by Default /hello3 will be added as View
		
		HelloModel myModel = new HelloModel();
		myModel.setMessage("My Name is Rekha !!!");
		
      model.addObject("info", myModel);
      model.setViewName("hello");
      return model;
   }
	
	@GetMapping("/hello4")
	   public ModelAndView newPrintHello() {
			
		HelloModel myModel = new HelloModel();
		myModel.setMessage("My Name is Mahendra !!!");
		
		ModelAndView modelView = new ModelAndView();
		modelView.addObject("info", myModel);
		modelView.setViewName("hello");
	      return modelView;
	   }
	/**
	 * 
	 * @return
	 */
	@GetMapping("/hello5")
	   public ModelAndView newPrintHello2() {
			
		final HelloModel myModel = new HelloModel();
		myModel.setMessage("My Name is Maurya !!!");
		
		ModelAndView modelView = new ModelAndView("hello");
		modelView.addObject("info", myModel);
//		modelView.setViewName();
	      return modelView;
	   }
	
	@PostMapping(path = "/pets", consumes = MediaType.APPLICATION_JSON_VALUE)
	   public ModelAndView postMethod(@PathVariable String name) {
			
		HelloModel myModel = new HelloModel();
		myModel.setMessage("My Name is Maurya !!!");
		
		ModelAndView modelView = new ModelAndView("hello");
		modelView.addObject("info", myModel);
//		modelView.setViewName();
	      return modelView;
	   }
	
}
