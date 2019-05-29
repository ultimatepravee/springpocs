package com.testyantra.springtemplets;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class EntryController {
    @GetMapping("/")
    public String home(Model model){
        return "index";
    }
    
    @PostMapping("/submit")
    public ModelAndView submit(@ModelAttribute OfferLetterBean model){
    	ModelAndView modelView = new ModelAndView();
		modelView.addObject("info", model);
		modelView.setViewName("OfferLetter");
	      return modelView;
    }
}
