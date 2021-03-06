package principles.openclose;

import java.util.Arrays;

class AndSpecification<T> implements Specification<T> {
    private Specification<T>[] specifications;

    public AndSpecification(Specification<T>... specifications) {
        this.specifications = specifications;
    }

    @Override public boolean isSatisfied(T item) {
        return Arrays.stream(specifications).allMatch(spec -> spec.isSatisfied(item));
    }
}
