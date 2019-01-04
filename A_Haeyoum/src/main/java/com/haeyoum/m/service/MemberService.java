package com.haeyoum.m.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.haeyoum.m.model.MemberRegistModel;
import com.haeyoum.m.repository.MemberDao;


@Service
public class MemberService {
	
	@Autowired
	private MemberDao dao;
	
	public int regist(MemberRegistModel memberRegist) {
		return dao.insert(memberRegist);
	}

}
