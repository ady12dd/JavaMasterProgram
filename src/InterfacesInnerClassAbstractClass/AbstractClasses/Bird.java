package InterfacesInnerClassAbstractClass.AbstractClasses;

public abstract class Bird extends Animal implements CanFly{
    public Bird(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println(getName()+" is eating");
    }

    @Override
    public void breathe() {
        System.out.println(getName()+" breathe in breathe out, repeat");
    }

    @Override
    public void fly() {
        System.out.println(getName()+" is flapping its wings");
    }
}
