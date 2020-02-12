package ru.progwards.java1.lessons.maps;

import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class UsageFrequency {
    static Map<Character, Integer> letters;
    static Map<String, Integer> words;

    public static void processFile(String fileName) {
        letters = new HashMap<Character, Integer>(1000);
        words = new HashMap<String, Integer>(1000);
        try (FileReader r = new FileReader(fileName); Scanner s = new Scanner(r)) {
            while (s.hasNext()) {
                processLine(s.nextLine());
            }
        } catch (IOException e) {
            throw new RuntimeException(fileName + ":\n" + e.getMessage());
        }
    }
    private static void processLine(String str) {

        int word = -1;
        Character keyChar;
        String key1;
        int strLen = str.length();
        for (int i = 0; i < strLen; i++) {
            keyChar = str.charAt(i);
            if (Character.isLetterOrDigit(keyChar)) {
                letters.put(keyChar, letters.containsKey(keyChar) ? 1 + letters.get(keyChar) : 1);
                if (word < 0) word = i;
            } else {
                if (word>= 0) {
                    key1 = str.substring(word, i);
                    words.put(key1, words.containsKey(key1) ? 1 + words.get(key1) : 1);
                    word = -1;
                }
            }
        }
        if (word >= 0) {
            key1 = str.substring(word, strLen);
            words.put(key1, words.containsKey(key1) ? 1 + words.get(key1) : 1);
        }
    }


    public static Map<Character, Integer> getLetters() {
        return letters;
    }


    public static Map<String, Integer> getWords() {
        return words;
    }

    public static void main(String[] args) {

    }
}
