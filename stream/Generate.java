package stream;

import java.util.stream.Stream;

public class Generate {
    public static void main(String[] args) {
        Stream<String> streams = Stream.generate(() -> "Hello");

        streams.limit(10).forEach((text) -> System.out.println(text));




    }
}
