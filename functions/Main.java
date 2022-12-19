package functions;

import java.util.function.Function;

public class Main {
    public static void main(String[] args) {

        Function<String, Integer> countLetter = (word) -> word.length();

        System.out.println(countLetter.apply("Bibek Dhungana"));

    }

}
