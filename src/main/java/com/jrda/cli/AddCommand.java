package com.jrda.cli;

public class AddCommand implements ArgsVerifier {

	@Override
	public boolean areCorrectArgs(String[] args) {
		return args.length == 2 ? true : false;
	}

}
