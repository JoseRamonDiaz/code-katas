package com.jrda.cli;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class ParserTests {
	
	@Test
	public void testCommandExistence() {
		Parser p = new Parser();
		String command = "run";
		assertTrue(p.existCommand(command));
		
		String wrongCommand = "sdfjlk";
		assertFalse(p.existCommand(wrongCommand));
	}
	
	@Test
	public void testParameterCorrectness() throws IlegalCommandException {
		Parser p = new Parser();
		String fullCommand = "add from.txt to.txt";
		assertTrue(p.areCorrectArgs(fullCommand));
		
		String wrongFullCommand = "delete from.txt to.txt wrong.txt";
		assertFalse(p.areCorrectArgs(wrongFullCommand));
	}
	
	@Test
	public void testGetCommand() {
		Parser p = new Parser();
		String fullCommand = "add file.txt";
		String command = p.getCommand(fullCommand);
		assertEquals("add", command);
		assertNotEquals("add ", command);
	}
	
	@Test
	public void testGetArgs() {
		Parser p = new Parser();
		String fullCommand = "add from.txt to.txt";
		String[] args = p.getArgs(fullCommand);
		assertEquals(2, args.length);
		assertEquals("from.txt", args[0]);
		assertEquals("to.txt", args[1]);
	}
	
	@Test
	public void testGetHelp() throws IlegalCommandException {
		Parser p = new Parser();
		String fullCommand = "add --help";
	 	String help = p.getHelp(fullCommand);
	 	assertEquals(new AddCommand().getHelp(), help);
	}
}
