package InheritanceExample;

public class Animal {
    private String name;
    private int age;
    private int weight;
    private int size;

    public Animal(String name1, int age1, int weight1, int size1) {
        name = name1;
        age = age1;
        weight = weight1;
        size = size1;
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
