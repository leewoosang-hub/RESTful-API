package com.restful.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.restful.app.mapper.BoardMapper;

@Service
public class BoardServiceImpl implements BoardService {
	
	private BoardMapper boardMapper;
	
	@Autowired
	public BoardServiceImpl(BoardMapper boardMapper) {
		this.boardMapper = boardMapper;
	}
	
	@Override
	public int createUser(UsersVO userVO) {
		try {
			return boardMapper.createUser(userVO);
		} catch (Exception e) {
			throw new RuntimeException("エラーが発生しました。" + e.getMessage());
		}
	}
	
	
}
