package com.example.userlist.dto;

import java.io.Serializable;

import lombok.Data;

@Data
public class UserSearchRequest implements Serializable {
	// ユーザーID
	private Long id;
}
