package com.interfaces;

public class SmartLight implements SmartDevice {
	private boolean on;

	public void turnOn() {
		on = true;
	}

	public void turnOff() {
		on = false;
	}

	public String getStatus() {
		return on ? "Light is ON" : "Light is OFF";
	}
}
