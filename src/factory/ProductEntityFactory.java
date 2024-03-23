package factory;

public class ProductEntityFactory<Product> extends SimpleEntityFactory<Product> {
    @Override
    public Product create() {
        return (Product) new entity.Product(1, "213123", 2);
    }
}
