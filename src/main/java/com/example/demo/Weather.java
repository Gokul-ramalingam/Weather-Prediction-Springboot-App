package com.example.demo;

public class Weather {

	String city;
	String state;
	String clim;
	int degh;
	int degl;
	String img;
	Monday mon;
	Tuesday tue;
	Wednesday wed;
	Thursday thu;
	Friday fri;
	Saturday sat;
	Sunday sun;
	
	public Weather(String city, String state, String clim, int degh, int degl, String img, Monday mon, Tuesday tue,
			Wednesday wed, Thursday thu, Friday fri, Saturday sat, Sunday sun) {
		super();
		this.city = city;
		this.state = state;
		this.clim = clim;
		this.degh = degh;
		this.degl = degl;
		this.img = img;
		this.mon = mon;
		this.tue = tue;
		this.wed = wed;
		this.thu = thu;
		this.fri = fri;
		this.sat = sat;
		this.sun = sun;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getClim() {
		return clim;
	}
	public void setClim(String clim) {
		this.clim = clim;
	}
	public int getDegh() {
		return degh;
	}
	public void setDegh(int degh) {
		this.degh = degh;
	}
	public int getDegl() {
		return degl;
	}
	public void setDegl(int degl) {
		this.degl = degl;
	}
	public String getImg() {
		return img;
	}
	public void setImg(String img) {
		this.img = img;
	}
	public Monday getMon() {
		return mon;
	}
	public void setMon(Monday mon) {
		this.mon = mon;
	}
	public Tuesday getTue() {
		return tue;
	}
	public void setTue(Tuesday tue) {
		this.tue = tue;
	}
	public Wednesday getWed() {
		return wed;
	}
	public void setWed(Wednesday wed) {
		this.wed = wed;
	}
	public Thursday getThu() {
		return thu;
	}
	public void setThu(Thursday thu) {
		this.thu = thu;
	}
	public Friday getFri() {
		return fri;
	}
	public void setFri(Friday fri) {
		this.fri = fri;
	}
	public Saturday getSat() {
		return sat;
	}
	public void setSat(Saturday sat) {
		this.sat = sat;
	}
	public Sunday getSun() {
		return sun;
	}
	public void setSun(Sunday sun) {
		this.sun = sun;
	}
}
