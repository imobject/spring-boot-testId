package com.laotapo.modules.user.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * @author 作者 E-mail: lcm
 * @date 创建时间：2016年11月24日 上午11:19:24
 * @version 1.0
 * @parameter
 * @since
 * @return
 */
@Entity
public class User {
	@Id
	@GeneratedValue
	private Long id;

	@Column(nullable = false)
	private String name;

	@Column(nullable = false)
	private Integer age;

	public Long getId() {
		return id;
	}

	public User() {

	}

	public User(String name, Integer age) {
		this.age = age;
		this.name = name;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

}
