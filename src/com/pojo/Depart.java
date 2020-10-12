package com.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="depart")
public class Depart {

	@Id
	@GeneratedValue
	@Column(name="did")
	
	@OneToMany(fetch=FetchType.EAGER,mappedBy="Student")
	private int did;
	@Column(name="dname")
	private String dname;
	@Column(name="dphone")
	private String dphone;
	@Column(name="demail")
	private String demail;
	public int getDid() {
		return did;
	}
	public void setDid(int did) {
		this.did = did;
	}
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	public String getDphone() {
		return dphone;
	}
	public void setDphone(String dphone) {
		this.dphone = dphone;
	}
	public String getDemail() {
		return demail;
	}
	public void setDemail(String demail) {
		this.demail = demail;
	}
	
	
}
