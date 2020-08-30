package cycles;

public class CycleMain01 {
    public static void main(String[] args) {
       int i = 1;
       int a = 5;
       int b = 10;
       int d = 10;
       d = d++ + d++;
       int c = a++ + a++ + ++b;
       System.out.println(c +" " + d);
       while (i < 5){
           System.out.println("i = " + i);
           i++;
       }
    }
}
