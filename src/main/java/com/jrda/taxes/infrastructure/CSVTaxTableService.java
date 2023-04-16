package com.jrda.taxes.infrastructure;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;

import com.jrda.taxes.domain.GettingTableException;
import com.jrda.taxes.domain.TaxTableService;

public class CSVTaxTableService implements TaxTableService {
	private static final String fileName = "taxes.csv";

	@Override
	public String[][] getTaxTable() throws GettingTableException {
		String[][] entries = null;
		try (BufferedReader br = new BufferedReader(new FileReader(fileName));) {
			String line = null;
			int i = 0;
			entries = new String[getNumberOfLines()][4];
			while ((line = br.readLine()) != null) {
				entries[i] = line.split(",");
				i++;
			}
		} catch (IOException e) {
			throw new GettingTableException(e.getMessage());
		}

		return entries;
	}

	private int getNumberOfLines() throws IOException {
		File file = new File(fileName);

		long lines = 0;

		LineNumberReader lnr = new LineNumberReader(new FileReader(file));

		while (lnr.readLine() != null)
			;

		lines = lnr.getLineNumber();

		lnr.close();

		return (int) lines;
	}

}
