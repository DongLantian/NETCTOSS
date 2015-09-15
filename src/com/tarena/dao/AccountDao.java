package com.tarena.dao;

import java.util.List;

import com.tarena.annotation.MyBatisRepository;
import com.tarena.entity.Account;
import com.tarena.entity.page.AccountPage;

@MyBatisRepository
public interface AccountDao {
	
	/**
	 * ��ҳ����
	 * @param page
	 * @return
	 */
	public List<Account> findByPage(AccountPage page);
	
	/**
	 * ����������
	 * @param page
	 * @return
	 */
	public int findRows(AccountPage page) ;
	
	/**
	 * ��ͨҵ��
	 * @param id
	 */
	public void start(int id);
	
	/**
	 * ��ͣ�����˺ţ���״̬��Ϊ1������ͣʱ���Ϊ��ǰϵͳʱ��
	 * @param id
	 */
	public void pause(int id);

	/**
	 * ɾ��ҵ��
	 * @param id
	 */
	public void delete(int id);
}
