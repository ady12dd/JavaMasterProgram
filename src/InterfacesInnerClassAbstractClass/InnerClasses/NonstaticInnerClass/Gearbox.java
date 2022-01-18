package InterfacesInnerClassAbstractClass.InnerClasses.NonstaticInnerClass;

import java.util.ArrayList;

public class Gearbox {
    private ArrayList<Gear> gears;
    private int maxGears;
    private int currentGear = 0;
    private boolean clucychIsIn;

    public Gearbox(int maxGears) {
        this.maxGears = maxGears;
        this.gears = new ArrayList<Gear>();
        for(int i=0;i<maxGears;i++){
            addGear(i,i*5.3);
        }
    }

    public void operateClutch(boolean in) {
        this.clucychIsIn = in;
    }

    public void addGear(int number, double ratio) {
        if (number > 0 && number <= maxGears) {
            this.gears.add(new Gear(number, ratio));
        }
    }

    public void changeGear(int newGear) {
        if ((newGear >= 0) && (newGear <= maxGears) && this.clucychIsIn) {
            this.currentGear = newGear;
            System.out.println("Gear " + newGear + " selected.");
        } else {
            System.out.println("Grind");
            this.currentGear=0;
        }
    }

    public double wheelSpeed(int revs){
        if(clucychIsIn){
            System.out.println("Scream!!!!");
            return 0.0;
        }else{
            return revs*gears.get(currentGear).getRatio();
        }
    }

    private class Gear {//nonstatic inner class
        private int gearNumber;
        private double ratio;

        public Gear(int gearNumber, double ratio) {
            this.gearNumber = gearNumber;
            this.ratio = ratio;
        }

        public double driveSpeed(int revs) {
            return revs * (this.ratio);
        }

        public double getRatio() {
            return ratio;
        }
    }

}
