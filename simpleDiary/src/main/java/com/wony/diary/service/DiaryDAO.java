package com.wony.diary.service;

import java.util.List;

import com.wony.diary.dto.DiaryWriteDTO;

public interface DiaryDAO {
	
	public void write(DiaryWriteDTO dto) throws Exception;
	
	public DiaryWriteDTO read(Integer bno) throws Exception;
	
	public void update(DiaryWriteDTO dto) throws Exception;

	public void delete(Integer bno) throws Exception;
	
	public List<DiaryWriteDTO> listAll() throws Exception;
	
}
