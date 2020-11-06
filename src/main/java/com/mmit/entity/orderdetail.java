package com.mmit.entity;

import java.io.Serializable;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

@Entity
public class orderdetail implements Serializable {
	private static final long serialVersionUID = 1L;
	@EmbeddedId
	private orderdetailPK id;
	private int subQty;
	private int subPrice;
	public orderdetailPK getId() {
		return id;
	}
	public void setId(orderdetailPK id) {
		this.id = id;
	}
	public int getSubQty() {
		return subQty;
	}
	public void setSubQty(int subQty) {
		this.subQty = subQty;
	}
	public int getSubPrice() {
		return subPrice;
	}
	public void setSubPrice(int subPrice) {
		this.subPrice = subPrice;
	}
	
}
