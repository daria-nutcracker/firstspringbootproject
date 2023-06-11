package ru.itgirl.firstspringproject.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstController {

    @GetMapping("/dayOfWeek")
    public String hello(@RequestParam(value = "name", defaultValue = "чудесный день") String name) {
        String rus_name = name;
        switch (name) {
            case "MONDAY":
                rus_name = "понедельник";
                break;
            case "TUESDAY":
                rus_name = "вторник";
                break;
            case "WEDNESDAY":
                rus_name = "среда";
                break;
            case "THURSDAY":
                rus_name = "четверг";
                break;
            case "FRIDAY":
                rus_name = "пятница";
                break;
            case "SATURDAY":
                rus_name = "суббота";
                break;
            case "SUNDAY":
                rus_name = "воскресенье";
                break;

        }
        return String.format("Сегодня %s!", rus_name);
    }

}
