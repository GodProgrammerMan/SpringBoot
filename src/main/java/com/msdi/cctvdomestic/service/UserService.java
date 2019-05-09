package com.msdi.cctvdomestic.service;

import java.util.List;

import com.msdi.cctvdomestic.entity.User;

public interface UserService {
	/**
	 * 根据名称查找用户信息
	 * 
	 * @param username
	 * @return
	 */
	User findUser(String username);

	/**
	 * 分页获取用户数据
	 * 
	 * @param pageNum
	 * @param pageSize
	 * @return
	 */
	List<User> findPageUser(Integer pageNum, Integer pageSize);

	/**
	 * 查所有用户
	 * 
	 * @return
	 */
	List<User> findAllUser();
}
