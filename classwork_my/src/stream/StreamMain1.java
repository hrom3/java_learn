package stream;

import java.util.stream.IntStream;

public class StreamMain1 {
    public static void main(String[] args) {

        long count = IntStream
                .range(1, 100)
                .peek(System.out::println)
                .limit(10)
                .peek(System.out::println)
                .filter((number) -> {
                    return number % 2 == 0;
                })
                .peek(System.out::println)
                .count();

        System.out.println(count);
    }
}
