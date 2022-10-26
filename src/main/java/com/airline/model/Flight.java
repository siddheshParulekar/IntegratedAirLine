package com.airline.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;



@Entity 
@Table(name="FlightDetails")
public class Flight {
	@Id
	private long flightNo;
	private String source;
	private String destinatin; 
	private String arrival_time;
	private String departure_time;
	private String flight_duration;
	private String ecomonySeat;
	private String businessSeat;
	private float ecomonyPrice;
	private float businessPrice;
	private int availableSeat;
	
	public long getFlightNo() {
		return flightNo;
		
	}
	public void setFlightNo(long flightNo) {
		this.flightNo = flightNo;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getDestinatin() {
		return destinatin;
	}
	public void setDestinatin(String destinatin) {
		this.destinatin = destinatin;
	}
	public String getArrival_time() {
		return arrival_time;
	}
	public void setArrival_time(String arrival_time) {
		this.arrival_time = arrival_time;
	}
	public String getDeparture_time() {
		return departure_time;
	}
	public void setDeparture_time(String departure_time) {
		this.departure_time = departure_time;
	}
	public String getFlight_duration() {
		return flight_duration;
	}
	public void setFlight_duration(String flight_duration) {
		this.flight_duration = flight_duration;
	}
	public String getEcomonySeat() {
		return ecomonySeat;
	}
	public void setEcomonySeat(String ecomonySeat) {
		this.ecomonySeat = ecomonySeat;
	}
	public String getBusinessSeat() {
		return businessSeat;
	}
	public void setBusinessSeat(String businessSeat) {
		this.businessSeat = businessSeat;
	}
	public float getEcomonyPrice() {
		return ecomonyPrice;
	}
	public void setEcomonyPrice(float ecomonyPrice) {
		this.ecomonyPrice = ecomonyPrice;
	}
	public float getBusinessPrice() {
		return businessPrice;
	}
	public void setBusinessPrice(float businessPrice) {
		this.businessPrice = businessPrice;
	}
	public int getAvailableSeat() {
		return availableSeat;
	}
	public void setAvailableSeat(int availableSeat) {
		this.availableSeat = availableSeat;
	}
	
	

}
