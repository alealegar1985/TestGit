package com.gara;

public class TestClass {

	String masterval4;
	
	public String getMasterval4() {
		return masterval4;
	}

	public void setMasterval4(String masterval4) {
		this.masterval4 = masterval4;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

	@Override
	public boolean equals(Object arg0) {
		// TODO Auto-generated method stub
		return super.equals(arg0);
	}

	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		super.finalize();
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}

	@Override
	public String toString() {
		// Master change 2
		return super.toString() ;
	}

}
