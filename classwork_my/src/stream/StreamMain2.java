package stream;

import java.util.stream.IntStream;

public class StreamMain2 {
    public static void main(String[] args) {

        double count = IntStream
                .range(1, 100)
                .peek(System.out::println)
                .limit(10)
                .peek(System.out::println)
                .filter((number) -> {
                    return number % 2 == 0;
                })
                .peek(System.out::println)
                .average().orElse(0);

        System.out.println(count);
    }
}
