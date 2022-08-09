package ru.javarush.cryptoanaliser.koroleva;

import ru.javarush.cryptoanaliser.koroleva.app.Application;
import ru.javarush.cryptoanaliser.koroleva.controller.MainController;

import java.util.Arrays;

public class Runner {
    public static void main(String[] args) {
        MainController mainController = new MainController();
        Application application = new Application(mainController);
        Result result = application.run(args);
        System.out.println(result);
    }
}
