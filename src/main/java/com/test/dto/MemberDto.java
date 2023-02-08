package com.test.dto;

import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Data;

@Data
public class MemberDto {
	private String userid;
	private String userpw;
	private String userName;
	private boolean enabled;
	private Date regdate;
	private Date updatedate;
	private List<AuthDto> authList;
	
	
}
