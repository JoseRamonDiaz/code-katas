package com.jrda.cli;

import java.util.Arrays;

public class Parser {
	EntityDbGateway entityDbGateway;
	
	public boolean existCommand(String command) {
		for(CommandsList enumCommand: CommandsList.values()) {
			if(command.equalsIgnoreCase(enumCommand.toString())) {
				return true;
			}
		}
		return false;
	}
	
	public boolean areCorrectArgs(String fullCommand) throws IlegalCommandException {
		String command = getCommand(fullCommand);
		CommandFactory argsVerifierFactory = new CommandFactory();
		Command argsVerifier = argsVerifierFactory.createCommand(CommandsList.valueOf(command.toUpperCase()));
		return argsVerifier.areCorrectArgs(getArgs(fullCommand));
	}
	
	public String getCommand(String fullCommand) {
		String[] array = splitCommand(fullCommand);
		String command = array[0];
		return command;
	}
	
	public String[] getArgs(String fullCommand) {
		String[] array = splitCommand(fullCommand);
		return Arrays.copyOfRange(array, 1, array.length);
	}
	
	private String[] splitCommand(String fullCommand) {
		return fullCommand.split(" ");
	}

	public String getHelp(String fullCommand) throws IlegalCommandException {
		String command = getCommand(fullCommand);
		CommandFactory commandFactory = new CommandFactory();
		return commandFactory.createCommand(CommandsList.valueOf(command.toUpperCase())).getHelp();
	}
}
