package com.tarena.entity.page;

import java.io.Serializable;


/**
 *	�����˺ŵķ�ҳ��������ڷ�װ���� 
 * 	�˺�ģ��ķ�ҳ����������������
 * 
 * @author Jsong
 */
public class AccountPage extends Page implements Serializable {
	
	private static final long serialVersionUID = 1L;

	private String idcard_no; 	//���֤
	
	private String real_name;	//����
	
	private String login_name;	//��¼��
	
	private String status;		//״̬

	public String getIdcard_no() {
		return idcard_no;
	}

	public void setIdcard_no(String idcard_no) {
		this.idcard_no = idcard_no;
	}

	public String getReal_name() {
		return real_name;
	}

	public void setReal_name(String real_name) {
		this.real_name = real_name;
	}

	public String getLogin_name() {
		return login_name;
	}

	public void setLogin_name(String login_name) {
		this.login_name = login_name;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
}
