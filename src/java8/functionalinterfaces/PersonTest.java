package java8.functionalinterfaces;

public class PersonTest {
    public static void main(String[] args) {
        PersonFactory<Person> personPersonFactory = Person::new;
        Person person = personPersonFactory.create("xue","hangjian");

        final int num =1;

        Converter<Integer,String> stringConverter =from -> String.valueOf(from + num);
        stringConverter.convert(2);




    }
}
