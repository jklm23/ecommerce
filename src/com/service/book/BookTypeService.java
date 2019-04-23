package com.service.book;
import java.util.List;
import java.util.Map;

import com.bean.book.BookType;
import com.bean.book.TransientBookType;
import com.service.Dao;

public interface BookTypeService extends Dao<BookType> {
	public abstract boolean exists(String bType,String sType);
	public abstract List searchBtype();
	public abstract Map<String, List> searchDistinctBookType(int size);
	public abstract Map<String, List> searchAllDistinctBookType();
	public abstract List searchStype(String bType);
	//��ȡ��Ʒ��������ͳ�Ʒ���
	public abstract List<TransientBookType> getBookTypeCount();
}
