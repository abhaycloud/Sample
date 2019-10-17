package InheritanceExample;

public class Animal {
    private String name;
    private int age;
    private int weight;
    private int size;

    public Animal(String name, int age, int weight, int size) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.size = size;
    }
    public void eat() {
        System.out.println("Animal.eat Class");
    }

    public void move() {
        System.out.println("Animal.move Class");
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getWeight() {
        return weight;
    }

    public int getSize() {
        return size;
    }
}
