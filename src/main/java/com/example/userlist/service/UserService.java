package com.example.userlist.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.userlist.dto.UserSearchRequest;
import com.example.userlist.entity.User;
import com.example.userlist.repository.UserMapper;

/**
 * ユーザー情報 Service
 */
@Service
public class UserService {
	/**
	 * ユーザー情報 Mapper
	 */
	@Autowired
	private UserMapper userMapper;

	/**
	 * ユーザー情報検索 @param userSearchRequest リクエストデータ
	 * 
	 * @return 検索結果
	 */
	public User search(UserSearchRequest userSearchRequest) { // searchメソッドの中で、リポジトリクラス（userMapper)のsearchを呼び出す
		return userMapper.search(userSearchRequest); // 画面入力したのが、引数（コントローラクラスのuserSearchRequest）で返ってくる
	}
}