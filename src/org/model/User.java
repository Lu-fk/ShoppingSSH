package org.model;

/**
 * User entity. @author MyEclipse Persistence Tools
 */

public class User implements java.io.Serializable {

	// Fields

	private Integer id;
	private String name;
	private String psw;
	private Integer count;

	// Constructors

	/** default constructor */
	public User() {
	}

	/** full constructor */
	public User(String name, String psw) {
		this.name = name;
		this.psw = psw;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPsw() {
		return this.psw;
	}

	public void setPsw(String psw) {
		this.psw = psw;
	}
	
	public Integer getCount() {
		return this.count;
	}

	public void setCount(Integer count) {
		this.count = count;
	}

}