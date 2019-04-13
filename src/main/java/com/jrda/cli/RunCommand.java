package com.jrda.cli;

public class RunCommand implements ArgsVerifier {

	@Override
	public boolean areCorrectArgs(String[] args) {
		return args.length == 1 ? true : false;
	}

}
