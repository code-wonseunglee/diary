package com.wony.diary.controller;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.wony.diary.dto.DiaryWriteDTO;

@Controller
@RequestMapping("/main")
public class DiaryController {
    
	//���̾ View ������
	@RequestMapping("/diary")
	public ModelAndView myDiary(HttpServletRequest req, HttpServletResponse res) {
		
		// view �ܿ��� ���ϴ� �����͸� ������ ��
		// jsp -> name="name" �� ���
		// String gpName = req.getParameter("name");
		
		
		ModelAndView mv = new ModelAndView("/diary/myDiary");
		Calendar cal = Calendar.getInstance();
		
		String year = Integer.toString(cal.get(Calendar.YEAR)+1);
		String nextMonth = "";
		
//		if(cal.get(Calendar.MONTH) == 12) {
//			year = Integer.toString(cal.get(Calendar.YEAR)+1);
//		} else {
//			year = Integer.toString(cal.get(Calendar.YEAR));
//		}
//		
		
		if(cal.get(Calendar.MONTH)+1 <= 10) {
			nextMonth = "0"+ Integer.toString(cal.get(Calendar.MONTH)+2);
		} else {
			nextMonth = Integer.toString(cal.get(Calendar.MONTH)+1);
		}
		
		String testDate = year + nextMonth;
		Date date = new Date(); 
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM");
		String nowDate = sdf.format(date);
		
		mv.addObject("nowDate", nowDate);
		mv.addObject("testDate",testDate);
		
		return mv;
	}
	
	
	// ���̾ CRUD ��Ʈ�ѷ�
	@RequestMapping("/diaryWrite")
	public void writeDiary(HttpServletRequest req, HttpServletResponse res) {
		
		DiaryWriteDTO dw = new DiaryWriteDTO();
		
		
		
	}

}
