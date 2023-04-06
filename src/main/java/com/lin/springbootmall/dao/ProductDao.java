package com.lin.springbootmall.dao;

import com.lin.springbootmall.dto.ProductRequest;
import com.lin.springbootmall.model.Product;

import java.util.List;

public interface ProductDao {
    Product getProductById(Integer productId);

    Integer createProduct(ProductRequest productRequest);
    void updateProduct(Integer productId, ProductRequest productRequest);
    void deleteProductById(Integer productId);
    List<Product> getProducts();
}
