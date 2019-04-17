package com.jrda.cli;

public interface BoundaryInterface {
	public boolean existCommand(String command);
	public boolean areCorrectArgs(String fullCommand) throws IlegalCommandException;
	public String getCommand(String fullCommand);
	public String[] getArgs(String fullCommand);
	public String getHelp(String fullCommand) throws IlegalCommandException;
}
