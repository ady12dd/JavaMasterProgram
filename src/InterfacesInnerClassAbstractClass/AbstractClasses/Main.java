package InterfacesInnerClassAbstractClass.AbstractClasses;

public class Main {
    public static void main(String[] args) {
        Animal dog = new Dog("Yorkie");
        dog.eat();
        dog.breathe();

        Parrot bird = new Parrot("Parrot");
        bird.eat();
        bird.breathe();
        bird.fly();

        Pinguin pinguin=new Pinguin("Emperor");
        pinguin.fly();

    }
}
