package com.caesarcipher.util;

import java.util.Arrays;
import java.util.List;

public class Alphabet {
    public List<Character> alphabet;

    public Alphabet() {
        alphabet = Arrays.asList(
                'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z',
                'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z',
                '.', ',', '«', '»', '"', '\'', ':', '!', '?', ' '
        );
    }

    public List<Character> getAlphabet() {
        return alphabet;
    }

    public int getLetterIndex (Character letter) {
        return alphabet.indexOf(letter);
    }
}