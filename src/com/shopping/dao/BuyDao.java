package com.shopping.dao;

import java.util.List;

import com.shopping.model.Buy;

public interface BuyDao {
	/**
	 * 实现插入一条新订单信息数据
	 */
	public boolean save(Buy buy);

	/**
	 * 根据订单 bno删除订单信息
	 */
	public boolean deleteById(String bno);

	/**
	 * 修改订单信息
	 */
	public boolean update(Buy buy);

	/**
	 * 根据订单编号获取订单，精确查询
	 */
	public Buy get(String bno);

	/**
	 * 获取所有订单数据
	 */
	public List<Buy> getAll();

	/**
	 * 根据cno（用户编号）,获取订单数据
	 */
	public List<Buy> getAllByCno(int cno);

	/**
	 * 根据sno（商品编号）,获取订单数据
	 */
	public List<Buy> getAllBySno(int sno);

	/**
	 * 根据buystate(购买状态)获取订单数据
	 */
	public List<Buy> getAllByBuystate(String buystate);

	/**
	 * 根据shipment(出货状态)获取订单数据
	 */
	public List<Buy> getAllByShipment(String shipment);

	/**
	 * 根据bno(订单编号)获取订单数据
	 */
	public List<Buy> getAllByBno(String bno);

}
