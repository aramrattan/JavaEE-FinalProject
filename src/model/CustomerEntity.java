package model;

import javax.persistence.*;

/**
 * Created by aaron on 4/4/17.
 */
@Entity
@NamedQuery(name="Customer.insertOne", query="INSERT INTO Customer (email, fullname, passphrase) VALUES (a ,b, c)")
@Table(name = "CUSTOMER", schema = "resort303db", catalog = "")
public class CustomerEntity {
	private int id;
	private String email;
	private String fullname;
	private String passphrase;

	@Id
	@Column(name = "ID", nullable = false)
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Basic
	@Column(name = "EMAIL", nullable = true, length = 255)
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Basic
	@Column(name = "FULLNAME", nullable = true, length = 255)
	public String getFullname() {
		return fullname;
	}

	public void setFullname(String fullname) {
		this.fullname = fullname;
	}

	@Basic
	@Column(name = "PASSPHRASE", nullable = true, length = 255)
	public String getPassphrase() {
		return passphrase;
	}

	public void setPassphrase(String passphrase) {
		this.passphrase = passphrase;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;

		CustomerEntity that = (CustomerEntity) o;

		if (id != that.id) return false;
		if (email != null ? !email.equals(that.email) : that.email != null) return false;
		if (fullname != null ? !fullname.equals(that.fullname) : that.fullname != null) return false;
		if (passphrase != null ? !passphrase.equals(that.passphrase) : that.passphrase != null) return false;

		return true;
	}

	@Override
	public int hashCode() {
		int result = id;
		result = 31 * result + (email != null ? email.hashCode() : 0);
		result = 31 * result + (fullname != null ? fullname.hashCode() : 0);
		result = 31 * result + (passphrase != null ? passphrase.hashCode() : 0);
		return result;
	}
}
