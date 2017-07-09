package org.model;

/**
 * Cart entity. @author MyEclipse Persistence Tools
 */

public class Cart implements java.io.Serializable {

	// Fields

	private CartId id;
	private String name;
	private Double price;
	private Integer num;
	private Double nprice;

	// Constructors

	/** default constructor */
	public Cart() {
	}

	/** minimal constructor */
	public Cart(CartId id, String name, Double price) {
		this.id = id;
		this.name = name;
		this.price = price;
	}

	/** full constructor */
	public Cart(CartId id, String name, Double price, Integer num, Double nprice) {
		this.id = id;
		this.name = name;
		this.price = price;
		this.num = num;
		this.nprice = nprice;
	}

	// Property accessors

	public CartId getId() {
		return this.id;
	}

	public void setId(CartId id) {
		this.id = id;
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

	public Integer getNum() {
		return this.num;
	}

	public void setNum(Integer num) {
		this.num = num;
	}

	public Double getNprice() {
		return this.nprice;
	}

	public void setNprice(Double nprice) {
		this.nprice = nprice;
	}

}