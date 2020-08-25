package operators;

public class operatorsMain01 {

    public static void main(String[]     args){
        int a = 10;
        long b = 5;
        long c = a + b; //variant 1, better!
//        int c =  a + (int) b;  variant 2, not good!
        double z = 0.5;

        System.out.println("z=" + z +  " int z=" + (int) z);
        System.out.println("a=" + a +  "\na+c=" + (a + c));
        System.out.println("b=" + b +  "\n5+c=" + (5 + c));
        System.out.println("c=" + c +  " b+a=" + (b + a));
    }
}
