import InheritanceExample.Animal;
import InheritanceExample.Dog;

public class CallingAnimal {

    public static void main(String[] args) {
        Animal animal = new Animal("animal", 10, 50, 15);
        animal.eat();
        System.out.println( animal.getName());

        Dog dog = new Dog("Tommy", 10, 45, 12, 2, 4, 1, 32);
        dog.eat();
        dog.move();
        System.out.print(dog.getName());
        System.out.println(dog.getTeeth());
    }
}
