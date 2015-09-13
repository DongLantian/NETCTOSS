package com.tarena.entity.page;

import java.io.Serializable;


/**
 * �ʷ�ģ��ķ�ҳ����
 * 
 * @author Jsong
 */
public class CostPage extends Page  implements Serializable{
	
	private static final long serialVersionUID = 1L;

	//����ʱ������������tureΪ����falseΪ����
	private Boolean baseDuration;
	
	private Boolean baseCost;	//����������������
	
	public CostPage() {
	}

	public CostPage(int currentPage, int pageSize) {
		super(currentPage, pageSize);
	}
	
	public CostPage(Boolean baseDuration, Boolean baseCost) {
		this.baseDuration = baseDuration;
		this.baseCost = baseCost;
	}
	
	public CostPage(int currentPage, int pageSize , Boolean baseDuration, Boolean baseCost) {
		super(currentPage, pageSize);
		this.baseDuration = baseDuration;
		this.baseCost = baseCost;
	}

	
	public Boolean getBaseDuration() {
		return baseDuration;
	}

	public void setBaseDuration(Boolean baseDuration) {
		this.baseDuration = baseDuration;
	}

	public Boolean getBaseCost() {
		return baseCost;
	}

	public void setBaseCost(Boolean baseCost) {
		this.baseCost = baseCost;
	}

}
