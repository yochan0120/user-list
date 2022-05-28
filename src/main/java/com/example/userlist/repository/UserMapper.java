package com.example.userlist.repository;

import org.apache.ibatis.annotations.Mapper;

import com.example.userlist.dto.UserSearchRequest;
import com.example.userlist.entity.User;

//ユーザー情報Mapper
@Mapper
public interface UserMapper {
	/**
	 * ユーザー情報検索
	 * 
	 * @param user 検索用リクエストデータ
	 * @return ユーザー情報
	 */
	User search(UserSearchRequest user);
}
