package java8.functionalinterfaces;

public interface Converter<F,T> {
    T convert(F from);
}
