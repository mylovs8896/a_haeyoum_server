package com.haeyoum.m.model;

public class MemberRegistModel {
	private String m_email;
	private String m_name;
	private String m_password;
	private String m_active_number;
	
	public MemberRegistModel() {
		
	}

	public String getM_email() {
		return m_email;
	}

	public void setM_email(String m_email) {
		this.m_email = m_email;
	}

	public String getM_name() {
		return m_name;
	}

	public void setM_name(String m_name) {
		this.m_name = m_name;
	}

	public String getM_password() {
		return m_password;
	}

	public void setM_password(String m_password) {
		this.m_password = m_password;
	}

	public String getM_active_number() {
		return m_active_number;
	}

	public void setM_active_number(String m_active_number) {
		this.m_active_number = m_active_number;
	}
	
}