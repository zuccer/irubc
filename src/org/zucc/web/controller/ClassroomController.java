package org.zucc.web.controller;

import javax.annotation.Resource;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.zucc.web.service.ClassroomService;

@Controller("classroomController")
@Scope("prototype")
@RequestMapping("classroom")
public class ClassroomController {
	
	@Resource
	ClassroomService classroomService;
	
	@RequestMapping("list")
	public String list(Model model){
		
		return "classroom_list";
	}
}
