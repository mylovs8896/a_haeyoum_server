package com.haeyoum.m.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.Gson;
import com.haeyoum.m.model.MemberRegistModel;
import com.haeyoum.m.service.MemberService;

@RestController
@RequestMapping("/m/member")
public class MemberController {
	
	Gson gson = new Gson();

	@Autowired
	private MemberService memberSvc;
	
	@RequestMapping(value = "/regist", method = RequestMethod.POST)
	public Map<String, Integer> regist(MemberRegistModel member){
		System.out.printf("(POST) 이메일 -> %s\n", member.getM_email());
		System.out.printf("(POST) 이름 -> %s\n", member.getM_name());
		System.out.printf("(POST) 비밀번호 -> %s\n", member.getM_password());
		
		Map<String, Integer> json = new HashMap<>();
		
		int result = memberSvc.regist(member);
		json.put("result", result);
		
		return json;

	}

	@RequestMapping(value="/Check", method=RequestMethod.GET)
	public MemberRegistModel restful(HttpSession session, String message) {
		
		System.out.printf("Session ID : %s\n", session.getId());
		
		MemberRegistModel member = new MemberRegistModel();
		member.setM_email("mtmtsm@naver.com");
		member.setM_name("정우성");
		member.setM_password("987654321");
		
		String strJson = gson.toJson(member);
		return member;
	
	}
	
}
