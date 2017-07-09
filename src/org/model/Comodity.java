package org.model;

/**
 * Comodity entity. @author MyEclipse Persistence Tools
 */

public class Comodity implements java.io.Serializable {

	// Fields

	private Integer SId;
	private String name;
	private Double price;
	private String info;

	// Constructors

	/** default constructor */
	public Comodity() {
	}

	/** minimal constructor */
	public Comodity(String name, Double price) {
		this.name = name;
		this.price = price;
	}

	/** full constructor */
	public Comodity(String name, Double price, String info) {
		this.name = name;
		this.price = price;
		this.info = info;
	}

	// Property accessors

	public Integer getSId() {
		return this.SId;
	}

	public void setSId(Integer SId) {
		this.SId = SId;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return this.price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public String getInfo() {
		return this.info;
	}

	public void setInfo(String info) {
		this.info = info;
	}

}