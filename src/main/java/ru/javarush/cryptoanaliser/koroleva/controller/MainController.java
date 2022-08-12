package ru.javarush.cryptoanaliser.koroleva.controller;

import ru.javarush.cryptoanaliser.koroleva.commands.Action;
import ru.javarush.cryptoanaliser.koroleva.entity.Result;

public class MainController {

    public Result execute(String command, String[] parameters) {
        Action action = Actions.find(command);
        return action.execute(parameters);

    }
}
