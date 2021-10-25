package main.lesson1;

public class Cat extends Animals{
    @Override
    public String voice() {
        if (!Cat.super.getSleep())
            return "Мяу";
        else
            return "Кошка спит и не может подать голос";
    }

}
