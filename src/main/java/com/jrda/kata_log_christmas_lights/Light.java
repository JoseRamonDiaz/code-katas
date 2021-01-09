package com.jrda.kata_log_christmas_lights;

public class Light {
	private int brightness = 0;

	public void on() {
		brightness++;
	}

	public int getBrightness() {
		return brightness;
	}

	public void off() {
		if (brightness > 0)
			brightness--;
	}

	public void toogle() {
		brightness += 2;
	}

}
