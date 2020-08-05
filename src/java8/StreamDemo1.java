package java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamDemo1 {
    public static void main(String[] args) {
        List<String> playes = Arrays.asList("kobe","james","curry","cyyt");
        List<String> sorted = playes.stream().filter(s -> s.startsWith("c"))
                .map(String::toUpperCase)
                .sorted()
                .collect(Collectors.toList());
        System.out.println(sorted);
    }
}
