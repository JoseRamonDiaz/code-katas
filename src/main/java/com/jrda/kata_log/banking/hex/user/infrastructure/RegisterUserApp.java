package com.jrda.kata_log.banking.hex.user.infrastructure;

import com.jrda.kata_log.banking.hex.account.application.AccountCreator;
import com.jrda.kata_log.banking.hex.account.domain.Account;
import com.jrda.kata_log.banking.hex.account.domain.AccountRepository;
import com.jrda.kata_log.banking.hex.account.domain.AccountType;
import com.jrda.kata_log.banking.hex.account.infrastructure.InMemAccountRepo;
import com.jrda.kata_log.banking.hex.credential.application.CredentialCreator;
import com.jrda.kata_log.banking.hex.credential.domain.CredentialRepository;
import com.jrda.kata_log.banking.hex.credential.infrastructure.CredentialRepositoryInMem;
import com.jrda.kata_log.banking.hex.user.application.AccountAdder;
import com.jrda.kata_log.banking.hex.user.application.RegisterUser;
import com.jrda.kata_log.banking.hex.user.application.UserCreator;
import com.jrda.kata_log.banking.hex.user.domain.UserRepository;

import java.util.Scanner;

public class RegisterUserApp {
    public static void main(String[] args) {
        AccountRepository accountRepository = new InMemAccountRepo();
        AccountCreator accountCreator = new AccountCreator(accountRepository);
        UserRepository userRepository = new UserRepositoryIM();
        RegisterUser registerUser = createRegisterUser(userRepository);
        AccountAdder accountAdder = new AccountAdder(userRepository, accountRepository);

        boolean keepGoing = true;
        Scanner in;
        do {
            System.out.println("Select your option: ");
            System.out.println("-1: Exit");
            System.out.println("0: Register user");
            System.out.println("1: Create account");
            System.out.println("2: Add account to user");
            in = new Scanner(System.in);

            switch (in.nextLine()) {
                case "-1":
                    keepGoing = false;
                    break;

                case "0":
                    System.out.println("Name: ");
                    String name = in.next();

                    System.out.println("Lastname: ");
                    String lastname = in.next();

                    System.out.println("Username: ");
                    String userName = in.next();

                    System.out.println("Pass: ");
                    String pass = in.next();

                    registerUser.register(name, lastname, userName, pass);

                    break;

                case "1":
                    int id = accountRepository.save(new Account(AccountType.SAVING));
                    System.out.println("Account created with id: " + id);
                    break;

                case "2":
                    System.out.println("Username: ");
                    String usernameToAddAccount = in.next();
                    System.out.println("Account id");
                    int accountId = in.nextInt();
                    accountAdder.add(usernameToAddAccount, accountId);
                    break;

                default:
                    System.out.println("Invalid option");
                    break;
            }

        } while (keepGoing);

        System.out.println("Good bye!");

        in.close();
    }

    private static RegisterUser createRegisterUser(UserRepository userRepository) {
        UserCreator userCreator = new UserCreator(userRepository);
        CredentialRepository credentialRepository = new CredentialRepositoryInMem();
        CredentialCreator credentialCreator = new CredentialCreator(credentialRepository);

        return new RegisterUser(userCreator, credentialCreator);
    }
}
