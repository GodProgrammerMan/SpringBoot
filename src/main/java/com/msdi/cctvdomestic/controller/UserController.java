package com.msdi.cctvdomestic.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.msdi.cctvdomestic.entity.User;
import com.msdi.cctvdomestic.service.UserService;

import springfox.documentation.annotations.ApiIgnore;

@Controller
@RequestMapping("/user")
public class UserController {
	@Autowired
	private UserService userService;

	/**
	 * 查找User
	 * 
	 * @return user
	 */
	@ApiIgnore
	@RequestMapping("/findUser")
	@ResponseBody
	public User findUser() {
		User user = this.userService.findUser("苗人凤");
		return user;
	}

	/**
	 * 查找所有User
	 * 
	 * @return user
	 */
	@ApiIgnore
	@RequestMapping("/findAllUser")
	@ResponseBody
	public List<User> findAllUser() {
		List<User> user = this.userService.findAllUser();
		return user;
	}

	/**
	 * 
	 * 分页查找
	 */
	@ApiIgnore
	@RequestMapping("/findPageUser")
	@ResponseBody
	public List<User> findUser(@RequestParam("pageNum") Integer pageNum, @RequestParam("pageSize") Integer pageSize) {
		if (null == pageNum) {
			pageNum = 1;
		}
		if (null == pageSize) {
			pageSize = 2;
		}
		List<User> user = this.userService.findPageUser(pageNum, pageSize);
		return user;
	}
}
