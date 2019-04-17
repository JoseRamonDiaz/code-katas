package com.jrda.cli;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.jrda.cli.bussiness_rules.AddCommand;
import com.jrda.cli.bussiness_rules.BoundaryInterface;
import com.jrda.cli.bussiness_rules.IlegalCommandException;
import com.jrda.cli.bussiness_rules.Interactor;

public class ParserTests {
	
	@Test
	public void testCommandExistence() {
		BoundaryInterface p = new Interactor();
		String command = "run";
		assertTrue(p.existCommand(command));
		
		String wrongCommand = "sdfjlk";
		assertFalse(p.existCommand(wrongCommand));
	}
	
	@Test
	public void testParameterCorrectness() throws IlegalCommandException {
		BoundaryInterface p = new Interactor();
		String fullCommand = "add from.txt to.txt";
		assertTrue(p.areCorrectArgs(fullCommand));
		
		String wrongFullCommand = "delete from.txt to.txt wrong.txt";
		assertFalse(p.areCorrectArgs(wrongFullCommand));
	}
	
	@Test
	public void testGetCommand() {
		BoundaryInterface p = new Interactor();
		String fullCommand = "add file.txt";
		String command = p.getCommand(fullCommand);
		assertEquals("add", command);
		assertNotEquals("add ", command);
	}
	
	@Test
	public void testGetArgs() {
		BoundaryInterface p = new Interactor();
		String fullCommand = "add from.txt to.txt";
		String[] args = p.getArgs(fullCommand);
		assertEquals(2, args.length);
		assertEquals("from.txt", args[0]);
		assertEquals("to.txt", args[1]);
	}
	
	@Test
	public void testGetHelp() throws IlegalCommandException {
		BoundaryInterface p = new Interactor();
		String fullCommand = "add --help";
	 	String help = p.getHelp(fullCommand);
	 	assertEquals(new AddCommand().getHelp(), help);
	}
}
