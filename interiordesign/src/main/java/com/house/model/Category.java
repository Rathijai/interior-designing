

package com.house.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Transient;



@Entity(name="Category")
public class Category 
{

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int cid;
	public int getCid() {
		return cid;
	}



	public void setCid(int cid) {
		this.cid = cid;
	}



	public String getCname() {
		return cname;
	}



	public void setCname(String cname) {
		this.cname = cname;
	}



	public String getCdesc() {
		return cdesc;
	}



	public void setCdesc(String cdesc) {
		this.cdesc = cdesc;
	}



	@Column
	private String cname;
	
	@Column
	private String cdesc;

	
	
	
	}
