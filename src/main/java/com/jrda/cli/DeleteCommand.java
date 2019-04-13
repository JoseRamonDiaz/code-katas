package com.jrda.cli;

public class DeleteCommand implements Command {
	private String help = "delete a file \n"
			+ "delete <file_to_delete>";

	@Override
	public boolean areCorrectArgs(String[] args) {
		return args.length == 1 ? true : false;
	}

	@Override
	public String getHelp() {
		return help;
	}

}
