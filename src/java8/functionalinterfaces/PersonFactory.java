package java8.functionalinterfaces;

public interface PersonFactory<P extends Person> {
    P create(String firstName,String lastName);
}
