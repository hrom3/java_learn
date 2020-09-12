package oop;

import pensia_calc.HumanPensiaCala;
import pensia_calc.IPensiaCalc;
import pensia_calc.MilataryPensiaCala;
import pensia_calc.PresidentPensiaCala;

import java.util.Scanner;

public class OopMain3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введи число");
        int variant = scan.nextInt();


        Man man1 =  new Man();
        Man president = new Man();
        Man mil = new Man();

        man1.setName("Vania");
        president.setName("Sania");
        mil.setName("Vika");
        man1.setType(ETypeMan.HUMAN);
        president.setType(ETypeMan.PPRESIDENT);
        mil.setType(ETypeMan.MILLITARY);
        mil.setYearOld(20);
        man1.setYearOld(20);
        man1.setHairLength(25);

        BuhMan buh = new BuhMan();
        System.out.println(buh.calc(getCalculator(variant), man1));
        System.out.println(buh.calc(getCalculator(variant), mil));
        System.out.println(buh.calc(getCalculator(variant), president));

    }
    public static IPensiaCalc getCalculator(int variant) {
        switch (variant) {
            case 1:
                return  new PresidentPensiaCala();
            case 2:
                return new MilataryPensiaCala();
            case 3:
            default:
                return new HumanPensiaCala();
        }
    }
}
