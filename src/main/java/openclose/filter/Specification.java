package openclose.filter;

public interface Specification<T> {
    boolean isSatisfied(T item);
}
