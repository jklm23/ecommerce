package com.service.book;

import java.util.List;

import com.bean.QueryResult;
import com.bean.book.Book;
import com.service.Dao;

public interface BookService extends Dao<Book> {
	public abstract void addBook(Book book,String bType,String sType);
	public abstract void addBookByNewType(Book book,String bType,String sType);
	public abstract void updateBook(Book book,String bType,String sType);
	public abstract void updateBookByNewType(Book book,String bType,String sType);
	/*��ȡ����ͼ��*/
	public abstract QueryResult<Book> getBestSellerBook(int size);
	/*��ȡ�������ͼ��*/
	public abstract QueryResult<Book> getBestCommentBook();
	/*��ȡ�ղ����ͼ��*/
	public abstract QueryResult<Book> getBestCollectBook();
	/*��ȡ�Ƽ�ͼ��*/
	public abstract QueryResult<Book> getRecommendtBook();
	/*��ȡ����ϲ��ͼ��*/
	/*��ȡ�Ƽ�����ͼ��*/
	/*��ȡ��������ͼ��*/
	/*��ȡ����ͼ��*/
	/*��ȡ�����ʷͼ��*/
	/*��ȡ�����Ȿ�黹ȥ����ͼ��   ��ͬ���͵�ͼ�鰴��������������*/
	public abstract List getSameTypeBook(int typeid);
	/*ͼ���Ӧ���ղ�*/
	public abstract boolean addCollectBook(int bid,int uid);
	//��ȡ�ղص�ͼ��
	public abstract List<Book> getCollectBook(Integer uid);
}
