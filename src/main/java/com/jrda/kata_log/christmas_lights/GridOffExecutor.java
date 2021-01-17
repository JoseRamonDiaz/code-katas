package com.jrda.kata_log.christmas_lights;

public class GridOffExecutor extends GridExecutor {

	@Override
	protected void action(Light light) {
		light.off();
	}

}
