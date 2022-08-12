package ru.javarush.cryptoanaliser.koroleva;

import ru.javarush.cryptoanaliser.koroleva.toplevel.Application;
import ru.javarush.cryptoanaliser.koroleva.controller.MainController;
import ru.javarush.cryptoanaliser.koroleva.entity.Result;

public class Runner {
    public static void main(String[] args) {
        MainController mainController = new MainController();
        //encode text.txt encoded.txt 45
        Application application = new Application(mainController);
        Result result = application.run(args);
        System.out.println(result);
    }
}
