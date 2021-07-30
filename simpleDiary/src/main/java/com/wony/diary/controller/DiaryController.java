package com.wony.diary.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.wony.diary.dto.DiaryWriteDTO;

@Controller
public class DiaryController {
    
	//다이어리 View 페이지
	@RequestMapping("/diary")
	public ModelAndView myDiary(HttpServletRequest req, HttpServletResponse res) {
		
		// view 단에서 원하는 데이터를 가져올 때
		// jsp -> name="name" 일 경우
		String gpName = req.getParameter("name");
		
		
		ModelAndView mv = new ModelAndView("/diary/myDiary");
		
		return mv;
	}
	
	
	// 다이어리 CRUD 컨트롤러
	@RequestMapping("/diaryWrite")
	public void writeDiary(HttpServletRequest req, HttpServletResponse res) {
		
		DiaryWriteDTO dw = new DiaryWriteDTO();
		
		
		
	}

}
