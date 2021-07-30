package com.wony.diary.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.wony.diary.dto.DiaryWriteDTO;

@Controller
public class DiaryController {
    
	//���̾ View ������
	@RequestMapping("/diary")
	public ModelAndView myDiary(HttpServletRequest req, HttpServletResponse res) {
		
		// view �ܿ��� ���ϴ� �����͸� ������ ��
		// jsp -> name="name" �� ���
		String gpName = req.getParameter("name");
		
		
		ModelAndView mv = new ModelAndView("/diary/myDiary");
		
		return mv;
	}
	
	
	// ���̾ CRUD ��Ʈ�ѷ�
	@RequestMapping("/diaryWrite")
	public void writeDiary(HttpServletRequest req, HttpServletResponse res) {
		
		DiaryWriteDTO dw = new DiaryWriteDTO();
		
		
		
	}

}
