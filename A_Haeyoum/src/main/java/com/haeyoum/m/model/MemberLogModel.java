package com.haeyoum.m.model;

import java.util.Date;

public class MemberLogModel {
	private String m_email;
	private Date m_recent_date;
	
	public MemberLogModel() {
		
	}

	public String getM_email() {
		return m_email;
	}

	public void setM_email(String m_email) {
		this.m_email = m_email;
	}

	public Date getM_recent_date() {
		return m_recent_date;
	}

	public void setM_recent_date(Date m_recent_date) {
		this.m_recent_date = m_recent_date;
	}

}
