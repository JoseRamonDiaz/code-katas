package com.jrda.cli;

import java.util.Arrays;

public class Parser {
	
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
		ArgsVerifierFactory argsVerifierFactory = new ArgsVerifierFactory();
		ArgsVerifier argsVerifier = argsVerifierFactory.createArgsVerifier(CommandsList.valueOf(command.toUpperCase()));
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
}
