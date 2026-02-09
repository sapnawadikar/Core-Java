package com.interfaces;

public class SmartFan implements SmartDevice {
	private boolean on;

	public void turnOn() {
		on = true;
	}

	public void turnOff() {
		on = false;
	}

	public String getStatus() {
		return on ? "Fan is ON" : "Fan is OFF";
	}
}
