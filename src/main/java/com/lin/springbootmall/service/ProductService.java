package com.lin.springbootmall.service;

import com.lin.springbootmall.dto.ProductRequest;
import com.lin.springbootmall.model.Product;

public interface ProductService {
    Product  getProductById(Integer productId);

    Integer createProduct(ProductRequest productRequest);

}
