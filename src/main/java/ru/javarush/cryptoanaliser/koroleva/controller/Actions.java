package ru.javarush.cryptoanaliser.koroleva.controller;

import ru.javarush.cryptoanaliser.koroleva.commands.Action;
import ru.javarush.cryptoanaliser.koroleva.commands.Decoder;
import ru.javarush.cryptoanaliser.koroleva.commands.Encoder;

public enum Actions {
    ENCODE(new Encoder()),
    DECODE(new Decoder());

    private final Action action;

    Actions(Action action) {
        this.action = action;
    }

    public static Action find(String command) {
        return Actions.valueOf(command.toUpperCase()).action;
    }
}
