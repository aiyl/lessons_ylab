package main;
import main.lesson1.Animals;
import main.lesson1.Cat;
import main.lesson1.Dog;
import main.lesson1.Lion;

public class Main {

    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.setEat(true);
        cat.setSleep(false);
        cat.voice();
        stdout();

        Dog dog = new Dog();
        dog.setSleep(true);
        dog.setEat(true);
        dog.voice();
        stdout();

        Lion lion = new Lion();
        dog.setSleep(true);
        dog.setEat(true);
        dog.voice();
    }

    private static void stdout(){
        System.out.println("_______________________________________________");
    }
}
