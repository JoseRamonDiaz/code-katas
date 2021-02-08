package com.jrda.kata_log.banking.hex.account.infrastructure;

import java.util.Scanner;

import com.jrda.kata_log.banking.hex.account.application.AccountCreator;
import com.jrda.kata_log.banking.hex.account.application.Deposit;
import com.jrda.kata_log.banking.hex.account.application.Reporter;
import com.jrda.kata_log.banking.hex.account.domain.AccountRepository;

public class ConsoleBank {

	public static void main(String[] args) {
		AccountRepository accountRepository = new InMemAccountRepo();
		AccountCreator accountCreator = new AccountCreator(accountRepository);

		boolean keepGoing = true;
		Scanner in;
		do {
			System.out.println("Select your option: ");
			System.out.println("-1: Exit");
			System.out.println("0: Create account");
			System.out.println("1: Deposit");
			System.out.println("2: Print statemnt");
			in = new Scanner(System.in);

			switch (in.nextLine()) {
			case "0":
				int id = accountCreator.create();
				System.out.println("Account created with id: " + id);
				break;
				
			case "1": 
				System.out.println("Insert amount");
				int amount = in.nextInt();
				
				System.out.println("Insert accountId");
				int accountId = in.nextInt();
				new Deposit(amount, accountId, accountRepository);
				break;
				
			case "2": 
				System.out.println("Enter accound id");
				int statementAccountId = in.nextInt();
				Reporter reporter = new Reporter(accountRepository);
				System.out.println(reporter.report(statementAccountId));
				break;
				
			case "-1":
				keepGoing = false;
				break;
				
			default:
				System.out.println("Invalid option");
				break;
			}
			
		} while (keepGoing);
		
		System.out.println("Good bye!");

		in.close();
	}

}
