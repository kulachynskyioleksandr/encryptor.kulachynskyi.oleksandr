package com.caesarcipher.util;

import com.caesarcipher.cipher.CaesarCipher;

import java.io.IOException;
import java.util.Scanner;

public class CLI {

    public static void mainMenu() throws IOException {
        Scanner scanner = new Scanner(System.in);
        String command;

        do {
            System.out.println("Welcome! Please enter the name of operation you would like to do: \n" +
                    "ENCRYPT or DECRYPT");
            command = scanner.nextLine().toUpperCase();
        } while (!command.equals("ENCRYPT") && !command.equals("DECRYPT"));

        System.out.println("Please enter the file path:");
        String filePath = scanner.nextLine();
        System.out.println("Please enter the cipher key:");
        int key = scanner.nextInt();

        CaesarCipher cipher = new CaesarCipher(key);
        if (command.equals("ENCRYPT")) {
            cipher.encryptFile(filePath);
        } else {
            cipher.decryptFile(filePath);
        }
    }
}
