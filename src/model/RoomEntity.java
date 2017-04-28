package model;

import javax.persistence.*;

/**
 * Created by aaron on 4/4/17.
 */
@Entity
@Table(name = "ROOM", schema = "resort303db", catalog = "")
public class RoomEntity {
	private int id;
	private Long price;
	private String roomdesc;
	private String roomimage;
	private String roomname;

	@Id
	@Column(name = "ID", nullable = false)
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Basic
	@Column(name = "PRICE", nullable = true, precision = 0)
	public Long getPrice() {
		return price;
	}

	public void setPrice(Long price) {
		this.price = price;
	}

	@Basic
	@Column(name = "ROOMDESC", nullable = true, length = 255)
	public String getRoomdesc() {
		return roomdesc;
	}

	public void setRoomdesc(String roomdesc) {
		this.roomdesc = roomdesc;
	}

	@Basic
	@Column(name = "ROOMIMAGE", nullable = true, length = 255)
	public String getRoomimage() {
		return roomimage;
	}

	public void setRoomimage(String roomimage) {
		this.roomimage = roomimage;
	}

	@Basic
	@Column(name = "ROOMNAME", nullable = true, length = 255)
	public String getRoomname() {
		return roomname;
	}

	public void setRoomname(String roomname) {
		this.roomname = roomname;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;

		RoomEntity that = (RoomEntity) o;

		if (id != that.id) return false;
		if (price != null ? !price.equals(that.price) : that.price != null) return false;
		if (roomdesc != null ? !roomdesc.equals(that.roomdesc) : that.roomdesc != null) return false;
		if (roomimage != null ? !roomimage.equals(that.roomimage) : that.roomimage != null) return false;
		if (roomname != null ? !roomname.equals(that.roomname) : that.roomname != null) return false;

		return true;
	}

	@Override
	public int hashCode() {
		int result = id;
		result = 31 * result + (price != null ? price.hashCode() : 0);
		result = 31 * result + (roomdesc != null ? roomdesc.hashCode() : 0);
		result = 31 * result + (roomimage != null ? roomimage.hashCode() : 0);
		result = 31 * result + (roomname != null ? roomname.hashCode() : 0);
		return result;
	}
}
