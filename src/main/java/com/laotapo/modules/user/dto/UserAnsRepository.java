package com.laotapo.modules.user.dto;

import org.springframework.data.jpa.repository.JpaRepository;

import com.laotapo.modules.exam.entity.ExamUserAns;


/** 
 * @author  作者 E-mail: lcm
 * @date 创建时间：2016年11月24日 上午11:23:09 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 */
public interface UserAnsRepository extends JpaRepository<ExamUserAns, Integer> {
	
}


