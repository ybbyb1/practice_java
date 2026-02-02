package basic.animal;

public class Bird extends Animal{
    @Override
    void speak() {
        System.out.println("tweet");
    }

    void fly() {
        System.out.println("flying");
    }
}
