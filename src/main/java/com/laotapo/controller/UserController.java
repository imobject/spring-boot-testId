package com.laotapo.controller;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.laotapo.common.dto.ApiReturn;
import com.laotapo.modules.user.entity.User;

import io.swagger.annotations.Api;

/**
 * @author 作者 E-mail: lcm
 * @date 创建时间：2016年9月27日 下午3:33:22
 * @version 1.0
 * @parameter
 * @since
 * @return
 */
@Api(value = "用户列表")
@EnableAutoConfiguration
@RestController
@RequestMapping("/user")
public class UserController {

	@RequestMapping("/{id}/{name}")
	public ApiReturn view(@PathVariable("id") Long id, @PathVariable("name") String name) {
		User user = new User();
		ApiReturn apiReturn = new ApiReturn();
		user.setId(id);
		user.setName(name);
		apiReturn.setCode("0000");
		apiReturn.setMessage(user.getName());
		apiReturn.setDescription(user.getId().toString());
		return apiReturn;

	}

	
	

}
