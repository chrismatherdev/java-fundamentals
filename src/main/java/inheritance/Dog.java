package inheritance;

public class Dog extends Animal {

    @Override
    public void makeSound() {
        System.out.println("Woof woof");
    }

    public void fetch() {
        System.out.println("Fetch is fun");
    }
}
