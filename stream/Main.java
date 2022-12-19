package stream;

import java.util.Arrays;
import java.util.stream.Stream;

class Main{
    public static void main(String[] args) {
        String[] array = new String[]{"Apple","Mango","Gauva","Banana"};

        Stream<String> streams = Arrays.stream(array);

        streams.limit(2).forEach(System.out::println);
    }
}