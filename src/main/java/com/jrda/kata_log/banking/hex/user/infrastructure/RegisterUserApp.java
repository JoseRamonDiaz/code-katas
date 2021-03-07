package com.jrda.kata_log.banking.hex.user.infrastructure;

import com.jrda.kata_log.banking.hex.credential.application.CredentialCreator;
import com.jrda.kata_log.banking.hex.credential.domain.CredentialRepository;
import com.jrda.kata_log.banking.hex.credential.infrastructure.CredentialRepositoryInMem;
import com.jrda.kata_log.banking.hex.user.application.RegisterUser;
import com.jrda.kata_log.banking.hex.user.application.UserCreator;
import com.jrda.kata_log.banking.hex.user.domain.UserRepository;

import java.util.Scanner;

public class RegisterUserApp {
    public static void main(String[] args) {
        RegisterUser registerUser = createRegisterUser();

        boolean keepGoing = true;
        Scanner in;
        do {
            System.out.println("Select your option: ");
            System.out.println("-1: Exit");
            System.out.println("0: Register user");
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

                default:
                    System.out.println("Invalid option");
                    break;
            }

        } while (keepGoing);

        System.out.println("Good bye!");

        in.close();
    }

    private static RegisterUser createRegisterUser() {
        UserRepository userRepository = new UserRepositoryIM();
        UserCreator userCreator = new UserCreator(userRepository);
        CredentialRepository credentialRepository = new CredentialRepositoryInMem();
        CredentialCreator credentialCreator = new CredentialCreator(credentialRepository);

        return new RegisterUser(userCreator, credentialCreator);
    }
}
