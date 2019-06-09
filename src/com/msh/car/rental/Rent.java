package com.msh.car.rental;

import java.util.Date;

public class Rent {
	private int rentId;
	private Date rentDate;
	private int carId;
 	private int customerId;
	private int rentDays;
	
	public Rent(int rentId, Date rentDate, int carId, int customerId, int rentDays) {
		super();
		this.rentId = rentId;
		this.rentDate = rentDate;
		this.carId = carId;
		this.customerId = customerId;
		this.rentDays = rentDays;
	}
	
	public int getRentId() {
		return rentId;
	}
	public void setRentId(int rentId) {
		this.rentId = rentId;
	}
	public Date getRentDate() {
		return rentDate;
	}
	public void setRentDate(Date rentDate) {
		this.rentDate = rentDate;
	}
	public int getCarId() {
		return carId;
	}
	public void setCarId(int carId) {
		this.carId = carId;
	}
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public int getRentDays() {
		return rentDays;
	}
	public void setRentDays(int rentDays) {
		this.rentDays = rentDays;
	}
	
	
	
}
