package com.haeyoum.m.repository;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.haeyoum.m.model.MemberRegistModel;

@Repository
public class MemberDao {
	
	@Autowired
	private SqlSessionTemplate sqlSession;
	private String nameSpace = "member.model.MemberMapper";

	public int insert(MemberRegistModel memberRegist) {
		return sqlSession.insert(nameSpace + ".insert", memberRegist);
	}
	
}
