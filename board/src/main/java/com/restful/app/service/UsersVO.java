package com.restful.app.service;

import java.sql.Date;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class UsersVO {
	private String id;
	private Integer password;
	private String nickname;
	@DateTimeFormat(pattern = "yyy-mm-dd")
	private Date createDate;
}
