package Office_Hours.Practice_01_13_2021;

public class Dog extends Animal {

    public Dog(String name, String breed, String size, char gender, int age) {
        super(name, breed, size, gender, age);
    }

    public void speak(){
        System.out.println("Woof Woof");
    }

    @Override
    public String toString() {
        return "Dog"+super.toString();
    }

}
