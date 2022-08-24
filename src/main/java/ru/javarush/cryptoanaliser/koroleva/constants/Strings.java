package ru.javarush.cryptoanaliser.koroleva.constants;

public class Strings {
    private static final String rus = "абвгдеёжзийклмнопрстуфхцчшщъыьэюя";
    private static final String numbers = "1234567890";
    private static final String symbols = ".,-_—«»\";' \\:!?*/";
    //private static final char[] en = {'a', 'b', 'c', 'd'};
    private static final String alphabet = rus + rus.toUpperCase() + numbers + symbols;
    public static final char[] ALPHABET = alphabet.toCharArray();
    //public static final String ALPHABET = rus + rus.toUpperCase() + numbers + symbols;

}


