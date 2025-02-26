package com.restful.app.mapper;

import java.util.List;

import com.restful.app.service.PostVO;
import com.restful.app.service.UsersVO;

public interface BoardMapper {
	//会員登録
	public int createUser(UsersVO userVO);
	//会員修正
	public int updateUser(UsersVO userVO);
	//会員削除
	public int deleteUser(String userID);
	//掲示物閲覧
	public List<PostVO> postList();
	
}
