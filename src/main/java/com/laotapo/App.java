package com.laotapo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/** 
 * @author  作者 E-mail: lcm
 * @date 创建时间：2016年9月27日 下午3:38:35 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 */

@EnableAutoConfiguration
@Configuration
@ComponentScan
public class App {

	public static void main(String[] args) {
		SpringApplication.run(App.class);

	}

}
