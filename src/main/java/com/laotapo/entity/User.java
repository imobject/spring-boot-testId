package com.laotapo.entity;

import java.io.Serializable;

/**
 * <p>User: lcm
 * <p>Date: 16-09-27
 * <p>Version: 1.0
 */
public class User implements Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1752462789674994745L;
	private Long id;
    private String name;
    
    
    public User(){
    	
    }
    public User(String name,Long id) {
		super();
		this.id = id;
		this.name = name;
	}

	public Long getId() {
        return id;
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
}
