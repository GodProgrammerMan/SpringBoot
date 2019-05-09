package com.msdi.cctvdomestic.dao;

import java.util.List;

import com.msdi.cctvdomestic.entity.User;

/**
 * 
 * <p>
 * Title: userMapper接口
 * </p>
 * <p>
 * Description:userMapper接口
 * </p>
 * 
 * @author 梁泽祥
 * @date 2019年5月9日
 */
public interface UserMapper {

	public User findUser(String username);

	public List<User> findAllUser();

	public int update(User user);
}
