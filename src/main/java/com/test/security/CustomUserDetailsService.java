package com.test.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.test.dto.CustomUser;
import com.test.dto.MemberDto;
import com.test.mapper.MemberMapper;


public class CustomUserDetailsService implements UserDetailsService{

	@Autowired
	private MemberMapper memberMapper;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		System.out.println("Load User by Username : " + username);
		
		MemberDto dto = memberMapper.read(username);
		
		System.out.println("MemberDto : " + dto);
		return dto==null?null:new CustomUser(dto);
	}
	
}
