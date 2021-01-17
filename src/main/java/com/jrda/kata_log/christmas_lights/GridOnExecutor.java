package com.jrda.kata_log.christmas_lights;

public class GridOnExecutor extends GridExecutor {

	@Override
	protected void action(Light light) {
		light.on();
	}

}
