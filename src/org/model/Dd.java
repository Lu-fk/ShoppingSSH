package org.model;

import java.util.Date;

/**
 * Dd entity. @author MyEclipse Persistence Tools
 */

public class Dd implements java.io.Serializable {

	// Fields

	private DdId id;
	private Integer GId;
	private Date time;
	private Double nprice;

	// Constructors

	/** default constructor */
	public Dd() {
	}

	/** minimal constructor */
	public Dd(DdId id, Integer GId, Double nprice) {
		this.id = id;
		this.GId = GId;
		this.nprice = nprice;
	}

	/** full constructor */
	public Dd(DdId id, Integer GId, Date time, Double nprice) {
		this.id = id;
		this.GId = GId;
		this.time = time;
		this.nprice = nprice;
	}

	// Property accessors

	public DdId getId() {
		return this.id;
	}

	public void setId(DdId id) {
		this.id = id;
	}

	public Integer getGId() {
		return this.GId;
	}

	public void setGId(Integer GId) {
		this.GId = GId;
	}

	public Date getTime() {
		return this.time;
	}

	public void setTime(Date time) {
		this.time = time;
	}

	public Double getNprice() {
		return this.nprice;
	}

	public void setNprice(Double nprice) {
		this.nprice = nprice;
	}

}