package main;
import main.lesson1.Animals;
import main.lesson1.Cat;
import main.lesson1.Dog;
import main.lesson1.Lion;

public class Main {

    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.setSleep(false);
        cat.setEat(true);
        System.out.println(cat.voice());
        stdout();

        Dog dog = new Dog();
        dog.setEat(true);
        dog.setSleep(false);
        System.out.println(dog.voice());
        stdout();

        Lion lion = new Lion();
        lion.setSleep(true);
        lion.setEat(true);
        System.out.println(lion.voice());
        stdout();
    }

    private static void stdout(){
        System.out.println("_______________________________________________");
    }
}
