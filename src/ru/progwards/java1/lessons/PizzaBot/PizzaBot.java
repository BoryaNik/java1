package ru.progwards.java1.lessons.PizzaBot;

import org.telegram.telegrambots.ApiContextInitializer;
import ru.progwards.java1.testlesson.ProgwardsTelegramBot;



    public class PizzaBot extends ProgwardsTelegramBot {
        @Override
        public String processMessage(String text) {
            checkTags(text);
            if (foundCount() == 1) {
                if (checkLastFound("привет"))
                    return "Приветствую тебя, о мой повелитель!\n Что желаешь? ";
            }
            if(foundCount()>1)
                return "Под твой запрос подходит: \n" + extract() + "Выбери что-то одно, и я добавлю это в заказ.";
            return "Я не понял, возможно у нас этого нет, попробуй сказать по другому. ";

        }
        public static void main(String[] args){
            System.out.println("Hello Bot!");

            ApiContextInitializer.init();

            PizzaBot bot = new PizzaBot();
            bot.username ="P24pizza";
            bot.token = "855300177:AAFvd5FhYIr2x3UbV8MCCPDgx4cqHIeNrk";
            bot.start();

            bot.addTags("привет", "привет, здрасьте, здравствуй, добр, день, вечер, утро, hi, hello");

            bot.addTags("Пицца гавайская", "гавайск, пицц, ананас, куриц");
            bot.addTags("Пицца маргарита", "маргарит, пицц, моцарелла, сыр, кетчуп, помидор");
            bot.addTags("Пицца пеперони", "пеперони, пицц, салями, колбас, сыр, кетчуп, помидор");

        }
    }


