package stream;

import java.util.Random;
import java.util.stream.Stream;

public class StreamMain3 {
    public static void main(String[] args) {
        final Random rnd = new Random();


        long count = Stream
                .generate(() -> rnd.nextInt(255)) // промежуточная операция (intermediately)
                .limit(100)
                .filter(intValue -> intValue != 0)
                .map(intValue -> (char) intValue.intValue())
                .peek(System.out::print)
                .count(); // завершающая операция (terminal)
//                ; // завершающая операция отсутсвует (terminal)

        System.out.println(count);
    }
}
