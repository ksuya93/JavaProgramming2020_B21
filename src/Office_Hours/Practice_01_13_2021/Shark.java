package Office_Hours.Practice_01_13_2021;

public class Shark extends Animal {
    public Shark(String name, String breed, String size, char gender, int age) {
        super(name, breed, size, gender, age);
    }

    @Override
    protected void speak() {
        System.out.println("dodododo");
    }

    @Override
    public String toString() {
        return "Shark"+super.toString();
    }

}
