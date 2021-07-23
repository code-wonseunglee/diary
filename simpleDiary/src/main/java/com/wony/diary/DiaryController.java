package com.wony.diary;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class DiaryController {
    
	//다이어리 View 페이지
	@RequestMapping("/diary")
	public ModelAndView myDiary() {
		
		ModelAndView mv = new ModelAndView("/diary/myDiary");
		
		return mv;
	}
	
	
	// 다이어리 CRUD 컨트롤러
	@RequestMapping("/diaryWrite")
	public void writeDiary(HttpServletRequest req, HttpServletResponse res) {
		
		
		
		
	}

}
