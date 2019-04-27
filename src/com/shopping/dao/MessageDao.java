package com.shopping.dao;

import java.util.List;

import com.shopping.model.Message;

public interface MessageDao {
	/**
	 * 插入一条新用户信息数据
	 */
	public boolean save(Message message);
	
	/**
	 * 根据商品名删除图文信息
	 */
	public boolean deleteById(String shopname);
	
	/**
	 * 修改用户信息
	 */
	public boolean update(Message message);
	
	/**
	 * 根据shopname获取图文信息，产生Message
	 */
	public Message get(String shopname);
	
	/**
	 * 根据shopname获取所有图文信息
	 */
	public List<Message> getallByshopname(String shopname);
}
