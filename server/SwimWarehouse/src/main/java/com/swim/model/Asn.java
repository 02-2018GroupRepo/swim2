package com.swim.model;

public class Asn {

	private int asnid;
	private String vendorId;
	private String expectedArrivalDate;
	private String expectedArrivalTime;
	private String status;

	// No Args Constructor
	public Asn() {
	}
	
	// Getters and Setter
	public int getAsnid() {
		return asnid;
	}

	public void setAsnid(int asnid) {
		this.asnid = asnid;
	}

	public String getVendorId() {
		return vendorId;
	}

	public void setVendorId(String vendorId) {
		this.vendorId = vendorId;
	}

	public String getExpectedArrivalDate() {
		return expectedArrivalDate;
	}

	public void setExpectedArrivalDate(String expectedArrivalDate) {
		this.expectedArrivalDate = expectedArrivalDate;
	}

	public String getExpectedArrivalTime() {
		return expectedArrivalTime;
	}

	public void setExpectedArrivalTime(String expectedArrivalTime) {
		this.expectedArrivalTime = expectedArrivalTime;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}



}
