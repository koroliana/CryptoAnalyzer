package ru.javarush.cryptoanaliser.koroleva.constants;

public class Strings {
    private static final String rus = "абвгдеёжзиклмнопрстуфхцчшЪьэюя";
    private static final String en = "abcdeijklmnoprstyz";
    private static final String numbers = "1234567890";
    private static final String symbols = ",._;:-";
    public static String ALPHABET = rus + rus.toUpperCase() + en + en.toUpperCase() + numbers + symbols;

}
