package oop_withith_nlayered_app.dataAccess;

import oop_withith_nlayered_app.entities.Product;

public class HibernateProductDao implements ProductDao {

    @Override
    public void add(Product product) {
        System.out.println("Added to the database with Hibernate");
    }
}
