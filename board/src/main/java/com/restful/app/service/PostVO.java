package com.restful.app.service;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
public class PostVO {
	private Integer postNo;
	private String title;
	private String content;
	@DateTimeFormat(pattern = "yyyy-mm-dd")
	private Date regDate;
	private String writer;
}
