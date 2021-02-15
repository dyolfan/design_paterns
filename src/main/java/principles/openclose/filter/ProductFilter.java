package principles.openclose.filter;

import java.util.List;
import java.util.stream.Stream;

import principles.openclose.Product;

public class ProductFilter implements Filter<Product> {

    @Override public Stream<Product> filter(List<Product> items, Specification<Product> spec) {
        return items.stream().filter(item -> spec.isSatisfied(item));
    }
}
