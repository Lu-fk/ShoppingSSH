package org.model;

/**
 * DdId entity. @author MyEclipse Persistence Tools
 */

public class DdId implements java.io.Serializable {

	// Fields

	private Integer DId;
	private Integer UId;

	// Constructors

	/** default constructor */
	public DdId() {
	}

	/** full constructor */
	public DdId(Integer DId, Integer UId) {
		this.DId = DId;
		this.UId = UId;
	}

	// Property accessors

	public Integer getDId() {
		return this.DId;
	}

	public void setDId(Integer DId) {
		this.DId = DId;
	}

	public Integer getUId() {
		return this.UId;
	}

	public void setUId(Integer UId) {
		this.UId = UId;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof DdId))
			return false;
		DdId castOther = (DdId) other;

		return ((this.getDId() == castOther.getDId())
				|| (this.getDId() != null && castOther.getDId() != null && this.getDId().equals(castOther.getDId())))
				&& ((this.getUId() == castOther.getUId()) || (this.getUId() != null && castOther.getUId() != null
						&& this.getUId().equals(castOther.getUId())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getDId() == null ? 0 : this.getDId().hashCode());
		result = 37 * result + (getUId() == null ? 0 : this.getUId().hashCode());
		return result;
	}

}