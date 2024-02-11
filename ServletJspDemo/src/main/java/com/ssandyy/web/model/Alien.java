package com.ssandyy.web.model;

public class Alien {
	private int aidtest;
	private String anametest;
	private String asaltest;
	
	public int getAidtest() {
		return aidtest;
	}
	public void setAidtest(int aidtest) {
		this.aidtest = aidtest;
	}
	public String getAnametest() {
		return anametest;
	}
	public void setAnametest(String anametest) {
		this.anametest = anametest;
	}
	public String getAsaltest() {
		return asaltest;
	}
	public void setAsaltest(String asaltest) {
		this.asaltest = asaltest;
	}
	@Override
	public String toString() {
		return "Alien [aidtest=" + aidtest + ", anametest=" + anametest + ", asaltest=" + asaltest + "]";
	}
	public Alien() {
		super();
		// TODO Auto-generated constructor stub
	} 
	
	
}
