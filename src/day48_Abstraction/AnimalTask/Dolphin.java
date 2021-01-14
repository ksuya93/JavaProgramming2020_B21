package day48_Abstraction.AnimalTask;

public class Dolphin extends Animal implements Swimmable {
    public Dolphin(String name, String breed, String size, char gender, int age) {
        super(name, breed, size, gender, age);
    }

    @Override
    public void sleep() {

    }
}
