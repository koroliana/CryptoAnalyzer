package ru.javarush.cryptoanaliser.koroleva.commands;

import ru.javarush.cryptoanaliser.koroleva.entity.Result;

public interface Action {
    Result execute(String[] parameters) ;
}
