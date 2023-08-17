package com.scaler.advanced.code;

public class Triple<FIRST_TYPE,SECOND_TYPE,THIRD_TYPE> {
	private FIRST_TYPE x;
	private SECOND_TYPE y;
	private THIRD_TYPE z;
	public Triple(FIRST_TYPE x, SECOND_TYPE y, THIRD_TYPE z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}
	public FIRST_TYPE getFirst() {
		return x;
	}
	public SECOND_TYPE getSecond() {
		return y;
	}
	public THIRD_TYPE getThird() {
		return z;
	}
}
