package com.wony.diary;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class DiaryController {
    
	//���̾ View ������
	@RequestMapping("/diary")
	public ModelAndView myDiary() {
		
		ModelAndView mv = new ModelAndView("/diary/myDiary");
		
		return mv;
	}
	
	
	// ���̾ CRUD ��Ʈ�ѷ�
	@RequestMapping("/diaryWrite")
	public void writeDiary(HttpServletRequest req, HttpServletResponse res) {
		
		
		
		
	}

}
