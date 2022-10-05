package oopWithNLayeredApp.dataAccess;

import oopWithNLayeredApp.entities.Product;

public class HibernateProductDao implements ProductDao {

    @Override
    public void add(Product product) {
        System.out.println("Added to the database with Hibernate");
    }
}
