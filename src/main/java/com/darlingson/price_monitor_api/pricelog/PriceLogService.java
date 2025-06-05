
package com.darlingson.price_monitor_api.pricelog;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.time.LocalDateTime;
import java.util.List;
import com.darlingson.price_monitor_api.product.Product;
import com.darlingson.price_monitor_api.product.ProductRepository;

@Service
public class PriceLogService {
    
    @Autowired
    private PriceLogRepository priceLogRepository;
    
    @Autowired
    private ProductRepository productRepository;
    
    public void updateAllPrices() {
        List<Product> products = productRepository.findAll();
        for (Product product : products) {
            // TODO: Implement actual price fetching logic
            double newPrice = fetchNewPriceForProduct(product);
            savePriceLog(product, newPrice);
        }
    }
    
    private double fetchNewPriceForProduct(Product product) {
        // TODO: Implement actual price fetching logic
        return 0.0; // Placeholder
    }
    
    private void savePriceLog(Product product, double price) {
        PriceLog priceLog = new PriceLog();
        priceLog.setProduct(product);
        priceLog.setPrice(price);
        priceLog.setTimestamp(LocalDateTime.now());
        priceLogRepository.save(priceLog);
    }
}
