package com.caesarcipher.main;

import com.caesarcipher.cipher.CaesarCipher;
import com.caesarcipher.util.CLI;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        if (args.length == 3) {
            String command = args[0].toUpperCase();
            String filePath = args[1];
            int key = Integer.parseInt(args[2]);

            CaesarCipher cipher = new CaesarCipher(key);

            switch (command) {
                case "ENCRYPT":
                    cipher.encryptFile(filePath);
                    System.out.println("File encrypted successfully!");
                    break;
                case "DECRYPT":
                    cipher.decryptFile(filePath);
                    System.out.println("File decrypted successfully!");
                    break;
                default:
                    System.out.println("Invalid command! Use ENCRYPT or DECRYPT.");
            }
        } else {
            CLI.mainMenu();
        }
    }
}