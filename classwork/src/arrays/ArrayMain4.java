package arrays;


import cycles.ReturnMetod;

public class ArrayMain4 {
    public static void main(String[] adf){
        for (int i = 1; i < 6; i++){
            if (i == 4){
                System.out.println("continue!");
                continue;
            }
            System.out.println("i= " + i);
        }
     ReturnMetod asd = new ReturnMetod();
        asd.printFirstSevenElements(23);
    }
}
