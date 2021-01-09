package com.jrda.kata_log_christmas_lights;

public class Light {
	private boolean isOn = false;

	public void on() {
		isOn = true;
	}

	public boolean isOn() {
		return isOn;
	}

	public void off() {
		isOn = false;
	}

	public void toogle() {
		isOn = !isOn;
	}

}
