package oop;

public class OopMan1 {
    public static void main(String[] args) {
        Man man1 = new Man();
        Man man2 = new Man();
        man2.setName("Антон");
        man2.setHairLength(15);

        System.out.println(man1.getName() + " : " + man1.getHairLength());

        System.out.println(man1);
        System.out.println(man2.toString());
//        System.out.println(man1.varible1);
//        System.out.println(man1.varible2);
//        System.out.println(man1.varible3);
//        System.out.println(man1.varible4);




    }
}
