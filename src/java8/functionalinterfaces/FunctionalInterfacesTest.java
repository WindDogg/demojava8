package java8.functionalinterfaces;

public class FunctionalInterfacesTest {
    public static void main(String[] args) {

//        Converter<String,Integer> converter = (from) -> Integer.valueOf(from);
        //使用::关键字传递方法或构造函数的引用
        Converter<String,Integer> converter = Integer::valueOf;
        Integer converted = converter.convert("123");
        System.out.println(converted.getClass());
    }
}
