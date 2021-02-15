package principles.openclose;

import java.util.List;

import principles.openclose.filter.AndSpecification;
import principles.openclose.filter.ColorSpecification;
import principles.openclose.filter.ProductFilter;
import principles.openclose.filter.SizeSpecification;

public class OpenClose {
    public static void main(String... args) {
        Product apple = new Product("Apple", Color.GREEN, Size.SMALL);
        Product cherry = new Product("Cherry", Color.RED, Size.SMALL);
        Product house = new Product("House", Color.BLUE, Size.BIG);
        Product olive = new Product("Olive", Color.GREEN, Size.SMALL);
        Product tree = new Product("Tree", Color.GREEN, Size.MEDIUM);

        List<Product> productList = List.of(apple, olive, cherry, house, tree);

        ProductFilter productFilter = new ProductFilter();
        System.out.println("Products - green and small: ");
        productFilter
                .filter(productList, new AndSpecification<>(
                        new ColorSpecification(Color.GREEN), new SizeSpecification(Size.SMALL)
                )).forEach(product -> System.out.println(product.toString()));

        System.out.println("Products - red: ");
        productFilter.filter(productList, new ColorSpecification(Color.BLUE))
                .forEach(product -> System.out.println(product.toString()));
    }
}
