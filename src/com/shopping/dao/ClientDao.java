package com.shopping.dao;

import java.util.List;

import com.shopping.model.Client;

public interface ClientDao {
	/**
	 * 插入一条新用户信息数据
	 */
	public boolean save(Client client);
	
	/**
	 * 根据用户cno删除用户
	 */
	public boolean deleteById(int cno);
	
	/**
	 * 修改用户
	 */
	public boolean update(Client client);
	
	/**
	 * 根据用户id(cno)获取一条用户信息
	 */
	public Client get(int cno);
	
	/**
	 * 获取所有用户
	 */
	public List<Client> getAll();
	
	/**
	 * 按照csex,获取相应性别的用户数据
	 */
	public List<Client> getAllBySex(String csex);
	
	/**
	 * 根据cname,模糊查询用户
	 */
	public List<Client> getAllByName(String cname);
	
	/**
	 * 根据cno,模糊查询用户
	 */
	public List<Client> getAllByCno(int cno);
	
	/**
	 * 根据cname,cpassword判断是否登录
	 */
	public Client login(String cname,String password);
}
