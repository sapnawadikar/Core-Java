package com.interfaces;

public class SmartHomeTest {
	/*
	 * 3. Smart Home Devices: Create an interface `SmartDevice` with methods
	 * `turnOn()`, `turnOff()`, and `getStatus()`. Implement two classes
	 * `SmartLight` and `SmartFan` to control these devices. Write a program to
	 * manage multiple devices using an array of interface references, turning them
	 * on/off in a loop and displaying statuses.
	 */
	public static void main(String[] args) {
		SmartDevice[] devices = { new SmartLight(), new SmartFan() };
		for (SmartDevice device : devices) {
			device.turnOn();
			System.out.println(device.getStatus());
			device.turnOff();
			System.out.println(device.getStatus());
		}
	}
}
