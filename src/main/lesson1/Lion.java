package main.lesson1;

public class Lion extends Animals {
    @Override
    protected String voice() {
        if (!Lion.super.getSleep())
            return "РРРРРРРРРР";
        else
            return "Лев спит и не может подать голос";
    }
}
