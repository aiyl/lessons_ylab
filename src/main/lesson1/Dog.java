package main.lesson1;

public class Dog extends Animals {

    @Override
    public String voice() {
        if (!Dog.super.getSleep())
            return "Гав-гав";
        else
            return "Собака спит и не может подать голос";
    }
}
