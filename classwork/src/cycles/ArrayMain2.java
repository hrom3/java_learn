package cycles;

public class ArrayMain2 {
    public static void main(String[] asd){
       long[] arr = {1, 256, 56};
       long w =0;
        for (long elem: arr) {
            System.out.println(elem);
            w += elem;
        }
        System.out.println(w);
    }
}
