package com.bean;

import java.util.List;
/**
 * ��ѯ���
 * @param <T>
 */
public class QueryResult<T> {
	/* ��¼�� */
	private List<T> resultlist;
	/* �ܼ�¼�� */
	private int recordtotal;
	public List<T> getResultlist() {
		return resultlist;
	}
	public void setResultlist(List<T> resultlist) {
		this.resultlist = resultlist;
	}
	public int getRecordtotal() {
		return recordtotal;
	}
	public void setRecordtotal(int recordtotal) {
		this.recordtotal = recordtotal;
	}
	

}
