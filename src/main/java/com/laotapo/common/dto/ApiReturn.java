package com.laotapo.common.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/** 
 * @author  作者 E-mail: lcm
 * @date 创建时间：2016年11月16日 上午11:45:17 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 */

@ApiModel(value="API返回对象,大部分操作返回此返回值")
public class ApiReturn {
	
	@ApiModelProperty(required = true,value="返回码,一般0000为操作正常 错误时返回其他返回码",position = 1,example="0000")
	private String code;
	
	@ApiModelProperty(required = false,value="错误信息,一般情况下返回码不为0000时有值",position = 2)
	private String message;
	
	@ApiModelProperty(required = false,value="错误信息描述信息,一般情况下返回码不为0000时有值",position =3)
	private String description;

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	

}


