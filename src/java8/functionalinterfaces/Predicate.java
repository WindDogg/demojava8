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

    //与关系运算符"!"相似，对判断进行反取
    default Predicate<T> negate(){
        return (t) ->!test(t);
    }

    //or方法与关系型运算符"||"，两边只要有一个成立就返回true
    default Predicate<T> or(Predicate<? super T> other){
        Objects.requireNonNull(other);
        return t -> test(t) || other.test(t);
    }


}
