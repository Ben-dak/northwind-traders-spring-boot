package com.pluralsight.NorthwindTradersSpringBoot;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class SimpleProductDao implements ProductDao {

    private List<Product> products;

    public SimpleProductDao() {
        products = new ArrayList<>();

        products.add(new Product(1, "Goober Juice", "Beverage", 2.50));
        products.add(new Product(2, "Huhrritos", "Beverage Again", 2.51));
        products.add(new Product(3, "Gato-rade", "Beverage Again I guess", 2.52));
    }

    @Override
    public void add(Product product) {
        products.add(product);
    }

    @Override
    public List<Product> getAll() {
        return products;
    }
}

