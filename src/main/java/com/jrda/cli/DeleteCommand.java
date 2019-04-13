package com.jrda.cli;

public class DeleteCommand implements ArgsVerifier {

	@Override
	public boolean areCorrectArgs(String[] args) {
		return args.length == 1 ? true : false;
	}

}
