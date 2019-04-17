package com.jrda.cli.bussiness_rules;

public interface Command {
	public boolean areCorrectArgs(String[] args);
	public String getHelp();
}
