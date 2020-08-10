package java8.functionalinterfaces;

import java.util.ArrayList;
import java.util.List;

public class StreamTest {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        stringList.add("ddd2");
        stringList.add("aaa2");
        stringList.add("bbb1");
        stringList.add("aaa1");
        stringList.add("bbb3");
        stringList.add("ccc");
        stringList.add("bbb2");
        stringList.add("ddd1");

        stringList.stream()
                .map(String::toUpperCase)
                .sorted((a,b) ->b.compareTo(a))
                .filter(s -> s.startsWith("A"))
                .forEach(System.out::println);

    }
}
