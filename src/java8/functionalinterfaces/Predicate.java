package java8.functionalinterfaces;

import java.util.Objects;

@FunctionalInterface
public interface Predicate<T> {
    //该方法接收一个传入类型，返回一个布尔值，此方法用于判断
    boolean test(T t);

    //and方法与关系型运算符“&&”相似，两边都成立才返回true
    default Predicate<T> and(Predicate<? super T> other){
        Objects.requireNonNull(other);
        return (t) ->test(t) && other.test(t);
    }
}
