package com.shopping.service;

import java.util.List;

import com.shopping.model.Buy;

public interface BuyService {
	/**
	 * 插入一条新订单
	 */
	public boolean save(Buy buy);

	/**
	 * 根据订单 bno删除订单
	 */
	public boolean deleteById(String bno);

	/**
	 * 修改订单信息
	 */
	public boolean update(Buy buy);

	/**
	 * 根据订单id(bno)获取一条订单信息，封装成类Buy的一个对象
	 */
	public Buy get(String bno);

	/**
	 * 获取所有订单
	 */
	public List<Buy> getAll();

	/**
	 * 根据cno,获取所有订单
	 */
	public List<Buy> getAllByCno(int cno);

	/**
	 * 根据sno,获取所有订单
	 */
	public List<Buy> getAllBySno(int sno);

	/**
	 * 根据buystate(购买状态),获取所有订单
	 */
	public List<Buy> getAllByBuystate(String buystate);

	/**
	 * 根据shipment(出货状态),获取所有订单
	 */
	public List<Buy> getAllByShipment(String shipment);

	/**
	 * 根据bno(订单编号),获取所有订单
	 */
	public List<Buy> getAllByBno(String bno);
}
