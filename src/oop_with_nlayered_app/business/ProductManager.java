package oop_with_nlayered_app.business;

import oop_with_nlayered_app.core.logging.Logger;
import oop_with_nlayered_app.dataAccess.ProductDao;
import oop_with_nlayered_app.entities.Product;

public class ProductManager {

    private ProductDao productDao;
    private Logger[] loggers;

    public ProductManager(ProductDao productDao, Logger[] loggers) {
        this.productDao = productDao;
        this.loggers = loggers;
    }

    public void add(Product product) throws Exception {

        // Business Rules
        if (product.getUnitPrice() < 10) {
            throw new Exception("Product Price can not be less than 10.");
        }

        productDao.add(product);

        for (Logger logger : loggers) {
            logger.log("Product Added : " + product.getName());
        }
    }

}
