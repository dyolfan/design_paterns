package principles.openclose;

import java.util.List;
import java.util.stream.Stream;

class ProductFilter implements Filter<Product> {

    @Override public Stream<Product> filter(List<Product> items, Specification<Product> spec) {
        return items.stream().filter(item -> spec.isSatisfied(item));
    }
}
