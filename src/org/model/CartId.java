package org.model;

/**
 * CartId entity. @author MyEclipse Persistence Tools
 */

public class CartId implements java.io.Serializable {

	// Fields

	private Integer gid;
	private Integer sid;
	private Integer uid;

	// Constructors

	/** default constructor */
	public CartId() {
	}

	/** full constructor */
	public CartId(Integer gid, Integer sid, Integer uid) {
		this.gid = gid;
		this.sid = sid;
		this.uid = uid;
	}

	// Property accessors

	public Integer getGid() {
		return this.gid;
	}

	public void setGid(Integer gid) {
		this.gid = gid;
	}

	public Integer getSid() {
		return this.sid;
	}

	public void setSid(Integer sid) {
		this.sid = sid;
	}

	public Integer getUid() {
		return this.uid;
	}

	public void setUid(Integer uid) {
		this.uid = uid;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof CartId))
			return false;
		CartId castOther = (CartId) other;

		return ((this.getGid() == castOther.getGid())
				|| (this.getGid() != null && castOther.getGid() != null && this.getGid().equals(castOther.getGid())))
				&& ((this.getSid() == castOther.getSid()) || (this.getSid() != null && castOther.getSid() != null
						&& this.getSid().equals(castOther.getSid())))
				&& ((this.getUid() == castOther.getUid()) || (this.getUid() != null && castOther.getUid() != null
						&& this.getUid().equals(castOther.getUid())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getGid() == null ? 0 : this.getGid().hashCode());
		result = 37 * result + (getSid() == null ? 0 : this.getSid().hashCode());
		result = 37 * result + (getUid() == null ? 0 : this.getUid().hashCode());
		return result;
	}

}