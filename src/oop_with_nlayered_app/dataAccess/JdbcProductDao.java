package oop_with_nlayered_app.dataAccess;

import oop_with_nlayered_app.entities.Product;

public class JdbcProductDao implements ProductDao {

    @Override
    public void add(Product product) {
        System.out.println("Added to the database with Jdbc");
    }
}
