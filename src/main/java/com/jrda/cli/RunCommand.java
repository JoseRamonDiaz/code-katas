package com.jrda.cli;

public class RunCommand implements Command {
	private String help = "run a something \n"
			+ "run <something_to_run>";

	@Override
	public boolean areCorrectArgs(String[] args) {
		return args.length == 1 ? true : false;
	}

	@Override
	public String getHelp() {
		return help;
	}

}
