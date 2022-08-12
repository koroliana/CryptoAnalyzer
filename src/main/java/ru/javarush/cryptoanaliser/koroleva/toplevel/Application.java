package ru.javarush.cryptoanaliser.koroleva.toplevel;

import ru.javarush.cryptoanaliser.koroleva.controller.MainController;
import ru.javarush.cryptoanaliser.koroleva.entity.Result;

import java.util.Arrays;

public class Application {
    private final MainController mainController;

    public Application(MainController mainController) {
        this.mainController = mainController;
    }

    public Result run(String[] args){
        //encode text.txt encoded.txt 45

        String command = args[0]; //encode
        String[] parameters = Arrays.copyOfRange(args, 1, args.length); //text.txt encoded.txt 45
        return mainController.execute(command,parameters);
    }

}
