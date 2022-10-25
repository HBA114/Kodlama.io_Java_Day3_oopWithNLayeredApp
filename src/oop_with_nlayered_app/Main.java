package oop_with_nlayered_app;

import oop_with_nlayered_app.business.ProductManager;
import oop_with_nlayered_app.core.logging.DatabaseLogger;
import oop_with_nlayered_app.core.logging.FileLogger;
import oop_with_nlayered_app.core.logging.Logger;
import oop_with_nlayered_app.core.logging.MailLogger;
import oop_with_nlayered_app.dataAccess.HibernateProductDao;
import oop_with_nlayered_app.entities.Product;

public class Main {
    public static void main(String[] args) throws Exception {
        Product product1 = new Product(1, "IPhone XR", 10000);

        Logger[] loggers = {new DatabaseLogger(), new FileLogger(), new MailLogger()};
        
        ProductManager productManager = new ProductManager(new HibernateProductDao(), loggers);

        productManager.add(product1);
    }
}
