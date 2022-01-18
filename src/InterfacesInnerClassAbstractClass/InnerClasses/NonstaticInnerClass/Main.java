package InterfacesInnerClassAbstractClass.InnerClasses.NonstaticInnerClass;

public class Main {
    public static void main(String[] args) {
        Gearbox mcLaren=new Gearbox(6);
//        Gearbox.Gear first=mcLaren.new Gear(3,3.0);
//        System.out.println(first.driveSpeed(1000));
//        Gearbox.Gear second=mcLaren.new Gear(2,2.0);
//        System.out.println(second.driveSpeed(1000));
        mcLaren.operateClutch(true);
        mcLaren.changeGear(1);
        System.out.println(mcLaren.wheelSpeed(1000));
        mcLaren.operateClutch(false);
        mcLaren.changeGear(2);
        System.out.println(mcLaren.wheelSpeed(3000));
        mcLaren.operateClutch(true);
        mcLaren.changeGear(3);
        System.out.println(mcLaren.wheelSpeed(1000));

    }
}
