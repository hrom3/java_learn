package operators;

public class operatorsMain02 {

    public static void main(String[] args){
    boolean isBoolTrue = false;
    boolean isBool1True = false;
    int a;
    int b;
    int argsLength = args.length;
    int userNumber;
    int[] arr = new int[argsLength];
    for (int i=0; i < argsLength; i++) {
        userNumber = Integer.parseInt(args[i]);
        arr[i] = userNumber;
    }
    if (arr.length > 1){
        a = arr[0];
        b = arr[1];
    } else if (arr.length > 0){
        a = arr[0];
        b = 1;
    } else {
        a = 5;
        b = 1;
    }

    System.out.println(isBoolTrue);
    System.out.println(isBool1True);

    isBoolTrue = 10 > a;
    isBool1True = 12 < b;

    System.out.println("10 > "+ a + "\t" + isBoolTrue);
    System.out.println("12 < "+ b + "\t " + isBool1True);
    System.out.println(isBoolTrue || isBool1True);
    System.out.println(isBoolTrue && isBool1True);
    }
}
