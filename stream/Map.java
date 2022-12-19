package stream;

import java.util.ArrayList;
import java.util.List;

public class Map {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("gauva");
        list.add("grapes");


        list.stream().map(t -> t.toUpperCase()).forEach(item -> System.out.println(item));

        
    }
}
