package ru.timka.diplomishe.repository;

import ru.timka.diplomishe.model.Product;
import java.util.*;

public class ProductRepository {
    private final Map<String, List<Product>> storeProductsMap;

    public ProductRepository() {
        this.storeProductsMap = new HashMap<>();
        initializeProducts();
    }

    private void initializeProducts() {
        // Загрузка данных из моковых генераторов
        storeProductsMap.put("Ozon", OzonMockProducts.generate());
        storeProductsMap.put("Wildberries", MockWildberriesProducts.generate());
        storeProductsMap.put("Яндекс.Маркет", MockYandexMarketProducts.generate());
    }

    public List<Product> getProductsByStore(String store) {
        return storeProductsMap.getOrDefault(store, Collections.emptyList());
    }

    public List<String> getAllStores() {
        return new ArrayList<>(storeProductsMap.keySet());
    }
}