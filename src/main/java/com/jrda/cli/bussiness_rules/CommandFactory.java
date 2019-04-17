package com.jrda.cli.bussiness_rules;

public class CommandFactory {
	
	public Command createCommand(CommandsList command) throws IlegalCommandException {
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
