package com.capg.JpaDemo;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Trainingdemo
{
	@Id
	private int Tid;
	private String Tname;
	private String Seats;
	public int getTid() {
		return Tid;
	}
	public String getTname() {
		return Tname;
	}
	public void setTname(String tname) {
		Tname = tname;
	}
	public String getSeats() {
		return Seats;
	}
	public void setSeats(String seats) {
		Seats = seats;
	}
	public void setTid(int tid) {
		Tid = tid;
	}
	@Override
	public String toString() {
		return "Training [Tid=" + Tid + ", Tname=" + Tname + ", Seats=" + Seats + "]";
	}
	
	
}
