package com.msdi.cctvdomestic.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.msdi.cctvdomestic.dao.UserMapper;
import com.msdi.cctvdomestic.entity.User;
import com.msdi.cctvdomestic.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserMapper userMapper;

	@Override
	public User findUser(String username) {
		return this.userMapper.findUser(username);
	}

	@Override
	@Transactional
	public List<User> findPageUser(Integer pageNum, Integer pageSize) {
		User user = new User();
		user.setId(1);
		user.setPassWord("12345");
		int num = this.userMapper.update(user);
		User u = new User();
		u.setId(2);
		u.setPassWord("111");
		int num1 = this.userMapper.update(u);
		// 手动异常，测试事务是否可用。可用！！！
		// System.out.println(1 / 0);
		User uu = new User();
		uu.setId(2);
		uu.setPassWord("121");
		int num2 = this.userMapper.update(uu);
		PageHelper.startPage(pageNum, pageSize);
		List<User> users = this.userMapper.findAllUser();
		PageInfo<User> pageInfo = new PageInfo<User>(users);
		return pageInfo.getList();
	}

	@Override
	public List<User> findAllUser() {
		return this.userMapper.findAllUser();
	}
}
