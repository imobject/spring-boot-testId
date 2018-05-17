package com.laotapo.modules.exam.dto;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.laotapo.modules.exam.entity.Exam;
import com.laotapo.modules.user.entity.User;


/** 
 * @author  作者 E-mail: lcm
 * @date 创建时间：2016年11月24日 上午11:23:09 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 */
public interface ExamRepository extends JpaRepository<Exam, Integer> {
	
    @Query("from Exam e where e.userId=:userId")
    User findUser(@Param("userId") Integer userId);

}


