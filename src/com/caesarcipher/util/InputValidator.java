package com.caesarcipher.util;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class InputValidator {

    public static int validateKey(int key) {
        Scanner scanner = new Scanner(System.in);
        while (key < 0) {
            System.out.println("Incorrect key! Please try again.");
            if (scanner.hasNextInt()) {
                key = scanner.nextInt();
            } else {
                scanner.next();
            }
        }
        return key;
    }

    public static String validateFile(String filePath) {
        Path path = Paths.get(filePath);
        Scanner scanner = new Scanner(System.in);

        while (!Files.exists(path) || !Files.isRegularFile(path)) {
            System.out.println("Incorrect file path! Please try again:");
            filePath = scanner.nextLine();
            path = Paths.get(filePath);
        }

        return filePath;
    }
}
