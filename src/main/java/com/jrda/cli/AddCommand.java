package com.jrda.cli;

public class AddCommand implements Command {
	private String help =  "add text from one file to other \n"
			+ "add <source_file> <destiny_file>";
	
	@Override
	public boolean areCorrectArgs(String[] args) {
		return args.length == 2 ? true : false;
	}

	@Override
	public String getHelp() {
		return help;
	}

}
