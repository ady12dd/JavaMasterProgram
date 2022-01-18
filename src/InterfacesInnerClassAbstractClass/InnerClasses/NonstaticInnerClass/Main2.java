package InterfacesInnerClassAbstractClass.InnerClasses.NonstaticInnerClass;

import java.util.Scanner;

public class Main2 {
    private static Scanner scanner = new Scanner(System.in);
    private static Button btnPrint = new Button("Print");

    public static void main(String[] args) {
        Gearbox mcLaren = new Gearbox(6);
//        Gearbox.Gear first=mcLaren.new Gear(3,3.0);
//        System.out.println(first.driveSpeed(1000));
//        Gearbox.Gear second=mcLaren.new Gear(2,2.0);
//        System.out.println(second.driveSpeed(1000));
//        mcLaren.operateClutch(true);
//        mcLaren.changeGear(1);
//        System.out.println(mcLaren.wheelSpeed(1000));
//        mcLaren.operateClutch(false);
//        mcLaren.changeGear(2);
//        System.out.println(mcLaren.wheelSpeed(3000));
//        mcLaren.operateClutch(true);
//        mcLaren.changeGear(3);
//        System.out.println(mcLaren.wheelSpeed(1000));
        class ClickListener implements Button.OnClickListener {
            public ClickListener() {
                System.out.println("I've been attached");
            }

            @Override
            public void onClick(String title) {
                System.out.println(title + " was clicked");
            }
        }

        btnPrint.setOnClickListener(new ClickListener());
        btnPrint.onClick();
        //listen();
        btnPrint.setOnClickListener(new Button.OnClickListener() {// anonymous class, created by Intelij
            @Override
            public void onClick(String title) {

            }
        });

    }

    private static void listen() {
        boolean quit = false;
        while (!quit) {
            int choise = scanner.nextInt();
            scanner.nextLine();
            switch (choise) {
                case 0:
                    quit = true;
                    break;
                case 1:
                    btnPrint.onClick();
            }
        }
    }
}
