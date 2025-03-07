package com.restful.app.mapper;

import java.util.List;

import com.restful.app.service.PostVO;
import com.restful.app.service.UsersVO;

public interface BoardMapper {
	//会員登録
	public int createUser(UsersVO userVO);
	//会員項目
	public List<UsersVO> readAllUsers();
	//会員照会
	public UsersVO readUser(String userId);
	//会員修正
	public int updateUser(UsersVO userVO);
	//会員削除
	public int deleteUser(String userId);
	
	//掲示物登録
	public int createPost(PostVO postVO);
	//掲示物項目
	public List<PostVO> readAllposts();
	//掲示物照会
	public PostVO readPost(Integer postNo);
	//掲示物修正
	public int updatePost(PostVO postVO);
	//掲示物削除
	public int deletePost(PostVO postVO);
}
