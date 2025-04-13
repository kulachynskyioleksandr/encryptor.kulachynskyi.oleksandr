package com.caesarcipher.file;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FileService {

    public static String readFile(String filePath) throws IOException {
        return Files.readString(Paths.get(filePath));
    }

    public static void writeFile(String filePath, String content) throws IOException {
        Files.writeString(Paths.get(filePath), content);
    }
}