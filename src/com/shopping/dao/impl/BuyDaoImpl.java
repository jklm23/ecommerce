package com.shopping.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.shopping.dao.BuyDao;
import com.shopping.model.Buy;

import org.hibernate.SessionFactory;

import com.shopping.dao.BuyDao;
import com.shopping.model.Buy;

public class BuyDaoImpl implements BuyDao {
	private SessionFactory sessionFactory;
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	public boolean save(Buy buy) {
		// 订单创建
		Session session=sessionFactory.getCurrentSession();
		boolean result=false;
		try {
			session.save(buy);//将订单存入数据库
			result=true;
		}catch(Exception e) {
			System.out.println("持久化订单异常："+e);
			result=false;//订单保存失败
		}
		return result;
	}

	@Override
	public boolean deleteById(String bno) {
		// TODO Auto-generated method stub
		Buy buy=get(bno);//根据订单编号找出订单
		Session session=sessionFactory.getCurrentSession();
		boolean result=false;
		try {
			session.delete(buy);//删除订单
			result=true;//删除订单成功时返回true
		} catch (Exception e) {
			//订单删除失败
			 System.out.println("订单删除失败："+e);
			 result=false;
		}
		return result;
	}

	@Override
	public boolean update(Buy buy) {
		// TODO Auto-generated method stub
		Session session=sessionFactory.getCurrentSession();
		boolean result=false;
		try {
			session.saveOrUpdate(buy);
			result=true;
		} catch (Exception e) {
			//订单更新失败
			 System.out.println("订单更新失败："+e);
			 result=false;
		}
		return result;
	}

	@Override
	public Buy get(String bno) {
		// 根据订单编号获取订单
		Session session=sessionFactory.openSession();
		String hql="from Buy as b where b.bno = :bno";
		Buy buy=(Buy)session.createQuery(hql).setParameter("bno", bno).uniqueResult();
		return buy;
	}

	@Override
	public List<Buy> getAll() {
		// 获取所有订单信息
		Session session=sessionFactory.openSession();
		List<Buy> list=(List<Buy>)session.createQuery("from Buy").list();
		return list;
	}

	@Override
	public List<Buy> getAllByCno(int cno) {
		// 根据用户编号获取订单数据
		Session session=sessionFactory.openSession();
		String hql="from Buy as b where b.cno = :cno";
		List<Buy> list=(List<Buy>)session.createQuery(hql).setParameter("cno",cno).list();
		return list;
	}

	@Override
	public List<Buy> getAllBySno(int sno) {
		// 根据商品编号获取订单数据
		Session session=sessionFactory.openSession();
		String hql="from Buy as b where b.sno = :sno";
		List<Buy> list=(List<Buy>)session.createQuery(hql).setParameter("sno",sno).list();
		return list;
	}

	@Override
	public List<Buy> getAllByBuystate(String buystate) {
		// 根据订单状态获取订单数据
		Session session=sessionFactory.openSession();
		String hql="from Buy as b where b.buystate = :buystate";
		List<Buy> list=(List<Buy>)session.createQuery(hql).setParameter("buystate",buystate).list();
		return list;
	}

	@Override
	public List<Buy> getAllByShipment(String shipment) {
		// 根据出货状态获取订单数据
		Session session=sessionFactory.openSession();
		String hql="from Buy as b where b.shipment = :shipment";
		List<Buy> list=(List<Buy>)session.createQuery(hql).setParameter("shipment",shipment).list();
		return list;
	}

	@Override
	public List<Buy> getAllByBno(String bno) {
		// 根据订单编号获取订单数据
		Session session=sessionFactory.openSession();
		String hql="from Buy as b where b.bno = :bno";
		List<Buy> list=(List<Buy>)session.createQuery(hql).setParameter("bno",bno).list();
		return list;
	}
}
