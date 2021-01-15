package com.jrda.kata_log_christmas_lights;

public class GridToggleExecutor extends GridExecutor {

	@Override
	protected void action(Light light) {
		light.toogle();
	}

}
