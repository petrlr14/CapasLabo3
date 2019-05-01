package com.uca.capas.controller;

import java.util.Random;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainController {

	@RequestMapping("/")
	public ModelAndView initMain() {
		ModelAndView mav=new ModelAndView();
		mav.setViewName("main");
		mav.addObject("flag", new Random().nextInt(2-0)==1);
		return mav;
	}
	
	@RequestMapping("/betterLuck")
	public ModelAndView betterLuck() {
		ModelAndView mav=new ModelAndView();
		mav.setViewName("betterLuck");
		return mav;
	}
	
}
