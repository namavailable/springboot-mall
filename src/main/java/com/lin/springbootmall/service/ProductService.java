package com.lin.springbootmall.service;

import com.lin.springbootmall.dto.ProductRequest;
import com.lin.springbootmall.model.Product;

import java.util.List;

public interface ProductService {
    Product  getProductById(Integer productId);

    Integer createProduct(ProductRequest productRequest);
    void updateProduct(Integer productId,ProductRequest productRequest);
    void deleteProductById(Integer productId);
    List<Product> getProducts();
}
