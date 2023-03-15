package com.spring.Imuseum.order.dao;

import java.util.List;

import com.spring.Imuseum.order.OrderPagePVO;
import com.spring.Imuseum.order.OrderVO;
import com.spring.Imuseum.order.ProductShipVO;

public interface OrderDAO {
	
	public OrderPagePVO getPInfo(OrderPagePVO vo);
	
	public void insertOrders(OrderVO vo);
	public void insertOrderProduct(OrderPagePVO pvo);
	public String getOrderNum();
	public OrderVO getOrder(String orderNum);
	public OrderVO getShip(OrderVO vo);
	
	public List<OrderVO> getOrderList(OrderVO vo);
	public List<OrderVO> getSaleList(OrderVO vo);
	public List<OrderVO> getdaySaleList(OrderVO vo);
	public List<OrderVO> getday2SaleList(OrderVO vo);
	public List<OrderVO> getday3SaleList(OrderVO vo);
	public List<OrderVO> getday4SaleList(OrderVO vo);
	public List<OrderVO> getday5SaleList(OrderVO vo);
	
	public void updateShip(ProductShipVO vo);
	
	public void updateOrderCnt(OrderPagePVO pvo);
	public void updateDate();

	public void updateOrder(OrderVO vo);
	
	public void updateStatus(OrderVO vo);
	public void updateShipStatus(OrderVO vo);
	
	public void deleteOrder(OrderVO vo);
	
	public List<OrderPagePVO> getOrderProduct(String orderNum);
	
	public void insertShip(String orderNum);
	
}
