package com.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Student")
public class Student {

	@Id
	@GeneratedValue
	@Column(name = "sid")
	private int sid;
	@Column(name = "sfname")
	private String sfname;
	@Column(name = "slname")
	private String slname;
	@Column(name = "sfaname")
	private String sfaname;
	@Column(name = "smname")
	private String smname;
	@Column(name = "semail")
	private String semail;
	@Column(name = "sphone")
	private String sphone;
	@Column(name = "saddress")
	private String saddress;
	@Column(name = "sdateofbirth")
	private String sdateofbirth;

	public String getSdateofbirth() {
		return sdateofbirth;
	}

	public void setSdateofbirth(String sdateofbirth) {
		this.sdateofbirth = sdateofbirth;
	}

	@ManyToOne
	@JoinColumn(name="did")
	Depart d;
	
	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getSfname() {
		return sfname;
	}

	public void setSfname(String sfname) {
		this.sfname = sfname;
	}

	public String getSlname() {
		return slname;
	}

	public void setSlname(String slname) {
		this.slname = slname;
	}

	public String getSfaname() {
		return sfaname;
	}

	public void setSfaname(String sfaname) {
		this.sfaname = sfaname;
	}

	public String getSmname() {
		return smname;
	}

	public void setSmname(String smname) {
		this.smname = smname;
	}

	public String getSemail() {
		return semail;
	}

	public void setSemail(String semail) {
		this.semail = semail;
	}

	public String getSphone() {
		return sphone;
	}

	public void setSphone(String sphone) {
		this.sphone = sphone;
	}

	public String getSaddress() {
		return saddress;
	}

	public void setSaddress(String saddress) {
		this.saddress = saddress;
	}

	public Depart getD() {
		return d;
	}

	public void setD(Depart d) {
		this.d = d;
	}
	
	
	
	
	

}
