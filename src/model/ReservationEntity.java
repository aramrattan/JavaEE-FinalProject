package model;

import javax.persistence.*;

/**
 * Created by aaron on 4/4/17.
 */
@Entity
@Table(name = "RESERVATION", schema = "resort303db", catalog = "")
public class ReservationEntity {
	private int id;
	private String cardname;
	private String cc;
	private String cvv2;
	private Integer enddate;
	private String exp;
	private Byte minibar;
	private Integer roomid;
	private Byte roomservice;
	private Integer startdate;
	private CustomerEntity customerByUserId;

	@Id
	@Column(name = "ID", nullable = false)
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Basic
	@Column(name = "CARDNAME", nullable = true, length = 255)
	public String getCardname() {
		return cardname;
	}

	public void setCardname(String cardname) {
		this.cardname = cardname;
	}

	@Basic
	@Column(name = "CC", nullable = true, length = 255)
	public String getCc() {
		return cc;
	}

	public void setCc(String cc) {
		this.cc = cc;
	}

	@Basic
	@Column(name = "CVV2", nullable = true, length = 255)
	public String getCvv2() {
		return cvv2;
	}

	public void setCvv2(String cvv2) {
		this.cvv2 = cvv2;
	}

	@Basic
	@Column(name = "ENDDATE", nullable = true)
	public Integer getEnddate() {
		return enddate;
	}

	public void setEnddate(Integer enddate) {
		this.enddate = enddate;
	}

	@Basic
	@Column(name = "EXP", nullable = true, length = 255)
	public String getExp() {
		return exp;
	}

	public void setExp(String exp) {
		this.exp = exp;
	}

	@Basic
	@Column(name = "MINIBAR", nullable = true)
	public Byte getMinibar() {
		return minibar;
	}

	public void setMinibar(Byte minibar) {
		this.minibar = minibar;
	}

	@Basic
	@Column(name = "ROOMID", nullable = true)
	public Integer getRoomid() {
		return roomid;
	}

	public void setRoomid(Integer roomid) {
		this.roomid = roomid;
	}

	@Basic
	@Column(name = "ROOMSERVICE", nullable = true)
	public Byte getRoomservice() {
		return roomservice;
	}

	public void setRoomservice(Byte roomservice) {
		this.roomservice = roomservice;
	}

	@Basic
	@Column(name = "STARTDATE", nullable = true)
	public Integer getStartdate() {
		return startdate;
	}

	public void setStartdate(Integer startdate) {
		this.startdate = startdate;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;

		ReservationEntity that = (ReservationEntity) o;

		if (id != that.id) return false;
		if (cardname != null ? !cardname.equals(that.cardname) : that.cardname != null) return false;
		if (cc != null ? !cc.equals(that.cc) : that.cc != null) return false;
		if (cvv2 != null ? !cvv2.equals(that.cvv2) : that.cvv2 != null) return false;
		if (enddate != null ? !enddate.equals(that.enddate) : that.enddate != null) return false;
		if (exp != null ? !exp.equals(that.exp) : that.exp != null) return false;
		if (minibar != null ? !minibar.equals(that.minibar) : that.minibar != null) return false;
		if (roomid != null ? !roomid.equals(that.roomid) : that.roomid != null) return false;
		if (roomservice != null ? !roomservice.equals(that.roomservice) : that.roomservice != null) return false;
		if (startdate != null ? !startdate.equals(that.startdate) : that.startdate != null) return false;

		return true;
	}

	@Override
	public int hashCode() {
		int result = id;
		result = 31 * result + (cardname != null ? cardname.hashCode() : 0);
		result = 31 * result + (cc != null ? cc.hashCode() : 0);
		result = 31 * result + (cvv2 != null ? cvv2.hashCode() : 0);
		result = 31 * result + (enddate != null ? enddate.hashCode() : 0);
		result = 31 * result + (exp != null ? exp.hashCode() : 0);
		result = 31 * result + (minibar != null ? minibar.hashCode() : 0);
		result = 31 * result + (roomid != null ? roomid.hashCode() : 0);
		result = 31 * result + (roomservice != null ? roomservice.hashCode() : 0);
		result = 31 * result + (startdate != null ? startdate.hashCode() : 0);
		return result;
	}

	@ManyToOne
	@JoinColumn(name = "userId", referencedColumnName = "ID")
	public CustomerEntity getCustomerByUserId() {
		return customerByUserId;
	}

	public void setCustomerByUserId(CustomerEntity customerByUserId) {
		this.customerByUserId = customerByUserId;
	}
}
