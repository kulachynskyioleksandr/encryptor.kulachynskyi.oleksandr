package com.caesarcipher.cipher;

import com.caesarcipher.file.FileService;
import com.caesarcipher.util.Alphabet;
import com.caesarcipher.util.InputValidator;

import java.io.IOException;
import java.nio.file.Path;

public class CaesarCipher {
    private final int key;
    private final Alphabet alphabet;
    private final int alphabetSize;

    public CaesarCipher(int key) {
        this.alphabet = new Alphabet();
        this.alphabetSize = alphabet.getAlphabet().size();
        this.key = InputValidator.validateKey(key) % alphabetSize;
    }

    public String encrypt(String text) {
        StringBuilder encryptedText = new StringBuilder();

        for (char letter : text.toCharArray()) {
            if (alphabet.getAlphabet().contains(letter)) {
                int oldIndex = alphabet.getLetterIndex(letter);
                int newIndex = (oldIndex + key) % alphabetSize;
                char newLetter = alphabet.getAlphabet().get(newIndex);
                encryptedText.append(newLetter);
            } else {
                encryptedText.append(letter);
            }
        }
        return encryptedText.toString();
    }

    public String decrypt(String text) {
        StringBuilder decryptedText = new StringBuilder();

        for (char letter : text.toCharArray()) {
            if (alphabet.getAlphabet().contains(letter)) {
                int oldIndex = alphabet.getLetterIndex(letter);
                int originalIndex = (oldIndex - key + alphabetSize) % alphabetSize;
                char newLetter = alphabet.getAlphabet().get(originalIndex);
                decryptedText.append(newLetter);
            } else {
                decryptedText.append(letter);
            }
        }
        return decryptedText.toString();
    }

    public void encryptFile(String inputFilePath) throws IOException {
        String validatedPath = InputValidator.validateFile(inputFilePath);
        Path inputPath = Path.of(validatedPath);
        Path directory = inputPath.getParent();

        String fileName = inputPath.getFileName().toString();
        String encryptedFileName = fileName.replaceFirst("(\\.[^.]*)?$", "[ENCRYPTED]$1");
        Path newFilePath = directory.resolve(encryptedFileName);

        String content = FileService.readFile(validatedPath);
        String encryptedContent = encrypt(content);
        FileService.writeFile(newFilePath.toString(), encryptedContent);
    }

    public void decryptFile(String inputFilePath) throws IOException {
        String validatedPath = InputValidator.validateFile(inputFilePath);
        Path inputPath = Path.of(validatedPath);
        Path directory = inputPath.getParent();

        String fileName = inputPath.getFileName().toString();
        String decryptedFileName = fileName.replaceFirst("(\\.[^.]*)?$", "[DECRYPTED]$1");
        Path newFilePath = directory.resolve(decryptedFileName);

        String content = FileService.readFile(validatedPath);
        String decryptedContent = decrypt(content);
        FileService.writeFile(newFilePath.toString(), decryptedContent);
    }
}
