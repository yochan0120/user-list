package com.example.userlist.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.userlist.dto.UserSearchRequest;
import com.example.userlist.entity.User;
import com.example.userlist.service.UserService;

/**
 * ユーザー情報 Controller
 */
@Controller
public class UserController {
	/**
	 * ユーザー情報 Service
	 */
	@Autowired
	UserService userService;

	/**
	 * ユーザー情報検索画面を表示
	 * 
	 * @param model Model
	 * @return ユーザー情報一覧画面
	 */
	@GetMapping(value = "/user/search")
	public String displaySearch(Model model) {
		return "user/search";
	}

	/**
	 * ユーザー情報検索
	 * 
	 * @param userSearchRequest リクエストデータ
	 * @param model             Model
	 * @return ユーザー情報一覧画面 検索ボタンを押したら動き出す
	 */
	@RequestMapping(value = "/user/id_search", method = RequestMethod.POST)
	public String search(@ModelAttribute UserSearchRequest userSearchRequest, Model model) { // サーバーから受け取って
		User user = userService.search(userSearchRequest); // serviceに処理を依頼して
		model.addAttribute("userinfo", user); // 戻ってきたのをmodel.addAttributeに設定して
		return "user/search"; // 画面に返す
	}
}