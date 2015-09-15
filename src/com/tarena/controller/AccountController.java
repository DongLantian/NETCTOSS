package com.tarena.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.tarena.dao.AccountDao;
import com.tarena.entity.Account;
import com.tarena.entity.page.AccountPage;

@Controller
@RequestMapping("/account")
public class AccountController {
	
	@Resource
	private AccountDao accDao;
	
	@RequestMapping("/findAccount.do")
	public String find(AccountPage page , Model model) {
		//��ѯ����ǰҳ������
		List<Account> list = accDao.findByPage(page);
		model.addAttribute("accounts", list);
		
		//��ѯ�����������Ӷ��������ҳ��
		page.setRows(accDao.findRows(page));
		model.addAttribute("accountPage", page);
		return "account/account_list";
	}
	
	@RequestMapping("startAccount.do")
	public String updateStart(@RequestParam("id")int id){
		//��ͣ�����˺�
		accDao.start(id);
		return "redirect:findAccount.do";
	}
	
	@RequestMapping("pauseAccount.do")
	public String updatePause(@RequestParam("id")int id){
		//��ͣ�����˺�
		accDao.pause(id);
		
		// TODO ��ͣ�����˺�ʱ��Ҫ��ͣ��������ҵ���˺�
		
		return "redirect:findAccount.do";
	}
	
	@RequestMapping("deleteAccount.do")
	public String updateDelete(@RequestParam("id")int id){
		//��ͣ�����˺�
		accDao.delete(id);
		
		// TODO ɾ�������˺�ʱ��Ҫɾ����������ҵ���˺�
		
		return "redirect:findAccount.do";
	}

}
