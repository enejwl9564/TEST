package com.korea1.domain;

import java.sql.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Criteria {
	private int pageno;	 //현재 페이지 
	private int amount;	 //표시할 게시물 양(10건)
	private String type;	//	제목,작성자,게시물번호
	private String keyword;	//	포함문자열
	
}
