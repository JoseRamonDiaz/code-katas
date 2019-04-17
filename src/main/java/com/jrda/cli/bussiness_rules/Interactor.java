package com.jrda.cli.bussiness_rules;

public class Interactor implements BoundaryInterface {
	Parser p = new Parser();

	@Override
	public boolean existCommand(String command) {
		return p.existCommand(command);
	}

	@Override
	public boolean areCorrectArgs(String fullCommand) throws IlegalCommandException {
		return p.areCorrectArgs(fullCommand);
	}

	@Override
	public String getCommand(String fullCommand) {
		return p.getCommand(fullCommand);
	}

	@Override
	public String[] getArgs(String fullCommand) {
		return p.getArgs(fullCommand);
	}

	@Override
	public String getHelp(String fullCommand) throws IlegalCommandException {
		return getHelp(fullCommand);
	}

}
