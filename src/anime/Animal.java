package anime;

public class Animal {
    private int age;
    private int weight;
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public int getWeight() {
        return this.weight;
    }

    public void eat() {
        System.out.println("I'm eating now!");
    }

    public void run() {
        System.out.println("I'm running now!");
    }
}
