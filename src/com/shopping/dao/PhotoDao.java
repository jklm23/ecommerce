package com.shopping.dao;

import java.util.List;

import com.shopping.model.Client;
import com.shopping.model.Photo;

public interface PhotoDao {
	/**
	 * 上传一条新图片信息数据
	 */
	public boolean save(Photo photo);
	
	/**
	 * 根据用户 pno删除用户信息
	 */
	public boolean deleteById(int pno);
	
	/**
	 * 修改用户信息
	 */
	public boolean update(Photo photo);
	
	/**
	 * 根据pno获取一条图片信息，封装成类Photo的一个对象
	 */
	public Photo get(int pno);
	
	/**
	 * 获取所有图片数据
	 */
	public List<Photo> getAll();
	
	/**
	 * 根据shopname,获取所有图片数据
	 */
	public List<Photo> getAllByName(String shopname);
}
