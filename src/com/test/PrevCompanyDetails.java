package com.test;

public class PrevCompanyDetails {

	private String prevCompanyName;
	private float precompSalary;

	public String getPrevCompanyName() {
		return prevCompanyName;
	}

	public void setPrevCompanyName(String prevCompanyName) {
		this.prevCompanyName = prevCompanyName;
	}

	public float getPrecompSalary() {
		return precompSalary;
	}

	public void setPrecompSalary(float precompSalary) {
		this.precompSalary = precompSalary;
	}

	@Override
	public String toString() {
		return "PrevCompanyDetails [prevCompanyName=" + prevCompanyName + ", precompSalary=" + precompSalary + "]";
	}

	
}
