package main.java.me.model.animal;

public class Feline extends Animal {
    public Feline(String name) {
        super(name);
    }

    public void meow() {
        System.out.println("meow~~~ I'm " + getName());
    }
}
