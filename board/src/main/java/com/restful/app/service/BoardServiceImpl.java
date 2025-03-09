package com.restful.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.restful.app.mapper.BoardMapper;

@Service
public class BoardServiceImpl implements BoardService {
	
	@Autowired
	private BoardMapper boardMapper;
	
	@Override
	public int createUser(UsersVO userVO) {
		int result;
		try {
			return result = boardMapper.createUser(userVO);
		} catch (Exception e) {
			throw new RuntimeException("エラーが発生しました。" + e.getMessage());
		}
	}
	
	
}
