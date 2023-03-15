package com.spring.Imuseum.order.dao;

import java.util.List;

import com.spring.Imuseum.order.CartVO;

public interface CartDAO {

	public List<CartVO> getCartList(CartVO vo);
	public int getCartCnt(CartVO vo);
	public int cntCheck(CartVO vo);
	public int insertCart(CartVO vo);
	public void updateCart(CartVO vo);
	public int deleteCart(int cartNum);
	public int deleteCartSoldout(String id);
	public CartVO cartCheck(CartVO vo);
	public CartVO getOneCart(int cartNum);
	
}
