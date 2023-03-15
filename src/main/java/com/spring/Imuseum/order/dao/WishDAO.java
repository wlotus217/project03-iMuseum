package com.spring.Imuseum.order.dao;

import java.util.List;

import com.spring.Imuseum.order.WishVO;

public interface WishDAO {
	public List<WishVO> getWishList(WishVO vo);
	public int getWishCnt(String id);
	public int insertWish(WishVO vo);
	public int deleteWish(WishVO vo);
	public WishVO wishCheck(WishVO vo);
	public void deleteMyWish(int wishNum);
}
