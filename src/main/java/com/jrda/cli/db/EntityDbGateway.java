package com.jrda.cli.db;

import com.jrda.cli.bussiness_rules.Command;

public interface EntityDbGateway {
	public void saveCommand(Command command);
}
