package com.jrda.cli.bussiness_rules;

public class UpdateCommand implements Command {
	private String help = "update a file content \n"
			+ "update <file_to_update>";

	@Override
	public boolean areCorrectArgs(String[] args) {
		return args.length == 1 ? true : false;
	}

	@Override
	public String getHelp() {
		return help;
	}

}
