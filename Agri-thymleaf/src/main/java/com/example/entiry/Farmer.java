package com.example.entiry;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table(name="farmer")
public class Farmer {
	@Id
	@GeneratedValue( strategy = GenerationType.IDENTITY)
	private int productId ;
	private String productname;
	private double minPrice ;
	private String  endDate ;
	private int quantity ;
	@Lob
	@Column(columnDefinition = "MEDIUMBLOB")
	private String img ;
	
	@Column(name="status")
	private boolean status=false;
	
	@Column(name="highestBid")
	private double highestBid=0.0;
	@Column(name="winnerId")
	private String winnerId;
	
	
	
	
	@ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "register_id", nullable = false)
	@JsonIgnoreProperties("farmer")
	private Register register ;


	public Farmer() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Farmer(int productId, String productname, double minPrice, String endDate, int quantity, String img,
			boolean status, double highestBid, String winnerId ,Register register) {
		super();
		this.productId = productId;
		this.productname = productname;
		this.minPrice = minPrice;
		this.endDate = endDate;
		this.quantity = quantity;
		this.img = img;
		this.status = status;
		this.highestBid = highestBid;
		this.winnerId = winnerId;
		this.register = register ;
	}


	public int getProductId() {
		return productId;
	}


	public void setProductId(int productId) {
		this.productId = productId;
	}


	public String getProductname() {
		return productname;
	}


	public void setProductname(String productname) {
		this.productname = productname;
	}


	public double getMinPrice() {
		return minPrice;
	}


	public void setMinPrice(double minPrice) {
		this.minPrice = minPrice;
	}


	public String getEndDate() {
		return endDate;
	}


	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}


	public int getQuantity() {
		return quantity;
	}


	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}


	public String getImg() {
		return img;
	}


	public void setImg(String img) {
		this.img = img;
	}


	public boolean isStatus() {
		return status;
	}


	public void setStatus(boolean status) {
		this.status = status;
	}


	public double getHighestBid() {
		return highestBid;
	}


	public void setHighestBid(double highestBid) {
		this.highestBid = highestBid;
	}


	public String getWinnerId() {
		return winnerId;
	}


	public void setWinnerId(String winnerId) {
		this.winnerId = winnerId;
	}

	@JsonIgnore
	public Register getRegister() {
		return register;
	}

	@JsonProperty
	public void setRegister(Register register) {
		this.register = register;
	}


	@Override
	public String toString() {
		return "Farmer [productId=" + productId + ", productname=" + productname + ", minPrice=" + minPrice
				+ ", endDate=" + endDate + ", quantity=" + quantity + ", img=" + img + ", status=" + status
				+ ", highestBid=" + highestBid + ", winnerId=" + winnerId + ", register=" + register + "]";
	}
	
	

}
