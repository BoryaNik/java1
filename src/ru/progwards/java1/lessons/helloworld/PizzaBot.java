package ru.progwards.java1.lessons.helloworld;

import org.telegram.telegrambots.ApiContextInitializer;
import ru.progwards.java1.testlesson.ProgwardsTelegramBot;

public class PizzaBot extends ProgwardsTelegramBot  {
    public static void main(String[] args){
        System.out.println("Hello Bot!");
        ApiContextInitializer.init();

        PizzaBot bot = new PizzaBot();
        bot.username = "имя бота";
        bot.token = "токен";
        bot.start();
    }
}
