package anime;

public class Tiger extends Feline {
    public Tiger(String name) {
        super(name);
    }

    public static void main(String[] args) {
        Tiger tiger = new Tiger("Tyson");
        tiger.meow();
    }
}
