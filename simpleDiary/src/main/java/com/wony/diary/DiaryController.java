package com.wony.diary;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class DiaryController {
    
	@RequestMapping("/diary")
	public ModelAndView myDiary() {
		
		ModelAndView mv = new ModelAndView("/diary/myDiary");
		
		return mv;
	}
	
	
	
	

}
