package com.wony.diary.service;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.wony.diary.dto.DiaryWriteDTO;

@Repository
public class DiaryDAOImpl implements DiaryDAO {
	
	@Inject
	private SqlSession session;
	
	private static String namespace = "mapper.diary";

	@Override
	public void write(DiaryWriteDTO dto) throws Exception {
		session.insert(namespace+".write", dto);
	}

	@Override
	public DiaryWriteDTO read(Integer bno) throws Exception {
		
		return session.selectOne(namespace+".read",bno);
	}

	@Override
	public void update(DiaryWriteDTO dto) throws Exception {
		session.update(namespace+"update", dto);
	}

	@Override
	public void delete(Integer bno) throws Exception {
		session.delete(namespace+"delete", bno);
	}

	@Override
	public List<DiaryWriteDTO> listAll() throws Exception {
		
		return session.selectList(namespace+".listAll");
	}

}
