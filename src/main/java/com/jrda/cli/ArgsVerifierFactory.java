package com.jrda.cli;

public class ArgsVerifierFactory {
	
	public ArgsVerifier createArgsVerifier(CommandsList command) throws IlegalCommandException {
		switch(command) {
		case ADD:
			return new AddCommand();
		case UPDATE:
			return new UpdateCommand();
		case DELETE: 
			return new DeleteCommand();
		case RUN: 
			return new RunCommand();
		default:
			throw new IlegalCommandException("Unimplemented command factory " + this.getClass().getName());
		}
	}
	
}
