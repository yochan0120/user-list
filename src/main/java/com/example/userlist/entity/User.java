package com.example.userlist.entity;

import java.util.Date;

import javax.persistence.Column;

import lombok.Data;

//ユーザー情報Entity
@Data
public class User {

	// Id
	private Long id;

	// 名前
	private String name;

	// 住所
	private String address;

	// 電話番号
	private String phone;

	// 更新日時
	private Date updateDate;

	// 登録日時
	private Date createDate;

	// 削除日時
	@Column(name = "delete_date")
	private Date deleteDate;
}
