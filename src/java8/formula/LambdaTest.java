package java8.formula;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LambdaTest {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("peter","anna","mike","xenia");
        //老版本 传统方法
//        Collections.sort(names, new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//                return o2.compareTo(o1);
//            }
//        });
//        //java8使用lambda表达式
//        Collections.sort(names,(String a,String b) ->{
//            return b.compareTo(a);
//        });

        Collections.sort(names, (String a, String b) -> a.compareTo(b));

        System.out.println(names);

    }

}
