package com.laotapo.modules.user.dto;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.laotapo.modules.user.entity.User;


/** 
 * @author  作者 E-mail: lcm
 * @date 创建时间：2016年11月24日 上午11:23:09 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 */
public interface UserRepository extends JpaRepository<User, Long> {
	
	User findByName(String name);

    User findByNameAndAge(String name, Integer age);
    

    @Query("from User u where u.name=:name")
    User findUser(@Param("name") String name);


}


