package com.jrda.cli;

public interface Command {
	public boolean areCorrectArgs(String[] args);
	public String getHelp();
}
