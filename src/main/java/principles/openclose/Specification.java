package principles.openclose;

interface Specification<T> {
    boolean isSatisfied(T item);
}
