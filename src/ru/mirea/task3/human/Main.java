package ru.mirea.task3.human;

public class Main {
    public static void main(String[] args) {

        Torso torso = new Torso(0.81564f);
        Head head = new Head(0.15f);
        LeftHand hand1 = new LeftHand(0.632f);
        RightHand hand2 = new RightHand(0.623f);
        LeftLeg leg1 = new LeftLeg(0.9456f);
        RightLeg leg2 = new RightLeg(0.9449f);
        hand1.brakeOrgan();
        if (hand1.isBraked() | hand2.isBraked() | leg1.isBraked() | leg2.isBraked()) {
            System.out.println("Конечность повреждена!");
        }
        System.out.println("Размер головы: " + head.getSize());
        System.out.println("Размер туловища: " + torso.getSize());
    }

}
