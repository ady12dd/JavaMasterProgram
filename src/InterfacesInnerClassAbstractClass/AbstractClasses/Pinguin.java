package InterfacesInnerClassAbstractClass.AbstractClasses;

public class Pinguin extends Bird{
    public Pinguin(String name) {
        super(name);
    }

    @Override
    public void fly() {
        super.fly();
        System.out.println(getName()+" i'm not very good of that, can i go for a swim instead?");
    }
}
